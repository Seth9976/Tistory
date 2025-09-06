package androidx.core.app;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.view.View;
import androidx.annotation.DoNotInline;

public abstract class l {
    @DoNotInline
    public static ActivityOptions a() {
        return ActivityOptions.makeBasic();
    }

    @DoNotInline
    public static ActivityOptions b(View view0, int v, int v1, int v2, int v3) {
        return ActivityOptions.makeClipRevealAnimation(view0, v, v1, v2, v3);
    }

    @DoNotInline
    public static void c(ActivityOptions activityOptions0, PendingIntent pendingIntent0) {
        activityOptions0.requestUsageTimeReport(pendingIntent0);
    }
}

