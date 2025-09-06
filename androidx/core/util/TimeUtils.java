package androidx.core.util;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.io.PrintWriter;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public final class TimeUtils {
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static final int HUNDRED_DAY_FIELD_LEN = 19;
    public static final Object a;
    public static char[] b;

    static {
        TimeUtils.a = new Object();
        TimeUtils.b = new char[24];
    }

    public static int a(int v, int v1, int v2, boolean z) {
        if(v <= 99 && (!z || v2 < 3)) {
            if(v <= 9 && (!z || v2 < 2)) {
                return z || v > 0 ? v1 + 1 : 0;
            }
            return v1 + 2;
        }
        return v1 + 3;
    }

    public static int b(int v, long v1) {
        int v13;
        int v7;
        int v6;
        int v5;
        int v4;
        char c;
        if(TimeUtils.b.length < v) {
            TimeUtils.b = new char[v];
        }
        char[] arr_c = TimeUtils.b;
        int v2 = Long.compare(v1, 0L);
        if(v2 == 0) {
            while(v - 1 > 0) {
                arr_c[0] = ' ';
            }
            arr_c[0] = '0';
            return 1;
        }
        if(v2 > 0) {
            c = '+';
        }
        else {
            v1 = -v1;
            c = '-';
        }
        int v3 = (int)Math.floor(v1 / 1000L);
        if(v3 > 86400) {
            v4 = v3 / 86400;
            v3 -= 86400 * v4;
        }
        else {
            v4 = 0;
        }
        if(v3 > 3600) {
            v5 = v3 / 3600;
            v3 -= v5 * 3600;
        }
        else {
            v5 = 0;
        }
        if(v3 > 60) {
            v6 = v3 - v3 / 60 * 60;
            v7 = v3 / 60;
        }
        else {
            v6 = v3;
            v7 = 0;
        }
        if(v == 0) {
            v13 = 0;
        }
        else {
            int v8 = TimeUtils.a(v4, 1, 0, false);
            int v9 = TimeUtils.a(v5, 1, 2, v8 > 0) + v8;
            int v10 = TimeUtils.a(v7, 1, 2, v9 > 0) + v9;
            int v11 = TimeUtils.a(v6, 1, 2, v10 > 0) + v10;
            int v12 = TimeUtils.a(((int)(v1 % 1000L)), 2, (v11 <= 0 ? 0 : 3), true) + 1 + v11;
            v13 = 0;
            while(v12 < v) {
                arr_c[v13] = ' ';
                ++v13;
                ++v12;
            }
        }
        arr_c[v13] = c;
        int v14 = TimeUtils.c(arr_c, v4, 'd', v13 + 1, false, 0);
        int v15 = TimeUtils.c(arr_c, v5, 'h', v14, v14 != v13 + 1, (v == 0 ? 2 : 0));
        int v16 = TimeUtils.c(arr_c, v7, 'm', v15, v15 != v13 + 1, (v == 0 ? 2 : 0));
        int v17 = TimeUtils.c(arr_c, v6, 's', v16, v16 != v13 + 1, (v == 0 ? 2 : 0));
        int v18 = TimeUtils.c(arr_c, ((int)(v1 % 1000L)), 'm', v17, true, (v == 0 || v17 == v13 + 1 ? 0 : 3));
        arr_c[v18] = 's';
        return v18 + 1;
    }

    public static int c(char[] arr_c, int v, char c, int v1, boolean z, int v2) {
        int v3;
        if(z || v > 0) {
            if((!z || v2 < 3) && v <= 99) {
                v3 = v1;
            }
            else {
                arr_c[v1] = (char)(v / 100 + 0x30);
                v3 = v1 + 1;
                v -= v / 100 * 100;
            }
            if(z && v2 >= 2 || v > 9 || v1 != v3) {
                arr_c[v3] = (char)(v / 10 + 0x30);
                ++v3;
                v -= v / 10 * 10;
            }
            arr_c[v3] = (char)(v + 0x30);
            arr_c[v3 + 1] = c;
            return v3 + 2;
        }
        return v1;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long v, long v1, PrintWriter printWriter0) {
        if(v == 0L) {
            printWriter0.print("--");
            return;
        }
        TimeUtils.formatDuration(v - v1, printWriter0, 0);
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long v, PrintWriter printWriter0) {
        TimeUtils.formatDuration(v, printWriter0, 0);
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long v, PrintWriter printWriter0, int v1) {
        synchronized(TimeUtils.a) {
            int v3 = TimeUtils.b(v1, v);
            printWriter0.print(new String(TimeUtils.b, 0, v3));
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long v, StringBuilder stringBuilder0) {
        synchronized(TimeUtils.a) {
            int v2 = TimeUtils.b(0, v);
            stringBuilder0.append(TimeUtils.b, 0, v2);
        }
    }
}

