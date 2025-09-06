package androidx.datastore.preferences.protobuf;

public abstract class c2 {
    public static final int[] a;

    static {
        int[] arr_v = new int[FieldType.values().length];
        c2.a = arr_v;
        try {
            arr_v[FieldType.MESSAGE.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c2.a[FieldType.ENUM.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c2.a[FieldType.GROUP.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

