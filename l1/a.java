package l1;

import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.KotlinNothingValueException;

public abstract class a {
    public static final int[] a;

    static {
        a.a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    }

    public static boolean a(int v, int v1) {
        if(v == 0) {
            throw null;
        }
        return v == v1;
    }

    public static KotlinNothingValueException b(String s) {
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(s);
        return new KotlinNothingValueException();
    }

    public static int c(int v) {
        if(v == 0) {
            throw null;
        }
        return v - 1;
    }

    public static int[] d(int v) {
        int[] arr_v = new int[v];
        System.arraycopy(a.a, 0, arr_v, 0, v);
        return arr_v;
    }
}

