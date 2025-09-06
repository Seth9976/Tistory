package kotlin.reflect.jvm.internal.impl.storage;

import a7.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final class c extends h implements NotNullLazyValue {
    public volatile b d;
    public final Function1 e;
    public final Function1 f;

    public c(LockBasedStorageManager lockBasedStorageManager0, Function0 function00, Function1 function10, Function1 function11) {
        this.e = function10;
        this.f = function11;
        if(lockBasedStorageManager0 != null) {
            if(function00 != null) {
                super(lockBasedStorageManager0, function00);
                this.d = null;
                return;
            }
            c.d(1);
            throw null;
        }
        c.d(0);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.storage.h
    public static void a(int v) {
        Object[] arr_object = new Object[(v == 2 ? 3 : 2)];
        arr_object[0] = v == 2 ? "value" : "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        arr_object[1] = v == 2 ? "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5" : "recursionDetected";
        if(v == 2) {
            arr_object[2] = "doPostCompute";
        }
        String s = String.format((v == 2 ? "Argument for @NotNull parameter \'%s\' of %s.%s must not be null" : "@NotNull method %s.%s must not return null"), arr_object);
        IllegalStateException illegalStateException0 = v == 2 ? new IllegalArgumentException(s) : new IllegalStateException(s);
        throw illegalStateException0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.storage.h
    public final void b(Object object0) {
        this.d = new b(object0);
        try {
            if(object0 != null) {
                this.f.invoke(object0);
                this.d = null;
                return;
            }
            c.a(2);
            throw null;
        }
        catch(Throwable throwable0) {
            this.d = null;
            throw throwable0;
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.storage.h
    public final m c(boolean z) {
        return this.e == null ? super.c(z) : new m(this.e.invoke(Boolean.valueOf(z)), false);
    }

    public static void d(int v) {
        Object[] arr_object = new Object[(v == 2 ? 2 : 3)];
        switch(v) {
            case 1: {
                arr_object[0] = "computable";
                break;
            }
            case 2: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
                break;
            }
            default: {
                arr_object[0] = "storageManager";
            }
        }
        arr_object[1] = v == 2 ? "invoke" : "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        if(v != 2) {
            arr_object[2] = "<init>";
        }
        String s = String.format((v == 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalArgumentException illegalArgumentException0 = v == 2 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalArgumentException0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.storage.h, kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object object0;
        b b0 = this.d;
        if(b0 == null || ((Thread)b0.c) != Thread.currentThread()) {
            object0 = super.invoke();
        }
        else {
            if(((Thread)b0.c) != Thread.currentThread()) {
                throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
            }
            object0 = b0.b;
        }
        if(object0 != null) {
            return object0;
        }
        c.d(2);
        throw null;
    }
}

