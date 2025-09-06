package com.bumptech.glide.load;

public abstract class a {
    public static final int[] a;

    static {
        int[] arr_v = new int[ImageType.values().length];
        a.a = arr_v;
        try {
            arr_v[ImageType.WEBP.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[ImageType.WEBP_A.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

