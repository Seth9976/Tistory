package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;
import org.jetbrains.annotations.Nullable;

public final class Java16SealedRecordLoader.Cache {
    public final Method a;
    public final Method b;
    public final Method c;
    public final Method d;

    public Java16SealedRecordLoader.Cache(@Nullable Method method0, @Nullable Method method1, @Nullable Method method2, @Nullable Method method3) {
        this.a = method0;
        this.b = method1;
        this.c = method2;
        this.d = method3;
    }

    @Nullable
    public final Method getGetPermittedSubclasses() {
        return this.b;
    }

    @Nullable
    public final Method getGetRecordComponents() {
        return this.d;
    }

    @Nullable
    public final Method isRecord() {
        return this.c;
    }

    @Nullable
    public final Method isSealed() {
        return this.a;
    }
}

