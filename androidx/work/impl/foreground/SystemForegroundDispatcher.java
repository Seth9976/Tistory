package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.ForegroundInfo;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.ConstraintsState.ConstraintsNotMet;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import kotlinx.coroutines.Job;
import wb.a;

@RestrictTo({Scope.LIBRARY_GROUP})
public class SystemForegroundDispatcher implements ExecutionListener, OnConstraintsStateChangedListener {
    interface Callback {
        void cancelNotification(int arg1);

        void notify(int arg1, @NonNull Notification arg2);

        void startForeground(int arg1, int arg2, @NonNull Notification arg3);

        void stop();
    }

    public final WorkManagerImpl a;
    public final TaskExecutor b;
    public final Object c;
    public WorkGenerationalId d;
    public final LinkedHashMap e;
    public final HashMap f;
    public final HashMap g;
    public final WorkConstraintsTracker h;
    public SystemForegroundService i;
    public static final String j;

    static {
        SystemForegroundDispatcher.j = "WM-SystemFgDispatcher";
    }

    public SystemForegroundDispatcher(Context context0) {
        this.c = new Object();
        WorkManagerImpl workManagerImpl0 = WorkManagerImpl.getInstance(context0);
        this.a = workManagerImpl0;
        this.b = workManagerImpl0.getWorkTaskExecutor();
        this.d = null;
        this.e = new LinkedHashMap();
        this.g = new HashMap();
        this.f = new HashMap();
        this.h = new WorkConstraintsTracker(workManagerImpl0.getTrackers());
        workManagerImpl0.getProcessor().addExecutionListener(this);
    }

    public final void a(Intent intent0) {
        int v = 0;
        int v1 = intent0.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int v2 = intent0.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String s = intent0.getStringExtra("KEY_WORKSPEC_ID");
        WorkGenerationalId workGenerationalId0 = new WorkGenerationalId(s, intent0.getIntExtra("KEY_GENERATION", 0));
        Notification notification0 = (Notification)intent0.getParcelableExtra("KEY_NOTIFICATION");
        Logger logger0 = Logger.get();
        StringBuilder stringBuilder0 = new StringBuilder("Notifying with (id:");
        stringBuilder0.append(v1);
        stringBuilder0.append(", workSpecId: ");
        stringBuilder0.append(s);
        stringBuilder0.append(", notificationType :");
        logger0.debug("WM-SystemFgDispatcher", a.c(v2, ")", stringBuilder0));
        if(notification0 != null && this.i != null) {
            ForegroundInfo foregroundInfo0 = new ForegroundInfo(v1, notification0, v2);
            LinkedHashMap linkedHashMap0 = this.e;
            linkedHashMap0.put(workGenerationalId0, foregroundInfo0);
            if(this.d == null) {
                this.d = workGenerationalId0;
                this.i.startForeground(v1, v2, notification0);
                return;
            }
            this.i.notify(v1, notification0);
            if(v2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for(Object object0: linkedHashMap0.entrySet()) {
                    v |= ((ForegroundInfo)((Map.Entry)object0).getValue()).getForegroundServiceType();
                }
                ForegroundInfo foregroundInfo1 = (ForegroundInfo)linkedHashMap0.get(this.d);
                if(foregroundInfo1 != null) {
                    this.i.startForeground(foregroundInfo1.getNotificationId(), v, foregroundInfo1.getNotification());
                }
            }
        }
    }

    public final void b() {
        this.i = null;
        synchronized(this.c) {
            for(Object object1: this.g.values()) {
                ((Job)object1).cancel(null);
            }
        }
        this.a.getProcessor().removeExecutionListener(this);
    }

    @NonNull
    public static Intent createCancelWorkIntent(@NonNull Context context0, @NonNull String s) {
        Intent intent0 = new Intent(context0, SystemForegroundService.class);
        intent0.setAction("ACTION_CANCEL_WORK");
        intent0.setData(Uri.parse(("workspec://" + s)));
        intent0.putExtra("KEY_WORKSPEC_ID", s);
        return intent0;
    }

