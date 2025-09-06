package kotlin.reflect.jvm.internal.impl.storage;

public final class k extends j implements MemoizedFunctionToNotNull {
    @Override  // kotlin.reflect.jvm.internal.impl.storage.j
    public static void a(int v) {
        Object[] arr_object = new Object[(v == 3 ? 2 : 3)];
        switch(v) {
            case 1: {
                arr_object[0] = "map";
                break;
            }
            case 2: {
                arr_object[0] = "compute";
                break;
            }
            case 3: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
                break;
            }
            default: {
                arr_object[0] = "storageManager";
            }
        }
        arr_object[1] = v == 3 ? "invoke" : "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
        if(v != 3) {
            arr_object[2] = "<init>";
        }
        String s = String.format((v == 3 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalArgumentException illegalArgumentException0 = v == 3 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalArgumentException0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.storage.j, kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Object object1 = super.invoke(object0);
        if(object1 != null) {
            return object1;
        }
        k.a(3);
        throw null;
    }
}

