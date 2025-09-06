package i6;

import android.graphics.Bitmap.Config;

public abstract class d {
    public static final int[] a;

    static {
        int[] arr_v = new int[Bitmap.Config.values().length];
        d.a = arr_v;
        try {
            arr_v[Bitmap.Config.ALPHA_8.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            d.a[Bitmap.Config.RGB_565.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            d.a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            d.a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            d.a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

