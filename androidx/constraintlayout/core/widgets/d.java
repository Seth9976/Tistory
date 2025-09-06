package androidx.constraintlayout.core.widgets;

public abstract class d {
    public static final int[] a;

    static {
        int[] arr_v = new int[Type.values().length];
        d.a = arr_v;
        try {
            arr_v[Type.LEFT.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            d.a[Type.RIGHT.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            d.a[Type.TOP.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            d.a[Type.BOTTOM.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            d.a[Type.BASELINE.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            d.a[Type.CENTER.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            d.a[Type.CENTER_X.ordinal()] = 7;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            d.a[Type.CENTER_Y.ordinal()] = 8;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            d.a[Type.NONE.ordinal()] = 9;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

