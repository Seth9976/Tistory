package androidx.work.impl.background.systemjob;

import android.app.job.JobParameters;
import android.net.Uri;
import androidx.annotation.DoNotInline;

public abstract class d {
    @DoNotInline
    public static String[] a(JobParameters jobParameters0) {
        return jobParameters0.getTriggeredContentAuthorities();
    }

    @DoNotInline
    public static Uri[] b(JobParameters jobParameters0) {
        return jobParameters0.getTriggeredContentUris();
    }
}

