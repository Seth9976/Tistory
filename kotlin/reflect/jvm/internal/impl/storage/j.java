package kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.ConcurrentMap;
import jeb.synthetic.FIN;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;

public class j implements MemoizedFunctionToNullable {
    public final LockBasedStorageManager a;
    public final ConcurrentMap b;
    public final Function1 c;

    public j(LockBasedStorageManager lockBasedStorageManager0, ConcurrentMap concurrentMap0, Function1 function10) {
        if(lockBasedStorageManager0 != null) {
            if(concurrentMap0 != null) {
                if(function10 != null) {
                    super();
                    this.a = lockBasedStorageManager0;
                    this.b = concurrentMap0;
                    this.c = function10;
                    return;
                }
                j.a(2);
                throw null;
            }
            j.a(1);
            throw null;
        }
        j.a(0);
        throw null;
    }

    public static void a(int v) {
        Object[] arr_object = new Object[(v == 3 || v == 4 ? 2 : 3)];
        switch(v) {
            case 1: {
                arr_object[0] = "map";
                break;
            }
            case 2: {
                arr_object[0] = "compute";
                break;
            }
            case 3: 
            case 4: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
                break;
            }
            default: {
                arr_object[0] = "storageManager";
            }
        }
        switch(v) {
            case 3: {
                arr_object[1] = "recursionDetected";
                break;
            }
            case 4: {
                arr_object[1] = "raceCondition";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            }
        }
        if(v != 3 && v != 4) {
            arr_object[2] = "<init>";
        }
        String s = String.format((v == 3 || v == 4 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 3 || v == 4 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    public final AssertionError b(Object object0, Object object1) {
        AssertionError assertionError0 = new AssertionError("Race condition detected on input " + object0 + ". Old value is " + object1 + " under " + this.a);
        LockBasedStorageManager.b(assertionError0);
        return assertionError0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        Object object2;
        ConcurrentMap concurrentMap0 = this.b;
        Object object1 = concurrentMap0.get(object0);
        l l0 = l.b;
        if(object1 != null && object1 != l0) {
            return WrappedValues.unescapeExceptionOrNull(object1);
        }
        LockBasedStorageManager lockBasedStorageManager0 = this.a;
        lockBasedStorageManager0.lock.lock();
        int v = FIN.finallyOpen$NT();
        l l1 = concurrentMap0.get(object0);
        l l2 = l.c;
        AssertionError assertionError0 = null;
        if(l1 == l0) {
            m m0 = lockBasedStorageManager0.recursionDetectedDefault("", object0);
            if(m0 != null) {
                if(!m0.b) {
                    object2 = m0.a;
                    goto label_33;
                }
                l1 = l2;
                goto label_22;
            }
            j.a(3);
            FIN.finallyExec$NT(v);
            throw null;
        }
    label_22:
        if(l1 == l2) {
            m m1 = lockBasedStorageManager0.recursionDetectedDefault("", object0);
            if(m1 == null) {
                j.a(3);
                FIN.finallyExec$NT(v);
                throw null;
            }
            else if(!m1.b) {
                object2 = m1.a;
                goto label_33;
            }
        }
        if(l1 != null) {
            object2 = WrappedValues.unescapeExceptionOrNull(l1);
        label_33:
            FIN.finallyCodeBegin$NT(v);
            lockBasedStorageManager0.lock.unlock();
            FIN.finallyCodeEnd$NT(v);
            return object2;
        }
        try {
            concurrentMap0.put(object0, l0);
            Object object3 = this.c.invoke(object0);
            Object object4 = concurrentMap0.put(object0, WrappedValues.escapeNull(object3));
            if(object4 != l0) {
                assertionError0 = this.b(object0, object4);
                throw assertionError0;
            }
            FIN.finallyExec$NT(v);
            return object3;
        }
        catch(Throwable throwable0) {
            if(!ExceptionUtilsKt.isProcessCanceledException(throwable0)) {
                ExceptionHandlingStrategy lockBasedStorageManager$ExceptionHandlingStrategy0 = lockBasedStorageManager0.a;
                if(throwable0 != assertionError0) {
                    Object object5 = concurrentMap0.put(object0, WrappedValues.escapeThrowable(throwable0));
                    if(object5 != l0) {
                        FIN.finallyExec$NT(v);
                        throw this.b(object0, object5);
                    }
                    FIN.finallyExec$NT(v);
                    throw lockBasedStorageManager$ExceptionHandlingStrategy0.handleException(throwable0);
                }
                FIN.finallyExec$NT(v);
                throw lockBasedStorageManager$ExceptionHandlingStrategy0.handleException(throwable0);
            }
            concurrentMap0.remove(object0);
            FIN.finallyExec$NT(v);
            throw (RuntimeException)throwable0;
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable
    public final boolean isComputed(Object object0) {
        Object object1 = this.b.get(object0);
        return object1 != null && object1 != l.b;
    }
}

