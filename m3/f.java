package m3;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.DoNotInline;

public abstract class f {
    @DoNotInline
    public static float a(int v, float f, DisplayMetrics displayMetrics0) {
        return TypedValue.deriveDimension(v, f, displayMetrics0);
    }
}

