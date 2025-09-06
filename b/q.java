package b;

import com.kakao.kandinsky.home.contract.HomeMenu;

public abstract class q {
    public static final int[] a;

    static {
        int[] arr_v = new int[HomeMenu.values().length];
        try {
            arr_v[HomeMenu.Resize.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[HomeMenu.Crop.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[HomeMenu.Effect.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[HomeMenu.Signature.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[HomeMenu.Sticker.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[HomeMenu.Mosaic.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[HomeMenu.Text.ordinal()] = 7;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[HomeMenu.Border.ordinal()] = 8;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[HomeMenu.Reset.ordinal()] = 9;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        q.a = arr_v;
    }
}

