package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;
import org.jetbrains.annotations.Nullable;

public final class Java16RecordComponentsLoader.Cache {
    public final Method a;
    public final Method b;

    public Java16RecordComponentsLoader.Cache(@Nullable Method method0, @Nullable Method method1) {
        this.a = method0;
        this.b = method1;
    }

    @Nullable
    public final Method getGetAccessor() {
        return this.b;
    }

    @Nullable
    public final Method getGetType() {
        return this.a;
    }
}

