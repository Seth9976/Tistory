package androidx.core.util;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import m3.f;

public class TypedValueCompat {
    @RestrictTo({Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ComplexDimensionUnit {
    }

    public static float deriveDimension(int v, float f, @NonNull DisplayMetrics displayMetrics0) {
        if(Build.VERSION.SDK_INT >= 34) {
            return f.a(v, f, displayMetrics0);
        }
        switch(v) {
            case 0: {
                return f;
            }
            case 1: {
                return displayMetrics0.density == 0.0f ? 0.0f : f / displayMetrics0.density;
            }
            case 2: {
                return displayMetrics0.scaledDensity == 0.0f ? 0.0f : f / displayMetrics0.scaledDensity;
            }
            case 3: {
                return displayMetrics0.xdpi == 0.0f ? 0.0f : f / displayMetrics0.xdpi / 0.013889f;
            }
            case 4: {
                return displayMetrics0.xdpi == 0.0f ? 0.0f : f / displayMetrics0.xdpi;
            }
            case 5: {
                return displayMetrics0.xdpi == 0.0f ? 0.0f : f / displayMetrics0.xdpi / 0.03937f;
            }
            default: {
                throw new IllegalArgumentException("Invalid unitToConvertTo " + v);
            }
        }
    }

    public static float dpToPx(float f, @NonNull DisplayMetrics displayMetrics0) {
        return TypedValue.applyDimension(1, f, displayMetrics0);
    }

    @SuppressLint({"WrongConstant"})
    public static int getUnitFromComplexDimension(int v) {
        return v & 15;
    }

    public static float pxToDp(float f, @NonNull DisplayMetrics displayMetrics0) {
        return TypedValueCompat.deriveDimension(1, f, displayMetrics0);
    }

    public static float pxToSp(float f, @NonNull DisplayMetrics displayMetrics0) {
        return TypedValueCompat.deriveDimension(2, f, displayMetrics0);
    }

    public static float spToPx(float f, @NonNull DisplayMetrics displayMetrics0) {
        return TypedValue.applyDimension(2, f, displayMetrics0);
    }
}

