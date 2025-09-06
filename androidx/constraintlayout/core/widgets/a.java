package androidx.constraintlayout.core.widgets;

public abstract class a {
    public static final int[] a;

    static {
        int[] arr_v = new int[Type.values().length];
        a.a = arr_v;
        try {
            arr_v[Type.CENTER.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[Type.LEFT.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[Type.RIGHT.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[Type.TOP.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[Type.BOTTOM.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[Type.BASELINE.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[Type.CENTER_X.ordinal()] = 7;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[Type.CENTER_Y.ordinal()] = 8;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[Type.NONE.ordinal()] = 9;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

