package com.google.gson.internal.bind;

import com.google.gson.stream.JsonToken;

public abstract class h {
    public static final int[] a;

    static {
        int[] arr_v = new int[JsonToken.values().length];
        h.a = arr_v;
        try {
            arr_v[JsonToken.NUMBER.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            h.a[JsonToken.STRING.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            h.a[JsonToken.BOOLEAN.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            h.a[JsonToken.BEGIN_ARRAY.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            h.a[JsonToken.BEGIN_OBJECT.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            h.a[JsonToken.NULL.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

