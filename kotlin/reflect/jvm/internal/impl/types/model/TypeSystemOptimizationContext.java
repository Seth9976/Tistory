package kotlin.reflect.jvm.internal.impl.types.model;

import org.jetbrains.annotations.NotNull;

public interface TypeSystemOptimizationContext {
    boolean identicalArguments(@NotNull SimpleTypeMarker arg1, @NotNull SimpleTypeMarker arg2);
}

