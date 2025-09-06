package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import org.jetbrains.annotations.NotNull;

public interface JvmTypeFactory {
    @NotNull
    Object boxType(@NotNull Object arg1);

    @NotNull
    Object createFromString(@NotNull String arg1);

    @NotNull
    Object createObjectType(@NotNull String arg1);

    @NotNull
    Object createPrimitiveType(@NotNull PrimitiveType arg1);

    @NotNull
    Object getJavaLangClassType();

    @NotNull
    String toString(@NotNull Object arg1);
}

