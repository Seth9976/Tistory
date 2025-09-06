package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo.Builder;
import android.app.job.JobInfo.TriggerContentUri;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest.Builder;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Consumer;
import androidx.work.BackoffPolicy;
import androidx.work.Configuration;
import androidx.work.Constraints.ContentUriTrigger;
import androidx.work.Constraints;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo.State;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoKt;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.IdGenerator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

@RequiresApi(23)
@RestrictTo({Scope.LIBRARY_GROUP})
public class SystemJobScheduler implements Scheduler {
    public final Context a;
    public final JobScheduler b;
    public final c c;
    public final WorkDatabase d;
    public final Configuration e;
    public static final String f;

    static {
        SystemJobScheduler.f = "WM-SystemJobScheduler";
    }

    public SystemJobScheduler(@NonNull Context context0, @NonNull WorkDatabase workDatabase0, @NonNull Configuration configuration0) {
        this(context0, workDatabase0, configuration0, ((JobScheduler)context0.getSystemService("jobscheduler")), new c(context0, configuration0.getClock()));
    }

    @VisibleForTesting
    public SystemJobScheduler(@NonNull Context context0, @NonNull WorkDatabase workDatabase0, @NonNull Configuration configuration0, @NonNull JobScheduler jobScheduler0, @NonNull c c0) {
        this.a = context0;
        this.b = jobScheduler0;
        this.c = c0;
        this.d = workDatabase0;
        this.e = configuration0;
    }

    public static void a(JobScheduler jobScheduler0, int v) {
        try {
            jobScheduler0.cancel(v);
        }
        catch(Throwable throwable0) {
            Logger.get().error("WM-SystemJobScheduler", String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", v), throwable0);
        }
    }

    public static ArrayList b(Context context0, JobScheduler jobScheduler0) {
        List list0;
        try {
            list0 = jobScheduler0.getAllPendingJobs();
        }
        catch(Throwable throwable0) {
            Logger.get().error("WM-SystemJobScheduler", "getAllPendingJobs() is not reliable on this device.", throwable0);
            list0 = null;
        }
        if(list0 == null) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList(list0.size());
        ComponentName componentName0 = new ComponentName(context0, SystemJobService.class);
        for(Object object0: list0) {
            JobInfo jobInfo0 = (JobInfo)object0;
            if(componentName0.equals(jobInfo0.getService())) {
                arrayList0.add(jobInfo0);
            }
        }
        return arrayList0;
    }

    public static WorkGenerationalId c(JobInfo jobInfo0) {
        PersistableBundle persistableBundle0 = jobInfo0.getExtras();
        if(persistableBundle0 != null) {
            try {
                if(persistableBundle0.containsKey("EXTRA_WORK_SPEC_ID")) {
                    int v = persistableBundle0.getInt("EXTRA_WORK_SPEC_GENERATION", 0);
                    return new WorkGenerationalId(persistableBundle0.getString("EXTRA_WORK_SPEC_ID"), v);
                }
                return null;
            }
            catch(NullPointerException unused_ex) {
            }
        }
        return null;
    }

    @Override  // androidx.work.impl.Scheduler
    public void cancel(@NonNull String s) {
        ArrayList arrayList1;
        JobScheduler jobScheduler0 = this.b;
        ArrayList arrayList0 = SystemJobScheduler.b(this.a, jobScheduler0);
        if(arrayList0 == null) {
            arrayList1 = null;
        }
        else {
            ArrayList arrayList2 = new ArrayList(2);
            for(Object object0: arrayList0) {
                JobInfo jobInfo0 = (JobInfo)object0;
                WorkGenerationalId workGenerationalId0 = SystemJobScheduler.c(jobInfo0);
                if(workGenerationalId0 != null && s.equals(workGenerationalId0.getWorkSpecId())) {
                    arrayList2.add(jobInfo0.getId());
                }
            }
            arrayList1 = arrayList2;
        }
        if(arrayList1 != null && !arrayList1.isEmpty()) {
            for(Object object1: arrayList1) {
                SystemJobScheduler.a(jobScheduler0, ((int)(((Integer)object1))));
            }
            this.d.systemIdInfoDao().removeSystemIdInfo(s);
        }
    }

    public static void cancelAll(@NonNull Context context0) {
        JobScheduler jobScheduler0 = (JobScheduler)context0.getSystemService("jobscheduler");
        if(jobScheduler0 != null) {
            ArrayList arrayList0 = SystemJobScheduler.b(context0, jobScheduler0);
            if(arrayList0 != null && !arrayList0.isEmpty()) {
                for(Object object0: arrayList0) {
                    SystemJobScheduler.a(jobScheduler0, ((JobInfo)object0).getId());
                }
            }
        }
    }

    @Override  // androidx.work.impl.Scheduler
    public boolean hasLimitedSchedulingSlots() {
        return true;
    }

    public static boolean reconcileJobs(@NonNull Context context0, @NonNull WorkDatabase workDatabase0) {
        JobScheduler jobScheduler0 = (JobScheduler)context0.getSystemService("jobscheduler");
        ArrayList arrayList0 = SystemJobScheduler.b(context0, jobScheduler0);
        List list0 = workDatabase0.systemIdInfoDao().getWorkSpecIds();
        boolean z = false;
        HashSet hashSet0 = new HashSet((arrayList0 == null ? 0 : arrayList0.size()));
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            for(Object object0: arrayList0) {
                JobInfo jobInfo0 = (JobInfo)object0;
                WorkGenerationalId workGenerationalId0 = SystemJobScheduler.c(jobInfo0);
                if(workGenerationalId0 == null) {
                    SystemJobScheduler.a(jobScheduler0, jobInfo0.getId());
                }
                else {
                    hashSet0.add(workGenerationalId0.getWorkSpecId());
                }
            }
        }
        for(Object object1: list0) {
            if(!hashSet0.contains(((String)object1))) {
                Logger.get().debug("WM-SystemJobScheduler", "Reconciling jobs");
                z = true;
                break;
            }
            if(false) {
                break;
            }
        }
        if(z) {
            workDatabase0.beginTransaction();
            try {
                WorkSpecDao workSpecDao0 = workDatabase0.workSpecDao();
                for(Object object2: list0) {
                    workSpecDao0.markWorkSpecScheduled(((String)object2), -1L);
                }
                workDatabase0.setTransactionSuccessful();
                return true;
            }
            finally {
                workDatabase0.endTransaction();
            }
        }
        return false;
    }

