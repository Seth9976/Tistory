package androidx.core.app;

import android.app.ActivityOptions;
import androidx.annotation.DoNotInline;

public abstract class n {
    @DoNotInline
    public static ActivityOptions a(ActivityOptions activityOptions0, boolean z) {
        return activityOptions0.setShareIdentityEnabled(z);
    }
}

