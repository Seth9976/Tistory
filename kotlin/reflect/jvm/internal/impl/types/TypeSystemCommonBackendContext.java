package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface TypeSystemCommonBackendContext extends TypeSystemContext {
    @Nullable
    FqNameUnsafe getClassFqNameUnsafe(@NotNull TypeConstructorMarker arg1);

    @Nullable
    PrimitiveType getPrimitiveArrayType(@NotNull TypeConstructorMarker arg1);

    @Nullable
    PrimitiveType getPrimitiveType(@NotNull TypeConstructorMarker arg1);

    @NotNull
    KotlinTypeMarker getRepresentativeUpperBound(@NotNull TypeParameterMarker arg1);

    @Nullable
    KotlinTypeMarker getUnsubstitutedUnderlyingType(@NotNull KotlinTypeMarker arg1);

    boolean hasAnnotation(@NotNull KotlinTypeMarker arg1, @NotNull FqName arg2);

    boolean isInlineClass(@NotNull TypeConstructorMarker arg1);

    boolean isUnderKotlinPackage(@NotNull TypeConstructorMarker arg1);

    @NotNull
    KotlinTypeMarker makeNullable(@NotNull KotlinTypeMarker arg1);
}

