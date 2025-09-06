package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.functions.Function0;

public class i extends h implements NotNullLazyValue {
    public i(LockBasedStorageManager lockBasedStorageManager0, Function0 function00) {
        if(lockBasedStorageManager0 != null) {
            if(function00 != null) {
                super(lockBasedStorageManager0, function00);
                return;
            }
            i.a(1);
            throw null;
        }
        i.a(0);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.storage.h
    public static void a(int v) {
        Object[] arr_object = new Object[(v == 2 ? 2 : 3)];
        switch(v) {
            case 1: {
                arr_object[0] = "computable";
                break;
            }
            case 2: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
                break;
            }
            default: {
                arr_object[0] = "storageManager";
            }
        }
        arr_object[1] = v == 2 ? "invoke" : "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
        if(v != 2) {
            arr_object[2] = "<init>";
        }
        String s = String.format((v == 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalArgumentException illegalArgumentException0 = v == 2 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalArgumentException0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.storage.h, kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object object0 = super.invoke();
        if(object0 != null) {
            return object0;
        }
        i.a(2);
        throw null;
    }
}

