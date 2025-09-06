package androidx.constraintlayout.core.state;

public abstract class c {
    public static final int[] a;

    static {
        int[] arr_v = new int[Helper.values().length];
        c.a = arr_v;
        try {
            arr_v[Helper.HORIZONTAL_CHAIN.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.a[Helper.VERTICAL_CHAIN.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.a[Helper.ALIGN_HORIZONTALLY.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.a[Helper.ALIGN_VERTICALLY.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.a[Helper.BARRIER.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

