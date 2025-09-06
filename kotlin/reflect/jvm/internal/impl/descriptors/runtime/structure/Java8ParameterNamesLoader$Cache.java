package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;
import org.jetbrains.annotations.Nullable;

public final class Java8ParameterNamesLoader.Cache {
    public final Method a;
    public final Method b;

    public Java8ParameterNamesLoader.Cache(@Nullable Method method0, @Nullable Method method1) {
        this.a = method0;
        this.b = method1;
    }

    @Nullable
    public final Method getGetName() {
        return this.b;
    }

    @Nullable
    public final Method getGetParameters() {
        return this.a;
    }
}

