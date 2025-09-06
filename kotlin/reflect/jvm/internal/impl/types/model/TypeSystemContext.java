package kotlin.reflect.jvm.internal.impl.types.model;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nTypeSystemContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeSystemContext.kt\norg/jetbrains/kotlin/types/model/TypeSystemContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,578:1\n1#2:579\n*E\n"})
public interface TypeSystemContext extends TypeSystemOptimizationContext {
    boolean areEqualTypeConstructors(@NotNull TypeConstructorMarker arg1, @NotNull TypeConstructorMarker arg2);

    int argumentsCount(@NotNull KotlinTypeMarker arg1);

    @NotNull
    TypeArgumentListMarker asArgumentList(@NotNull SimpleTypeMarker arg1);

    @Nullable
    CapturedTypeMarker asCapturedType(@NotNull SimpleTypeMarker arg1);

    @Nullable
    DefinitelyNotNullTypeMarker asDefinitelyNotNullType(@NotNull SimpleTypeMarker arg1);

    @Nullable
    DynamicTypeMarker asDynamicType(@NotNull FlexibleTypeMarker arg1);

    @Nullable
    FlexibleTypeMarker asFlexibleType(@NotNull KotlinTypeMarker arg1);

    @Nullable
    RawTypeMarker asRawType(@NotNull FlexibleTypeMarker arg1);

    @Nullable
    SimpleTypeMarker asSimpleType(@NotNull KotlinTypeMarker arg1);

    @NotNull
    TypeArgumentMarker asTypeArgument(@NotNull KotlinTypeMarker arg1);

    @Nullable
    SimpleTypeMarker captureFromArguments(@NotNull SimpleTypeMarker arg1, @NotNull CaptureStatus arg2);

    @NotNull
    CaptureStatus captureStatus(@NotNull CapturedTypeMarker arg1);

    @Nullable
    List fastCorrespondingSupertypes(@NotNull SimpleTypeMarker arg1, @NotNull TypeConstructorMarker arg2);

    @NotNull
    TypeArgumentMarker get(@NotNull TypeArgumentListMarker arg1, int arg2);

    @NotNull
    TypeArgumentMarker getArgument(@NotNull KotlinTypeMarker arg1, int arg2);

    @Nullable
    TypeArgumentMarker getArgumentOrNull(@NotNull SimpleTypeMarker arg1, int arg2);

    @NotNull
    List getArguments(@NotNull KotlinTypeMarker arg1);

    @NotNull
    TypeParameterMarker getParameter(@NotNull TypeConstructorMarker arg1, int arg2);

    @NotNull
    List getParameters(@NotNull TypeConstructorMarker arg1);

    @NotNull
    KotlinTypeMarker getType(@NotNull TypeArgumentMarker arg1);

    @Nullable
    TypeParameterMarker getTypeParameter(@NotNull TypeVariableTypeConstructorMarker arg1);

    @Nullable
    TypeParameterMarker getTypeParameterClassifier(@NotNull TypeConstructorMarker arg1);

    @NotNull
    List getUpperBounds(@NotNull TypeParameterMarker arg1);

    @NotNull
    TypeVariance getVariance(@NotNull TypeArgumentMarker arg1);

    @NotNull
    TypeVariance getVariance(@NotNull TypeParameterMarker arg1);

    boolean hasFlexibleNullability(@NotNull KotlinTypeMarker arg1);

    boolean hasRecursiveBounds(@NotNull TypeParameterMarker arg1, @Nullable TypeConstructorMarker arg2);

    @NotNull
    KotlinTypeMarker intersectTypes(@NotNull List arg1);

    boolean isAnyConstructor(@NotNull TypeConstructorMarker arg1);

    boolean isCapturedType(@NotNull KotlinTypeMarker arg1);

    boolean isClassType(@NotNull SimpleTypeMarker arg1);

    boolean isClassTypeConstructor(@NotNull TypeConstructorMarker arg1);

