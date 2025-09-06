package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy.DoCustomTransform;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import org.jetbrains.annotations.NotNull;

public final class ClassicTypeSystemContext.substitutionSupertypePolicy.2 extends DoCustomTransform {
    public final ClassicTypeSystemContext a;
    public final TypeSubstitutor b;

    public ClassicTypeSystemContext.substitutionSupertypePolicy.2(ClassicTypeSystemContext classicTypeSystemContext0, TypeSubstitutor typeSubstitutor0) {
        this.a = classicTypeSystemContext0;
        this.b = typeSubstitutor0;
        super();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$SupertypesPolicy
    @NotNull
    public SimpleTypeMarker transformType(@NotNull TypeCheckerState typeCheckerState0, @NotNull KotlinTypeMarker kotlinTypeMarker0) {
        Intrinsics.checkNotNullParameter(typeCheckerState0, "state");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "type");
        SimpleTypeMarker simpleTypeMarker0 = this.a.lowerBoundIfFlexible(kotlinTypeMarker0);
        Intrinsics.checkNotNull(simpleTypeMarker0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
        KotlinType kotlinType0 = this.b.safeSubstitute(((KotlinType)simpleTypeMarker0), Variance.INVARIANT);
        Intrinsics.checkNotNullExpressionValue(kotlinType0, "substitutor.safeSubstitu…VARIANT\n                )");
        SimpleTypeMarker simpleTypeMarker1 = this.a.asSimpleType(kotlinType0);
        Intrinsics.checkNotNull(simpleTypeMarker1);
        return simpleTypeMarker1;
    }
}

