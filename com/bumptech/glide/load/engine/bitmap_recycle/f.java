package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap.Config;

public abstract class f {
    public static final int[] a;

    static {
        int[] arr_v = new int[Bitmap.Config.values().length];
        f.a = arr_v;
        try {
            arr_v[Bitmap.Config.ARGB_8888.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            f.a[Bitmap.Config.RGB_565.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            f.a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            f.a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

