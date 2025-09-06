package kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.n;

public class e extends j implements CacheWithNullableValues {
    public e(LockBasedStorageManager lockBasedStorageManager0, ConcurrentHashMap concurrentHashMap0) {
        if(lockBasedStorageManager0 != null) {
            super(lockBasedStorageManager0, concurrentHashMap0, new n(1));
            return;
        }
        e.a(0);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.storage.j
    public static void a(int v) {
        Object[] arr_object = new Object[3];
        switch(v) {
            case 1: {
                arr_object[0] = "map";
                break;
            }
            case 2: {
                arr_object[0] = "computation";
                break;
            }
            default: {
                arr_object[0] = "storageManager";
            }
        }
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
        arr_object[2] = v == 2 ? "computeIfAbsent" : "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }
}

