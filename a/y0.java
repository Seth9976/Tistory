package a;

import com.kakao.kandinsky.home.contract.HomeMenu;

public abstract class y0 {
    public static final int[] a;

    static {
        int[] arr_v = new int[HomeMenu.values().length];
        try {
            arr_v[HomeMenu.Reset.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        y0.a = arr_v;
    }
}

