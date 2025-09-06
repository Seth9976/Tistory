package androidx.constraintlayout.widget;

public abstract class a {
    public static final int[] a;

    static {
        int[] arr_v = new int[AttributeType.values().length];
        a.a = arr_v;
        try {
            arr_v[AttributeType.REFERENCE_TYPE.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[AttributeType.BOOLEAN_TYPE.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[AttributeType.STRING_TYPE.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[AttributeType.COLOR_TYPE.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[AttributeType.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[AttributeType.INT_TYPE.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[AttributeType.FLOAT_TYPE.ordinal()] = 7;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[AttributeType.DIMENSION_TYPE.ordinal()] = 8;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

