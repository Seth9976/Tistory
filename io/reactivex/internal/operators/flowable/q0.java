package io.reactivex.internal.operators.flowable;

import io.reactivex.BackpressureStrategy;

public abstract class q0 {
    public static final int[] a;

    static {
        int[] arr_v = new int[BackpressureStrategy.values().length];
        q0.a = arr_v;
        try {
            arr_v[BackpressureStrategy.MISSING.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            q0.a[BackpressureStrategy.ERROR.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            q0.a[BackpressureStrategy.DROP.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            q0.a[BackpressureStrategy.LATEST.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

