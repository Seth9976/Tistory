package kotlin.reflect.jvm.internal.impl.resolve.sam;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNullableValues;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

public final class SamConversionResolverImpl implements SamConversionResolver {
    public final Iterable a;
    public final CacheWithNullableValues b;

    public SamConversionResolverImpl(@NotNull StorageManager storageManager0, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
        Intrinsics.checkNotNullParameter(iterable0, "samWithReceiverResolvers");
        super();
        this.a = iterable0;
        this.b = storageManager0.createCacheWithNullableValues();
    }
}

