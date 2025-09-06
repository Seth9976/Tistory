package androidx.recyclerview.widget;

public abstract class l1 {
    public static final int[] a;

    static {
        int[] arr_v = new int[StateRestorationPolicy.values().length];
        l1.a = arr_v;
        try {
            arr_v[StateRestorationPolicy.PREVENT.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            l1.a[StateRestorationPolicy.PREVENT_WHEN_EMPTY.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

