package kotlin.reflect.jvm.internal.impl.protobuf;

public abstract class e {
    public static final int[] a;

    static {
        int[] arr_v = new int[JavaType.values().length];
        e.a = arr_v;
        try {
            arr_v[JavaType.MESSAGE.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.a[JavaType.ENUM.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

