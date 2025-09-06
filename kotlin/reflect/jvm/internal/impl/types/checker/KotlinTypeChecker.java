package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import org.jetbrains.annotations.NotNull;

public interface KotlinTypeChecker {
    public interface TypeConstructorEquality {
        boolean equals(@NotNull TypeConstructor arg1, @NotNull TypeConstructor arg2);
    }

    public static final KotlinTypeChecker DEFAULT;

    static {
        KotlinTypeChecker.DEFAULT = NewKotlinTypeChecker.Companion.getDefault();
    }

    boolean equalTypes(@NotNull KotlinType arg1, @NotNull KotlinType arg2);

    boolean isSubtypeOf(@NotNull KotlinType arg1, @NotNull KotlinType arg2);
}

