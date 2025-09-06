package androidx.work.impl.background.systemjob;

import android.app.job.JobParameters;
import androidx.annotation.DoNotInline;

public abstract class f {
    @DoNotInline
    public static int a(JobParameters jobParameters0) {
        int v = jobParameters0.getStopReason();
        switch(v) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                return v;
            }
            default: {
                return 0xFFFFFE00;
            }
        }
    }
}

