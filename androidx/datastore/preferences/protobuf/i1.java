package androidx.datastore.preferences.protobuf;

public abstract class i1 {
    public static final int[] a;

    static {
        int[] arr_v = new int[JavaType.values().length];
        i1.a = arr_v;
        try {
            arr_v[JavaType.MESSAGE.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            i1.a[JavaType.ENUM.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

