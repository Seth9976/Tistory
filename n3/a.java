package n3;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.DoNotInline;

public abstract class a {
    @DoNotInline
    public static Interpolator a(float f, float f1) {
        return new PathInterpolator(f, f1);
    }

    @DoNotInline
    public static Interpolator b(float f, float f1, float f2, float f3) {
        return new PathInterpolator(f, f1, f2, f3);
    }

    @DoNotInline
    public static Interpolator c(Path path0) {
        return new PathInterpolator(path0);
    }
}

