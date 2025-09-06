package io.reactivex.internal.operators.flowable;

import io.reactivex.BackpressureOverflowStrategy;

public abstract class g3 {
    public static final int[] a;

    static {
        int[] arr_v = new int[BackpressureOverflowStrategy.values().length];
        g3.a = arr_v;
        try {
            arr_v[BackpressureOverflowStrategy.DROP_LATEST.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            g3.a[BackpressureOverflowStrategy.DROP_OLDEST.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

