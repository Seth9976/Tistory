package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface StorageManager {
    Object compute(@NotNull Function0 arg1);

    @NotNull
    CacheWithNotNullValues createCacheWithNotNullValues();

    @NotNull
    CacheWithNullableValues createCacheWithNullableValues();

    @NotNull
    NotNullLazyValue createLazyValue(@NotNull Function0 arg1);

    @NotNull
    NotNullLazyValue createLazyValueWithPostCompute(@NotNull Function0 arg1, @Nullable Function1 arg2, @NotNull Function1 arg3);

    @NotNull
    MemoizedFunctionToNotNull createMemoizedFunction(@NotNull Function1 arg1);

    @NotNull
    MemoizedFunctionToNullable createMemoizedFunctionWithNullableValues(@NotNull Function1 arg1);

    @NotNull
    NullableLazyValue createNullableLazyValue(@NotNull Function0 arg1);

    @NotNull
    NotNullLazyValue createRecursionTolerantLazyValue(@NotNull Function0 arg1, @NotNull Object arg2);
}

