package md;

import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class c {
    @NotNull
    public static final Lazy lazy(@Nullable Object object0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "initializer");
        return new h(object0, function00);
    }

    @NotNull
    public static Lazy lazy(@NotNull LazyThreadSafetyMode lazyThreadSafetyMode0, @NotNull Function0 function00) [...] // Inlined contents

    @NotNull
    public static Lazy lazy(@NotNull Function0 function00) [...] // Inlined contents
}

