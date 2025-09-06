package androidx.datastore.preferences.protobuf;

import l1.a;

public abstract class e1 {
    public static final int[] a;
    public static final int[] b;

    static {
        int[] arr_v = new int[JavaType.values().length];
        e1.b = arr_v;
        try {
            arr_v[JavaType.BYTE_STRING.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e1.b[JavaType.MESSAGE.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e1.b[JavaType.STRING.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        int[] arr_v1 = new int[a.d(4).length];
        e1.a = arr_v1;
        try {
            arr_v1[3] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e1.a[1] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e1.a[0] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

