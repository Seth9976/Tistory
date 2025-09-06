package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;

public class h implements NullableLazyValue {
    public final LockBasedStorageManager a;
    public final Function0 b;
    public volatile Object c;

    public h(LockBasedStorageManager lockBasedStorageManager0, Function0 function00) {
        if(lockBasedStorageManager0 != null) {
            if(function00 != null) {
                super();
                this.c = l.a;
                this.a = lockBasedStorageManager0;
                this.b = function00;
                return;
            }
            h.a(1);
            throw null;
        }
        h.a(0);
        throw null;
    }

    public static void a(int v) {
        Object[] arr_object = new Object[(v == 2 || v == 3 ? 2 : 3)];
        switch(v) {
            case 1: {
                arr_object[0] = "computable";
                break;
            }
            case 2: 
            case 3: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
                break;
            }
            default: {
                arr_object[0] = "storageManager";
            }
        }
        switch(v) {
            case 2: {
                arr_object[1] = "recursionDetected";
                break;
            }
            case 3: {
                arr_object[1] = "renderDebugInformation";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            }
        }
        if(v != 2 && v != 3) {
            arr_object[2] = "<init>";
        }
        String s = String.format((v == 2 || v == 3 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 2 || v == 3 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    public void b(Object object0) {
    }

    public m c(boolean z) {
        m m0 = this.a.recursionDetectedDefault("in a lazy value", null);
        if(m0 != null) {
            return m0;
        }
        h.a(2);
        throw null;
    }

    @Override  // kotlin.jvm.functions.Function0
    public Object invoke() {
        Object object2;
        Object object0 = this.c;
        if(!(object0 instanceof l)) {
            return WrappedValues.unescapeThrowable(object0);
        }
        this.a.lock.lock();
        try {
            Object object1 = this.c;
            if(object1 instanceof l) {
                l l0 = l.b;
                l l1 = l.c;
                if(object1 == l0) {
                    this.c = l1;
                    m m0 = this.c(true);
                    if(!m0.b) {
                        return m0.a;
                    }
                    goto label_17;
                }
                else {
                label_17:
                    if(object1 == l1) {
                        m m1 = this.c(false);
                        if(!m1.b) {
                            return m1.a;
                        }
                        goto label_22;
                    }
                    else {
                        try {
                        label_22:
                            this.c = l0;
                            object2 = this.b.invoke();
                            this.b(object2);
                            this.c = object2;
                        }
                        catch(Throwable throwable0) {
                            if(!ExceptionUtilsKt.isProcessCanceledException(throwable0)) {
                                if(this.c == l0) {
                                    this.c = WrappedValues.escapeThrowable(throwable0);
                                }
                                throw this.a.a.handleException(throwable0);
                            }
                            this.c = l.a;
                            throw (RuntimeException)throwable0;
                        }
                    }
                }
            }
            else {
                object2 = WrappedValues.unescapeThrowable(object1);
            }
            return object2;
        }
        finally {
            this.a.lock.unlock();
        }
    }

    public final boolean isComputed() {
        return this.c != l.a && this.c != l.b;
    }
}

