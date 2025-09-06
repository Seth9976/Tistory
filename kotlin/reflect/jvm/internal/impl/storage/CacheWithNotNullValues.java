package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

public interface CacheWithNotNullValues {
    @NotNull
    Object computeIfAbsent(Object arg1, @NotNull Function0 arg2);
}