    @NonNull
    public static Intent createNotifyIntent(@NonNull Context context0, @NonNull WorkGenerationalId workGenerationalId0, @NonNull ForegroundInfo foregroundInfo0) {
        Intent intent0 = new Intent(context0, SystemForegroundService.class);
        intent0.setAction("ACTION_NOTIFY");
        intent0.putExtra("KEY_NOTIFICATION_ID", foregroundInfo0.getNotificationId());
        intent0.putExtra("KEY_FOREGROUND_SERVICE_TYPE", foregroundInfo0.getForegroundServiceType());
        intent0.putExtra("KEY_NOTIFICATION", foregroundInfo0.getNotification());
        intent0.putExtra("KEY_WORKSPEC_ID", workGenerationalId0.getWorkSpecId());
        intent0.putExtra("KEY_GENERATION", workGenerationalId0.getGeneration());
        return intent0;
    }

    @NonNull
    public static Intent createStartForegroundIntent(@NonNull Context context0, @NonNull WorkGenerationalId workGenerationalId0, @NonNull ForegroundInfo foregroundInfo0) {
        Intent intent0 = new Intent(context0, SystemForegroundService.class);
        intent0.setAction("ACTION_START_FOREGROUND");
        intent0.putExtra("KEY_WORKSPEC_ID", workGenerationalId0.getWorkSpecId());
        intent0.putExtra("KEY_GENERATION", workGenerationalId0.getGeneration());
        intent0.putExtra("KEY_NOTIFICATION_ID", foregroundInfo0.getNotificationId());
        intent0.putExtra("KEY_FOREGROUND_SERVICE_TYPE", foregroundInfo0.getForegroundServiceType());
        intent0.putExtra("KEY_NOTIFICATION", foregroundInfo0.getNotification());
        return intent0;
    }

    @NonNull
    public static Intent createStopForegroundIntent(@NonNull Context context0) {
        Intent intent0 = new Intent(context0, SystemForegroundService.class);
        intent0.setAction("ACTION_STOP_FOREGROUND");
        return intent0;
    }

    @Override  // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public void onConstraintsStateChanged(@NonNull WorkSpec workSpec0, @NonNull ConstraintsState constraintsState0) {
        if(constraintsState0 instanceof ConstraintsNotMet) {
            Logger.get().debug("WM-SystemFgDispatcher", "Constraints unmet for WorkSpec " + workSpec0.id);
            WorkGenerationalId workGenerationalId0 = WorkSpecKt.generationalId(workSpec0);
            this.a.stopForegroundWork(workGenerationalId0);
        }
    }

    @Override  // androidx.work.impl.ExecutionListener
    @MainThread
    public void onExecuted(@NonNull WorkGenerationalId workGenerationalId0, boolean z) {
        synchronized(this.c) {
            Job job0 = ((WorkSpec)this.f.remove(workGenerationalId0)) == null ? null : ((Job)this.g.remove(workGenerationalId0));
            if(job0 != null) {
                job0.cancel(null);
            }
        }
        ForegroundInfo foregroundInfo0 = (ForegroundInfo)this.e.remove(workGenerationalId0);
        if(workGenerationalId0.equals(this.d)) {
            if(this.e.size() > 0) {
                Iterator iterator0 = this.e.entrySet().iterator();
                Object object1 = iterator0.next();
                Map.Entry map$Entry0;
                for(map$Entry0 = (Map.Entry)object1; iterator0.hasNext(); map$Entry0 = (Map.Entry)object2) {
                    Object object2 = iterator0.next();
                }
                this.d = (WorkGenerationalId)map$Entry0.getKey();
                if(this.i != null) {
                    ForegroundInfo foregroundInfo1 = (ForegroundInfo)map$Entry0.getValue();
                    this.i.startForeground(foregroundInfo1.getNotificationId(), foregroundInfo1.getForegroundServiceType(), foregroundInfo1.getNotification());
                    this.i.cancelNotification(foregroundInfo1.getNotificationId());
                }
            }
            else {
                this.d = null;
            }
        }
        SystemForegroundService systemForegroundService0 = this.i;
        if(foregroundInfo0 != null && systemForegroundService0 != null) {
            Logger.get().debug("WM-SystemFgDispatcher", "Removing Notification (id: " + foregroundInfo0.getNotificationId() + ", workSpecId: " + workGenerationalId0 + ", notificationType: " + foregroundInfo0.getForegroundServiceType());
            systemForegroundService0.cancelNotification(foregroundInfo0.getNotificationId());
        }
    }
}

