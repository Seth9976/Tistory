package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.UserManagerCompat;
import androidx.core.util.Consumer;
import androidx.core.view.c2;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.WorkInfo.State;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabasePathHelper;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestrictTo({Scope.LIBRARY_GROUP})
public class ForceStopRunnable implements Runnable {
    @RestrictTo({Scope.LIBRARY_GROUP})
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        public static final String a;

        static {
            BroadcastReceiver.a = "WM-ForceStopRunnable$Rc";
        }

        @Override  // android.content.BroadcastReceiver
        public void onReceive(@NonNull Context context0, @Nullable Intent intent0) {
            if(intent0 != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent0.getAction())) {
                Logger.get().verbose("WM-ForceStopRunnable$Rc", "Rescheduling alarm that keeps track of force-stops.");
                ForceStopRunnable.a(context0);
            }
        }
    }

    public final Context a;
    public final WorkManagerImpl b;
    public final PreferenceUtils c;
    public int d;
    public static final String e;
    public static final long f;

    static {
        ForceStopRunnable.e = "WM-ForceStopRunnable";
        ForceStopRunnable.f = TimeUnit.DAYS.toMillis(3650L);
    }

    public ForceStopRunnable(@NonNull Context context0, @NonNull WorkManagerImpl workManagerImpl0) {
        this.a = context0.getApplicationContext();
        this.b = workManagerImpl0;
        this.c = workManagerImpl0.getPreferenceUtils();
        this.d = 0;
    }

    public static void a(Context context0) {
        AlarmManager alarmManager0 = (AlarmManager)context0.getSystemService("alarm");
        int v = Build.VERSION.SDK_INT < 0x1F ? 0x8000000 : 0xA000000;
        Intent intent0 = new Intent();
        intent0.setComponent(new ComponentName(context0, BroadcastReceiver.class));
        intent0.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent pendingIntent0 = PendingIntent.getBroadcast(context0, -1, intent0, v);
        long v1 = System.currentTimeMillis() + ForceStopRunnable.f;
        if(alarmManager0 != null) {
            alarmManager0.setExact(0, v1, pendingIntent0);
        }
    }

    @VisibleForTesting
    public boolean cleanUp() {
        boolean z = SystemJobScheduler.reconcileJobs(this.a, this.b.getWorkDatabase());
        WorkDatabase workDatabase0 = this.b.getWorkDatabase();
        WorkSpecDao workSpecDao0 = workDatabase0.workSpecDao();
        WorkProgressDao workProgressDao0 = workDatabase0.workProgressDao();
        workDatabase0.beginTransaction();
        try {
            List list0 = workSpecDao0.getRunningWork();
            boolean z1 = list0 != null && !list0.isEmpty();
            if(z1) {
                for(Object object0: list0) {
                    workSpecDao0.setState(State.ENQUEUED, ((WorkSpec)object0).id);
                    workSpecDao0.setStopReason(((WorkSpec)object0).id, 0xFFFFFE00);
                    workSpecDao0.markWorkSpecScheduled(((WorkSpec)object0).id, -1L);
                }
            }
            workProgressDao0.deleteAll();
            workDatabase0.setTransactionSuccessful();
            return z1 || z;
        }
        finally {
            workDatabase0.endTransaction();
        }
    }

    @VisibleForTesting
    public void forceStopRunnable() {
        boolean z = this.cleanUp();
        boolean z1 = this.shouldRescheduleWorkers();
        WorkManagerImpl workManagerImpl0 = this.b;
        if(z1) {
            Logger.get().debug("WM-ForceStopRunnable", "Rescheduling Workers.");
            workManagerImpl0.rescheduleEligibleWork();
            workManagerImpl0.getPreferenceUtils().setNeedsReschedule(false);
            return;
        }
        if(this.isForceStopped()) {
            Logger.get().debug("WM-ForceStopRunnable", "Application was force-stopped, rescheduling.");
            workManagerImpl0.rescheduleEligibleWork();
            long v = workManagerImpl0.getConfiguration().getClock().currentTimeMillis();
            this.c.setLastForceStopEventMillis(v);
            return;
        }
        if(z) {
            Logger.get().debug("WM-ForceStopRunnable", "Found unfinished work, scheduling it.");
            Schedulers.schedule(workManagerImpl0.getConfiguration(), workManagerImpl0.getWorkDatabase(), workManagerImpl0.getSchedulers());
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    @VisibleForTesting
    public boolean isForceStopped() {
        try {
            Context context0 = this.a;
            int v = Build.VERSION.SDK_INT;
            Intent intent0 = new Intent();
            intent0.setComponent(new ComponentName(context0, BroadcastReceiver.class));
            intent0.setAction("ACTION_FORCE_STOP_RESCHEDULE");
            PendingIntent pendingIntent0 = PendingIntent.getBroadcast(context0, -1, intent0, (v < 0x1F ? 0x20000000 : 0x22000000));
            if(v < 30) {
                if(pendingIntent0 != null) {
                    return false;
                }
                ForceStopRunnable.a(context0);
                return true;
            }
            if(pendingIntent0 != null) {
                pendingIntent0.cancel();
            }
            List list0 = c2.m(((ActivityManager)context0.getSystemService("activity")));
            if(list0 == null || list0.isEmpty()) {
                return false;
            }
            long v1 = this.c.getLastForceStopEventMillis();
            for(int v2 = 0; true; ++v2) {
                if(v2 >= list0.size()) {
                    return false;
                }
                ApplicationExitInfo applicationExitInfo0 = c2.d(list0.get(v2));
                if(applicationExitInfo0.getReason() == 10 && applicationExitInfo0.getTimestamp() >= v1) {
                    return true;
                }
            }
        }
        catch(SecurityException | IllegalArgumentException securityException0) {
        }
        Logger.get().warning("WM-ForceStopRunnable", "Ignoring exception", securityException0);
        return true;
    }

    @VisibleForTesting
    public boolean multiProcessChecks() {
        Configuration configuration0 = this.b.getConfiguration();
        if(TextUtils.isEmpty(configuration0.getDefaultProcessName())) {
            Logger.get().debug("WM-ForceStopRunnable", "The default process name was not specified.");
            return true;
        }
        boolean z = ProcessUtils.isDefaultProcess(this.a, configuration0);
        Logger.get().debug("WM-ForceStopRunnable", "Is default app process = " + z);
        return z;
    }

    @Override
    public void run() {
        WorkManagerImpl workManagerImpl0;
        try {
            Context context0 = this.a;
            workManagerImpl0 = this.b;
            if(!this.multiProcessChecks()) {
                return;
            }
            while(true) {
                try {
                    WorkDatabasePathHelper.migrateDatabase(context0);
                }
                catch(SQLiteException sQLiteException0) {
                    Logger.get().error("WM-ForceStopRunnable", "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException0 = new IllegalStateException("Unexpected SQLite exception during migrations", sQLiteException0);
                    Consumer consumer0 = workManagerImpl0.getConfiguration().getInitializationExceptionHandler();
                    if(consumer0 == null) {
                        throw illegalStateException0;
                    }
                    consumer0.accept(illegalStateException0);
                    break;
                }
                Logger.get().debug("WM-ForceStopRunnable", "Performing cleanup operations.");
                try {
                    this.forceStopRunnable();
                    break;
                }
                catch(SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException | SQLiteConstraintException | SQLiteAccessPermException sQLiteCantOpenDatabaseException0) {
                    int v1 = this.d + 1;
                    this.d = v1;
                    if(v1 >= 3) {
                        String s = UserManagerCompat.isUserUnlocked(context0) ? "The file system on the device is in a bad state. WorkManager cannot access the app\'s internal data store." : "WorkManager can\'t be accessed from direct boot, because credential encrypted storage isn\'t accessible.\nDon\'t access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                        Logger.get().error("WM-ForceStopRunnable", s, sQLiteCantOpenDatabaseException0);
                        IllegalStateException illegalStateException1 = new IllegalStateException(s, sQLiteCantOpenDatabaseException0);
                        Consumer consumer1 = workManagerImpl0.getConfiguration().getInitializationExceptionHandler();
                        if(consumer1 == null) {
                            throw illegalStateException1;
                        }
                        Logger.get().debug("WM-ForceStopRunnable", "Routing exception to the specified exception handler", illegalStateException1);
                        consumer1.accept(illegalStateException1);
                        break;
                    }
                    Logger.get().debug("WM-ForceStopRunnable", "Retrying after " + ((long)v1) * 300L, sQLiteCantOpenDatabaseException0);
                    this.sleep(((long)this.d) * 300L);
                }
            }
        }
        finally {
            workManagerImpl0.onForceStopRunnableCompleted();
        }
    }

    @VisibleForTesting
    public boolean shouldRescheduleWorkers() {
        return this.b.getPreferenceUtils().getNeedsReschedule();
    }

    @VisibleForTesting
    public void sleep(long v) {
        try {
            Thread.sleep(v);
        }
        catch(InterruptedException unused_ex) {
        }
    }
}

