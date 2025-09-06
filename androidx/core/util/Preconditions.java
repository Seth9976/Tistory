package androidx.core.util;

import a5.b;
import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.Locale;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public final class Preconditions {
    public static void checkArgument(boolean z) {
        if(!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkArgument(boolean z, @NonNull Object object0) {
        if(!z) {
            throw new IllegalArgumentException(String.valueOf(object0));
        }
    }

    public static void checkArgument(boolean z, @NonNull String s, @NonNull Object[] arr_object) {
        if(!z) {
            throw new IllegalArgumentException(String.format(s, arr_object));
        }
    }

    public static float checkArgumentFinite(float f, @NonNull String s) {
        if(Float.isNaN(f)) {
            throw new IllegalArgumentException(s + " must not be NaN");
        }
        if(Float.isInfinite(f)) {
            throw new IllegalArgumentException(s + " must not be infinite");
        }
        return f;
    }

    public static double checkArgumentInRange(double f, double f1, double f2, @NonNull String s) {
        if(f < f1) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", s, f1, f2));
        }
        if(f > f2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", s, f1, f2));
        }
        return f;
    }

    public static float checkArgumentInRange(float f, float f1, float f2, @NonNull String s) {
        if(f < f1) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", s, f1, f2));
        }
        if(f > f2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", s, f1, f2));
        }
        return f;
    }

    public static int checkArgumentInRange(int v, int v1, int v2, @NonNull String s) {
        if(v < v1) {
            throw new IllegalArgumentException(s + " is out of range of [" + v1 + ", " + v2 + "] (too low)");
        }
        if(v > v2) {
            throw new IllegalArgumentException(s + " is out of range of [" + v1 + ", " + v2 + "] (too high)");
        }
        return v;
    }

    public static long checkArgumentInRange(long v, long v1, long v2, @NonNull String s) {
        if(Long.compare(v, v1) >= 0) {
            if(v <= v2) {
                return v;
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(s);
            stringBuilder0.append(" is out of range of [");
            stringBuilder0.append(v1);
            stringBuilder0.append(", ");
            throw new IllegalArgumentException(b.g(v2, "] (too high)", stringBuilder0));
        }
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(s);
        stringBuilder1.append(" is out of range of [");
        stringBuilder1.append(v1);
        stringBuilder1.append(", ");
        throw new IllegalArgumentException(b.g(v2, "] (too low)", stringBuilder1));
    }

    @IntRange(from = 0L)
    public static int checkArgumentNonnegative(int v) {
        if(v < 0) {
            throw new IllegalArgumentException();
        }
        return v;
    }

    @IntRange(from = 0L)
    public static int checkArgumentNonnegative(int v, @Nullable String s) {
        if(v < 0) {
            throw new IllegalArgumentException(s);
        }
        return v;
    }

    public static int checkFlagsArgument(int v, int v1) {
        if((v & v1) != v) {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(v) + ", but only 0x" + Integer.toHexString(v1) + " are allowed");
        }
        return v;
    }

    @NonNull
    public static Object checkNotNull(@Nullable Object object0) {
        object0.getClass();
        return object0;
    }

    @NonNull
    public static Object checkNotNull(@Nullable Object object0, @NonNull Object object1) {
        if(object0 == null) {
            throw new NullPointerException(String.valueOf(object1));
        }
        return object0;
    }

    public static void checkState(boolean z) {
        Preconditions.checkState(z, null);
    }

    public static void checkState(boolean z, @Nullable String s) {
        if(!z) {
            throw new IllegalStateException(s);
        }
    }

    @NonNull
    public static CharSequence checkStringNotEmpty(@Nullable CharSequence charSequence0) {
        if(TextUtils.isEmpty(charSequence0)) {
            throw new IllegalArgumentException();
        }
        return charSequence0;
    }

    @NonNull
    public static CharSequence checkStringNotEmpty(@Nullable CharSequence charSequence0, @NonNull Object object0) {
        if(TextUtils.isEmpty(charSequence0)) {
            throw new IllegalArgumentException(String.valueOf(object0));
        }
        return charSequence0;
    }

    @NonNull
    public static CharSequence checkStringNotEmpty(@Nullable CharSequence charSequence0, @NonNull String s, @NonNull Object[] arr_object) {
        if(TextUtils.isEmpty(charSequence0)) {
            throw new IllegalArgumentException(String.format(s, arr_object));
        }
        return charSequence0;
    }
}

