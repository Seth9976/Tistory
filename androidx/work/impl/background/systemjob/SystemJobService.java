package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.WorkerParameters.RuntimeExtras;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkLauncherImpl;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkGenerationalId;
import java.util.Arrays;
import java.util.HashMap;

@RequiresApi(23)
@RestrictTo({Scope.LIBRARY_GROUP})
public class SystemJobService extends JobService implements ExecutionListener {
    public WorkManagerImpl a;
    public final HashMap b;
    public final StartStopTokens c;
    public WorkLauncherImpl d;
    public static final String e;

    static {
        SystemJobService.e = "WM-SystemJobService";
    }

    public SystemJobService() {
        this.b = new HashMap();
        this.c = new StartStopTokens();
    }

    public static WorkGenerationalId a(JobParameters jobParameters0) {
        try {
            PersistableBundle persistableBundle0 = jobParameters0.getExtras();
            return persistableBundle0 == null || !persistableBundle0.containsKey("EXTRA_WORK_SPEC_ID") ? null : new WorkGenerationalId(persistableBundle0.getString("EXTRA_WORK_SPEC_ID"), persistableBundle0.getInt("EXTRA_WORK_SPEC_GENERATION"));
        }
        catch(NullPointerException unused_ex) {
        }
        return null;
    }

    @Override  // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            WorkManagerImpl workManagerImpl0 = WorkManagerImpl.getInstance(this.getApplicationContext());
            this.a = workManagerImpl0;
            Processor processor0 = workManagerImpl0.getProcessor();
            this.d = new WorkLauncherImpl(processor0, this.a.getWorkTaskExecutor());
            processor0.addExecutionListener(this);
        }
        catch(IllegalStateException illegalStateException0) {
            Class class0 = this.getApplication().getClass();
            if(!Application.class.equals(class0)) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", illegalStateException0);
            }
            Logger.get().warning("WM-SystemJobService", "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override  // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        WorkManagerImpl workManagerImpl0 = this.a;
        if(workManagerImpl0 != null) {
            workManagerImpl0.getProcessor().removeExecutionListener(this);
        }
    }

    @Override  // androidx.work.impl.ExecutionListener
    public void onExecuted(@NonNull WorkGenerationalId workGenerationalId0, boolean z) {
        JobParameters jobParameters0;
        Logger.get().debug("WM-SystemJobService", workGenerationalId0.getWorkSpecId() + " executed on JobScheduler");
        synchronized(this.b) {
            jobParameters0 = (JobParameters)this.b.remove(workGenerationalId0);
        }
        this.c.remove(workGenerationalId0);
        if(jobParameters0 != null) {
            this.jobFinished(jobParameters0, z);
        }
    }

    @Override  // android.app.job.JobService
    public boolean onStartJob(@NonNull JobParameters jobParameters0) {
        if(this.a == null) {
            Logger.get().debug("WM-SystemJobService", "WorkManager is not initialized; requesting retry.");
            this.jobFinished(jobParameters0, true);
            return false;
        }
        WorkGenerationalId workGenerationalId0 = SystemJobService.a(jobParameters0);
        if(workGenerationalId0 == null) {
            Logger.get().error("WM-SystemJobService", "WorkSpec id not found!");
            return false;
        }
        synchronized(this.b) {
            if(this.b.containsKey(workGenerationalId0)) {
                Logger.get().debug("WM-SystemJobService", "Job is already being executed by SystemJobService: " + workGenerationalId0);
                return false;
            }
            Logger.get().debug("WM-SystemJobService", "onStartJob for " + workGenerationalId0);
            this.b.put(workGenerationalId0, jobParameters0);
        }
        int v1 = Build.VERSION.SDK_INT;
        RuntimeExtras workerParameters$RuntimeExtras0 = new RuntimeExtras();
        if(d.b(jobParameters0) != null) {
            workerParameters$RuntimeExtras0.triggeredContentUris = Arrays.asList(d.b(jobParameters0));
        }
        if(d.a(jobParameters0) != null) {
            workerParameters$RuntimeExtras0.triggeredContentAuthorities = Arrays.asList(d.a(jobParameters0));
        }
        if(v1 >= 28) {
            workerParameters$RuntimeExtras0.network = e.a(jobParameters0);
        }
        this.d.startWork(this.c.tokenFor(workGenerationalId0), workerParameters$RuntimeExtras0);
        return true;
    }

    @Override  // android.app.job.JobService
    public boolean onStopJob(@NonNull JobParameters jobParameters0) {
        if(this.a == null) {
            Logger.get().debug("WM-SystemJobService", "WorkManager is not initialized; requesting retry.");
            return true;
        }
        WorkGenerationalId workGenerationalId0 = SystemJobService.a(jobParameters0);
        if(workGenerationalId0 == null) {
            Logger.get().error("WM-SystemJobService", "WorkSpec id not found!");
            return false;
        }
        Logger.get().debug("WM-SystemJobService", "onStopJob for " + workGenerationalId0);
        synchronized(this.b) {
            this.b.remove(workGenerationalId0);
        }
        StartStopToken startStopToken0 = this.c.remove(workGenerationalId0);
        if(startStopToken0 != null) {
            int v1 = Build.VERSION.SDK_INT < 0x1F ? 0xFFFFFE00 : f.a(jobParameters0);
            this.d.stopWorkWithReason(startStopToken0, v1);
        }
        return !this.a.getProcessor().isCancelled(workGenerationalId0.getWorkSpecId());
    }
}

