package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;

public final class f implements ExceptionHandlingStrategy {
    @Override  // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$ExceptionHandlingStrategy
    public final RuntimeException handleException(Throwable throwable0) {
        if(throwable0 != null) {
            throw ExceptionUtilsKt.rethrow(throwable0);
        }
        throw new IllegalArgumentException("Argument for @NotNull parameter \'throwable\' of kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1.handleException must not be null");
    }
}

