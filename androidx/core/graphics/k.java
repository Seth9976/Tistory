package androidx.core.graphics;

import android.graphics.Path;
import androidx.annotation.DoNotInline;

public abstract class k {
    @DoNotInline
    public static float[] a(Path path0, float f) {
        return path0.approximate(f);
    }
}

