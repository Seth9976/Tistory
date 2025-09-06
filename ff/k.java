package ff;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;

public final class k implements Function1 {
    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(((FqName)object0) == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter \'name\' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
        }
        return Boolean.valueOf(!((FqName)object0).equals(FqNames.unsafeVariance));
    }
}

