package xc;

import io.reactivex.BackpressureStrategy;

public abstract class a {
    public static final int[] a;

    static {
        int[] arr_v = new int[BackpressureStrategy.values().length];
        a.a = arr_v;
        try {
            arr_v[BackpressureStrategy.DROP.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[BackpressureStrategy.LATEST.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[BackpressureStrategy.MISSING.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[BackpressureStrategy.ERROR.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

