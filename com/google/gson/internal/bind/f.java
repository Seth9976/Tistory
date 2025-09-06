package com.google.gson.internal.bind;

import com.google.gson.stream.JsonToken;

public abstract class f {
    public static final int[] a;

    static {
        int[] arr_v = new int[JsonToken.values().length];
        f.a = arr_v;
        try {
            arr_v[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            f.a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            f.a[JsonToken.STRING.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            f.a[JsonToken.NUMBER.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            f.a[JsonToken.BOOLEAN.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            f.a[JsonToken.NULL.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

