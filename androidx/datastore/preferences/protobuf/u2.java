package androidx.datastore.preferences.protobuf;

public abstract class u2 {
    public static final int[] a;

    static {
        int[] arr_v = new int[MethodToInvoke.values().length];
        u2.a = arr_v;
        try {
            arr_v[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            u2.a[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            u2.a[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            u2.a[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            u2.a[MethodToInvoke.GET_PARSER.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            u2.a[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            u2.a[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

