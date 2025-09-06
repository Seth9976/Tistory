package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.EncodeStrategy;
import l1.a;

public abstract class i {
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;

    static {
        int[] arr_v = new int[EncodeStrategy.values().length];
        i.c = arr_v;
        try {
            arr_v[EncodeStrategy.SOURCE.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            i.c[EncodeStrategy.TRANSFORMED.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        int[] arr_v1 = new int[a.d(6).length];
        i.b = arr_v1;
        try {
            arr_v1[1] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            i.b[2] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            i.b[3] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            i.b[5] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            i.b[0] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        int[] arr_v2 = new int[m.values().length];
        i.a = arr_v2;
        try {
            arr_v2[0] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            i.a[1] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            i.a[2] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

