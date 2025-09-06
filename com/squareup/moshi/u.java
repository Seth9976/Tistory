package com.squareup.moshi;

public abstract class u {
    public static final int[] a;

    static {
        int[] arr_v = new int[Token.values().length];
        u.a = arr_v;
        try {
            arr_v[Token.BEGIN_ARRAY.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            u.a[Token.BEGIN_OBJECT.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            u.a[Token.STRING.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            u.a[Token.NUMBER.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            u.a[Token.BOOLEAN.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            u.a[Token.NULL.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

