package com.squareup.moshi;

public abstract class o0 {
    public static final int[] a;

    static {
        int[] arr_v = new int[Token.values().length];
        o0.a = arr_v;
        try {
            arr_v[Token.BEGIN_ARRAY.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            o0.a[Token.BEGIN_OBJECT.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            o0.a[Token.STRING.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            o0.a[Token.NUMBER.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            o0.a[Token.BOOLEAN.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            o0.a[Token.NULL.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