    boolean isCommonFinalClassConstructor(@NotNull TypeConstructorMarker arg1);

    boolean isDefinitelyNotNullType(@NotNull KotlinTypeMarker arg1);

    boolean isDenotable(@NotNull TypeConstructorMarker arg1);

    boolean isDynamic(@NotNull KotlinTypeMarker arg1);

    boolean isError(@NotNull KotlinTypeMarker arg1);

    boolean isIntegerLiteralType(@NotNull SimpleTypeMarker arg1);

    boolean isIntegerLiteralTypeConstructor(@NotNull TypeConstructorMarker arg1);

    boolean isIntersection(@NotNull TypeConstructorMarker arg1);

    boolean isMarkedNullable(@NotNull KotlinTypeMarker arg1);

    boolean isMarkedNullable(@NotNull SimpleTypeMarker arg1);

    boolean isNotNullTypeParameter(@NotNull KotlinTypeMarker arg1);

    boolean isNothing(@NotNull KotlinTypeMarker arg1);

    boolean isNothingConstructor(@NotNull TypeConstructorMarker arg1);

    boolean isNullableType(@NotNull KotlinTypeMarker arg1);

    boolean isOldCapturedType(@NotNull CapturedTypeMarker arg1);

    boolean isPrimitiveType(@NotNull SimpleTypeMarker arg1);

    boolean isProjectionNotNull(@NotNull CapturedTypeMarker arg1);

    boolean isSingleClassifierType(@NotNull SimpleTypeMarker arg1);

    boolean isStarProjection(@NotNull TypeArgumentMarker arg1);

    boolean isStubType(@NotNull SimpleTypeMarker arg1);

    boolean isStubTypeForBuilderInference(@NotNull SimpleTypeMarker arg1);

    boolean isTypeVariableType(@NotNull KotlinTypeMarker arg1);

    @NotNull
    SimpleTypeMarker lowerBound(@NotNull FlexibleTypeMarker arg1);

    @NotNull
    SimpleTypeMarker lowerBoundIfFlexible(@NotNull KotlinTypeMarker arg1);

    @Nullable
    KotlinTypeMarker lowerType(@NotNull CapturedTypeMarker arg1);

    @NotNull
    KotlinTypeMarker makeDefinitelyNotNullOrNotNull(@NotNull KotlinTypeMarker arg1);

    @NotNull
    SimpleTypeMarker original(@NotNull DefinitelyNotNullTypeMarker arg1);

    @NotNull
    SimpleTypeMarker originalIfDefinitelyNotNullable(@NotNull SimpleTypeMarker arg1);

    int parametersCount(@NotNull TypeConstructorMarker arg1);

    @NotNull
    Collection possibleIntegerTypes(@NotNull SimpleTypeMarker arg1);

    @NotNull
    TypeArgumentMarker projection(@NotNull CapturedTypeConstructorMarker arg1);

    int size(@NotNull TypeArgumentListMarker arg1);

    @NotNull
    SupertypesPolicy substitutionSupertypePolicy(@NotNull SimpleTypeMarker arg1);

    @NotNull
    Collection supertypes(@NotNull TypeConstructorMarker arg1);

    @NotNull
    CapturedTypeConstructorMarker typeConstructor(@NotNull CapturedTypeMarker arg1);

    @NotNull
    TypeConstructorMarker typeConstructor(@NotNull KotlinTypeMarker arg1);

    @NotNull
    TypeConstructorMarker typeConstructor(@NotNull SimpleTypeMarker arg1);

    @NotNull
    SimpleTypeMarker upperBound(@NotNull FlexibleTypeMarker arg1);

    @NotNull
    SimpleTypeMarker upperBoundIfFlexible(@NotNull KotlinTypeMarker arg1);

    @NotNull
    KotlinTypeMarker withNullability(@NotNull KotlinTypeMarker arg1, boolean arg2);

    @NotNull
    SimpleTypeMarker withNullability(@NotNull SimpleTypeMarker arg1, boolean arg2);
}

