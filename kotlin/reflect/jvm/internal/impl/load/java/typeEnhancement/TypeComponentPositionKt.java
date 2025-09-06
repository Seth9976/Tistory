package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class TypeComponentPositionKt {
    public static final boolean shouldEnhance(@NotNull TypeComponentPosition typeComponentPosition0) {
        Intrinsics.checkNotNullParameter(typeComponentPosition0, "<this>");
        return typeComponentPosition0 != TypeComponentPosition.INFLEXIBLE;
    }
}

