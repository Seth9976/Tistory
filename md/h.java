package md;

import java.io.Serializable;
import kotlin.Lazy;
import kotlin.UNINITIALIZED_VALUE;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class h implements Serializable, Lazy {
    public Function0 a;
    public volatile Object b;
    public final Object c;

    public h(Object object0, Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "initializer");
        super();
        this.a = function00;
        this.b = UNINITIALIZED_VALUE.INSTANCE;
        if(object0 == null) {
            object0 = this;
        }
        this.c = object0;
    }

    @Override  // kotlin.Lazy
    public final Object getValue() {
        Object object0 = this.b;
        UNINITIALIZED_VALUE uNINITIALIZED_VALUE0 = UNINITIALIZED_VALUE.INSTANCE;
        if(object0 != uNINITIALIZED_VALUE0) {
            return object0;
        }
        synchronized(this.c) {
            Object object2 = this.b;
            if(object2 == uNINITIALIZED_VALUE0) {
                Function0 function00 = this.a;
                Intrinsics.checkNotNull(function00);
                object2 = function00.invoke();
                this.b = object2;
                this.a = null;
            }
            return object2;
        }
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