    @Override  // androidx.work.impl.Scheduler
    public void schedule(@NonNull WorkSpec[] arr_workSpec) {
        Configuration configuration0 = this.e;
        WorkDatabase workDatabase0 = this.d;
        IdGenerator idGenerator0 = new IdGenerator(workDatabase0);
        for(int v = 0; v < arr_workSpec.length; ++v) {
            WorkSpec workSpec0 = arr_workSpec[v];
            workDatabase0.beginTransaction();
            try {
                WorkSpec workSpec1 = workDatabase0.workSpecDao().getWorkSpec(workSpec0.id);
                if(workSpec1 == null) {
                    Logger.get().warning("WM-SystemJobScheduler", "Skipping scheduling " + workSpec0.id + " because it\'s no longer in the DB");
                }
                else if(workSpec1.state == State.ENQUEUED) {
                    WorkGenerationalId workGenerationalId0 = WorkSpecKt.generationalId(workSpec0);
                    SystemIdInfo systemIdInfo0 = workDatabase0.systemIdInfoDao().getSystemIdInfo(workGenerationalId0);
                    int v2 = systemIdInfo0 == null ? idGenerator0.nextJobSchedulerIdWithRange(configuration0.getMinJobSchedulerId(), configuration0.getMaxJobSchedulerId()) : systemIdInfo0.systemId;
                    if(systemIdInfo0 == null) {
                        SystemIdInfo systemIdInfo1 = SystemIdInfoKt.systemIdInfo(workGenerationalId0, v2);
                        workDatabase0.systemIdInfoDao().insertSystemIdInfo(systemIdInfo1);
                    }
                    this.scheduleInternal(workSpec0, v2);
                }
                else {
                    Logger.get().warning("WM-SystemJobScheduler", "Skipping scheduling " + workSpec0.id + " because it is no longer enqueued");
                }
                workDatabase0.setTransactionSuccessful();
            }
            finally {
                workDatabase0.endTransaction();
            }
        }
    }

