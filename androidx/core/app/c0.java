package androidx.core.app;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.os.AsyncTask;
import android.os.IBinder;

public final class c0 extends JobServiceEngine implements CompatJobEngine {
    public final JobIntentService a;
    public final Object b;
    public JobParameters c;

    public c0(JobIntentService jobIntentService0) {
        super(jobIntentService0);
        this.b = new Object();
        this.a = jobIntentService0;
    }

    @Override  // androidx.core.app.JobIntentService$CompatJobEngine
    public final IBinder compatGetBinder() {
        return this.getBinder();
    }

    @Override  // androidx.core.app.JobIntentService$CompatJobEngine
    public final GenericWorkItem dequeueWork() {
        JobWorkItem jobWorkItem0;
        synchronized(this.b) {
            JobParameters jobParameters0 = this.c;
            if(jobParameters0 == null) {
                return null;
            }
            jobWorkItem0 = jobParameters0.dequeueWork();
        }
        if(jobWorkItem0 != null) {
            jobWorkItem0.getIntent().setExtrasClassLoader(this.a.getClassLoader());
            return new b0(this, jobWorkItem0);
        }
        return null;
    }

    @Override  // android.app.job.JobServiceEngine
    public final boolean onStartJob(JobParameters jobParameters0) {
        this.c = jobParameters0;
        JobIntentService jobIntentService0 = this.a;
        if(jobIntentService0.b == null) {
            a0 a00 = new a0(jobIntentService0);
            jobIntentService0.b = a00;
            a00.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
        return true;
    }

    @Override  // android.app.job.JobServiceEngine
    public final boolean onStopJob(JobParameters jobParameters0) {
        JobIntentService jobIntentService0 = this.a;
        a0 a00 = jobIntentService0.b;
        if(a00 != null) {
            a00.cancel(jobIntentService0.c);
        }
        jobIntentService0.d = true;
        synchronized(this.b) {
            this.c = null;
        }
        return true;
    }
}

