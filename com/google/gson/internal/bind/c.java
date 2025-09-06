package com.google.gson.internal.bind;

import com.google.gson.stream.JsonToken;

public abstract class c {
    public static final int[] a;

    static {
        int[] arr_v = new int[JsonToken.values().length];
        c.a = arr_v;
        try {
            arr_v[JsonToken.NAME.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.a[JsonToken.END_ARRAY.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.a[JsonToken.END_OBJECT.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.a[JsonToken.END_DOCUMENT.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