    @VisibleForTesting
    public void scheduleInternal(@NonNull WorkSpec workSpec0, int v) {
        JobScheduler jobScheduler0 = this.b;
        c c0 = this.c;
        c0.getClass();
        Constraints constraints0 = workSpec0.constraints;
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putString("EXTRA_WORK_SPEC_ID", workSpec0.id);
        persistableBundle0.putInt("EXTRA_WORK_SPEC_GENERATION", workSpec0.getGeneration());
        persistableBundle0.putBoolean("EXTRA_IS_PERIODIC", workSpec0.isPeriodic());
        JobInfo.Builder jobInfo$Builder0 = new JobInfo.Builder(v, c0.a).setRequiresCharging(constraints0.requiresCharging()).setRequiresDeviceIdle(constraints0.requiresDeviceIdle()).setExtras(persistableBundle0);
        NetworkType networkType0 = constraints0.getRequiredNetworkType();
        int v1 = Build.VERSION.SDK_INT;
        int v2 = 0;
        boolean z = true;
        if(v1 < 30 || networkType0 != NetworkType.TEMPORARILY_UNMETERED) {
            int v3 = 2;
            int v4 = b.a[networkType0.ordinal()];
            switch(v4) {
                case 1: {
                    v3 = 0;
                    break;
                }
                case 2: {
                    v3 = 1;
                    break;
                }
                case 3: {
                    break;
                }
                default: {
                    if(v4 == 4) {
                        v3 = 3;
                    }
                    else if(v4 != 5) {
                        Logger.get().debug("WM-SystemJobInfoConvert", "API version too low. Cannot convert network type value " + networkType0);
                        v3 = 1;
                    }
                }
            }
            jobInfo$Builder0.setRequiredNetworkType(v3);
        }
        else {
            jobInfo$Builder0.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if(!constraints0.requiresDeviceIdle()) {
            jobInfo$Builder0.setBackoffCriteria(workSpec0.backoffDelayDuration, (workSpec0.backoffPolicy == BackoffPolicy.LINEAR ? 0 : 1));
        }
        long v5 = Math.max(workSpec0.calculateNextRunTime() - c0.b.currentTimeMillis(), 0L);
        if(v1 <= 28) {
            jobInfo$Builder0.setMinimumLatency(v5);
        }
        else if(v5 > 0L) {
            jobInfo$Builder0.setMinimumLatency(v5);
        }
        else if(!workSpec0.expedited) {
            a.q(jobInfo$Builder0);
        }
        if(constraints0.hasContentUriTriggers()) {
            for(Object object0: constraints0.getContentUriTriggers()) {
                jobInfo$Builder0.addTriggerContentUri(new JobInfo.TriggerContentUri(((ContentUriTrigger)object0).getUri(), ((int)((ContentUriTrigger)object0).isTriggeredForDescendants())));
            }
            jobInfo$Builder0.setTriggerContentUpdateDelay(constraints0.getContentTriggerUpdateDelayMillis());
            jobInfo$Builder0.setTriggerContentMaxDelay(constraints0.getContentTriggerMaxDelayMillis());
        }
        jobInfo$Builder0.setPersisted(false);
        int v6 = Build.VERSION.SDK_INT;
        jobInfo$Builder0.setRequiresBatteryNotLow(constraints0.requiresBatteryNotLow());
        jobInfo$Builder0.setRequiresStorageNotLow(constraints0.requiresStorageNotLow());
        boolean z1 = workSpec0.runAttemptCount > 0;
        if(v5 <= 0L) {
            z = false;
        }
        if(v6 >= 0x1F && workSpec0.expedited && !z1 && !z) {
            androidx.compose.ui.platform.a.r(jobInfo$Builder0);
        }
        JobInfo jobInfo0 = jobInfo$Builder0.build();
        Logger.get().debug("WM-SystemJobScheduler", "Scheduling work ID " + workSpec0.id + "Job ID " + v);
        try {
            if(jobScheduler0.schedule(jobInfo0) == 0) {
                Logger.get().warning("WM-SystemJobScheduler", "Unable to schedule work ID " + workSpec0.id);
                if(workSpec0.expedited && workSpec0.outOfQuotaPolicy == OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    workSpec0.expedited = false;
                    Logger.get().debug("WM-SystemJobScheduler", "Scheduling a non-expedited job (work ID " + workSpec0.id + ")");
                    this.scheduleInternal(workSpec0, v);
                }
            }
        }
        catch(IllegalStateException illegalStateException0) {
            ArrayList arrayList0 = SystemJobScheduler.b(this.a, jobScheduler0);
            if(arrayList0 != null) {
                v2 = arrayList0.size();
            }
            String s = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", v2, this.d.workSpecDao().getScheduledWork().size(), this.e.getMaxSchedulerLimit());
            Logger.get().error("WM-SystemJobScheduler", s);
            IllegalStateException illegalStateException1 = new IllegalStateException(s, illegalStateException0);
            Consumer consumer0 = this.e.getSchedulingExceptionHandler();
            if(consumer0 == null) {
                throw illegalStateException1;
            }
            consumer0.accept(illegalStateException1);
        }
        catch(Throwable throwable0) {
            Logger.get().error("WM-SystemJobScheduler", "Unable to schedule " + workSpec0, throwable0);
        }
    }
}

