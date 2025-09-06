package com.google.firebase.encoders.proto;

public abstract class b {
    public static final int[] a;

    static {
        int[] arr_v = new int[IntEncoding.values().length];
        b.a = arr_v;
        try {
            arr_v[IntEncoding.DEFAULT.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            b.a[IntEncoding.SIGNED.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            b.a[IntEncoding.FIXED.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

