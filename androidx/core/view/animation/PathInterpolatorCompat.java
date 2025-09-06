package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import n3.a;

public final class PathInterpolatorCompat {
    @NonNull
    public static Interpolator create(float f, float f1) {
        return a.a(f, f1);
    }

    @NonNull
    public static Interpolator create(float f, float f1, float f2, float f3) {
        return a.b(f, f1, f2, f3);
    }

    @NonNull
    public static Interpolator create(@NonNull Path path0) {
        return a.c(path0);
    }
}

