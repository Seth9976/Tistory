package androidx.core.view;

import android.view.VelocityTracker;
import androidx.annotation.DoNotInline;

public abstract class z {
    @DoNotInline
    public static float a(VelocityTracker velocityTracker0, int v) {
        return velocityTracker0.getAxisVelocity(v);
    }

    @DoNotInline
    public static float b(VelocityTracker velocityTracker0, int v, int v1) {
        return velocityTracker0.getAxisVelocity(v, v1);
    }

    @DoNotInline
    public static boolean c(VelocityTracker velocityTracker0, int v) {
        return velocityTracker0.isAxisSupported(v);
    }
}

