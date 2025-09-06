package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.functions.Function0;

public final class d extends e implements CacheWithNotNullValues {
    @Override  // kotlin.reflect.jvm.internal.impl.storage.e
    public static void a(int v) {
        Object[] arr_object = new Object[(v == 3 ? 2 : 3)];
        switch(v) {
            case 1: {
                arr_object[0] = "map";
                break;
            }
            case 2: {
                arr_object[0] = "computation";
                break;
            }
            case 3: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
                break;
            }
            default: {
                arr_object[0] = "storageManager";
            }
        }
        arr_object[1] = v == 3 ? "computeIfAbsent" : "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        if(v == 2) {
            arr_object[2] = "computeIfAbsent";
        }
        else if(v != 3) {
            arr_object[2] = "<init>";
        }
        String s = String.format((v == 3 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalArgumentException illegalArgumentException0 = v == 3 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalArgumentException0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues
    public final Object computeIfAbsent(Object object0, Function0 function00) {
        if(function00 != null) {
            Object object1 = this.invoke(new g(object0, function00));
            if(object1 != null) {
                return object1;
            }
            d.a(3);
            throw null;
        }
        d.a(2);
        throw null;
    }
}

