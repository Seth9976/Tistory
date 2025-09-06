package androidx.core.app;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;

public final class b0 implements GenericWorkItem {
    public final JobWorkItem a;
    public final c0 b;

    public b0(c0 c00, JobWorkItem jobWorkItem0) {
        this.b = c00;
        this.a = jobWorkItem0;
    }

    @Override  // androidx.core.app.JobIntentService$GenericWorkItem
    public final void complete() {
        synchronized(this.b.b) {
            JobParameters jobParameters0 = this.b.c;
            if(jobParameters0 != null) {
                jobParameters0.completeWork(this.a);
            }
        }
    }

    @Override  // androidx.core.app.JobIntentService$GenericWorkItem
    public final Intent getIntent() {
        return this.a.getIntent();
    }
}

