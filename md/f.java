package md;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Lazy;
import kotlin.UNINITIALIZED_VALUE;
import kotlin.jvm.functions.Function0;

public final class f implements Serializable, Lazy {
    public volatile Function0 a;
    public volatile Object b;
    public static final AtomicReferenceFieldUpdater c;

    static {
        f.c = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "b");
    }

    @Override  // kotlin.Lazy
    public final Object getValue() {
        Object object0 = this.b;
        UNINITIALIZED_VALUE uNINITIALIZED_VALUE0 = UNINITIALIZED_VALUE.INSTANCE;
        if(object0 != uNINITIALIZED_VALUE0) {
            return object0;
        }
        Function0 function00 = this.a;
        if(function00 != null) {
            Object object1 = function00.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = f.c;
            while(true) {
                if(atomicReferenceFieldUpdater0.compareAndSet(this, uNINITIALIZED_VALUE0, object1)) {
                    this.a = null;
                    return object1;
                }
                if(atomicReferenceFieldUpdater0.get(this) != uNINITIALIZED_VALUE0) {
                    break;
                }
            }
        }
        return this.b;
    }

    @Override  // kotlin.Lazy
    public final boolean isInitialized() {
        return this.b != UNINITIALIZED_VALUE.INSTANCE;
    }

    // 去混淆评级： 低(20)
    @Override
    public final String toString() {
        return this.isInitialized() ? String.valueOf(this.getValue()) : "Lazy value not initialized yet.";
    }
}

