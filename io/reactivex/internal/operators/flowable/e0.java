package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.util.ErrorMode;

public abstract class e0 {
    public static final int[] a;

    static {
        int[] arr_v = new int[ErrorMode.values().length];
        e0.a = arr_v;
        try {
            arr_v[ErrorMode.BOUNDARY.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e0.a[ErrorMode.END.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

