package androidx.core.app;

import a5.b;
import android.app.job.JobInfo.Builder;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;

public final class d0 {
    public boolean a;
    public int b;
    public final JobInfo c;
    public final JobScheduler d;

    public d0(Context context0, ComponentName componentName0, int v) {
        this.a(v);
        this.c = new JobInfo.Builder(v, componentName0).setOverrideDeadline(0L).build();
        this.d = (JobScheduler)context0.getApplicationContext().getSystemService("jobscheduler");
    }

    public final void a(int v) {
        if(!this.a) {
            this.a = true;
            this.b = v;
            return;
        }
        if(this.b == v) {
            return;
        }
        StringBuilder stringBuilder0 = b.s(v, "Given job ID ", " is different than previous ");
        stringBuilder0.append(this.b);
        throw new IllegalArgumentException(stringBuilder0.toString());
    }
}

