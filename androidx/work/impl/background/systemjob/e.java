package androidx.work.impl.background.systemjob;

import android.app.job.JobParameters;
import android.net.Network;
import androidx.annotation.DoNotInline;

public abstract class e {
    @DoNotInline
    public static Network a(JobParameters jobParameters0) {
        return jobParameters0.getNetwork();
    }
}

