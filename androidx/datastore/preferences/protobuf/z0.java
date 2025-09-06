package androidx.datastore.preferences.protobuf;

public abstract class z0 {
    public static final int[] a;

    static {
        int[] arr_v = new int[FieldType.values().length];
        z0.a = arr_v;
        try {
            arr_v[FieldType.MESSAGE.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            z0.a[FieldType.GROUP.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            z0.a[FieldType.MESSAGE_LIST.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            z0.a[FieldType.GROUP_LIST.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

