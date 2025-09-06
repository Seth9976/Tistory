package androidx.core.app;

import android.app.ActivityOptions;
import android.graphics.Rect;
import androidx.annotation.DoNotInline;

public abstract class m {
    @DoNotInline
    public static Rect a(ActivityOptions activityOptions0) {
        return activityOptions0.getLaunchBounds();
    }

    @DoNotInline
    public static ActivityOptions b(ActivityOptions activityOptions0, Rect rect0) {
        return activityOptions0.setLaunchBounds(rect0);
    }
}

