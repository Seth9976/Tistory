package com.google.gson.internal.bind;

import com.google.gson.stream.JsonToken;

public abstract class e {
    public static final int[] a;

    static {
        int[] arr_v = new int[JsonToken.values().length];
        e.a = arr_v;
        try {
            arr_v[JsonToken.NULL.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.a[JsonToken.NUMBER.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.a[JsonToken.STRING.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

