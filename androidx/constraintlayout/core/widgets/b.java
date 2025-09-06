package androidx.constraintlayout.core.widgets;

public abstract class b {
    public static final int[] a;
    public static final int[] b;

    static {
        int[] arr_v = new int[DimensionBehaviour.values().length];
        b.b = arr_v;
        try {
            arr_v[DimensionBehaviour.FIXED.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            b.b[DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            b.b[DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            b.b[DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        int[] arr_v1 = new int[Type.values().length];
        b.a = arr_v1;
        try {
            arr_v1[Type.LEFT.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            b.a[Type.TOP.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            b.a[Type.RIGHT.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            b.a[Type.BOTTOM.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            b.a[Type.BASELINE.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            b.a[Type.CENTER.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            b.a[Type.CENTER_X.ordinal()] = 7;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            b.a[Type.CENTER_Y.ordinal()] = 8;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            b.a[Type.NONE.ordinal()] = 9;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

