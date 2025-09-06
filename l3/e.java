package l3;

import android.icu.text.DateFormat.HourCycle;

public abstract class e {
    public static final int[] a;

    static {
        int[] arr_v = new int[DateFormat.HourCycle.values().length];
        e.a = arr_v;
        try {
            arr_v[0] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.a[1] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.a[2] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.a[3] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

