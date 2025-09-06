package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class StorageKt {
    @NotNull
    public static final Object getValue(@NotNull NotNullLazyValue notNullLazyValue0, @Nullable Object object0, @NotNull KProperty kProperty0) {
        Intrinsics.checkNotNullParameter(notNullLazyValue0, "<this>");
        Intrinsics.checkNotNullParameter(kProperty0, "p");
        return notNullLazyValue0.invoke();
    }

    @Nullable
    public static final Object getValue(@NotNull NullableLazyValue nullableLazyValue0, @Nullable Object object0, @NotNull KProperty kProperty0) {
        Intrinsics.checkNotNullParameter(nullableLazyValue0, "<this>");
        Intrinsics.checkNotNullParameter(kProperty0, "p");
        return nullableLazyValue0.invoke();
    }
}

