package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class CapturedTypeApproximationKt.substituteCapturedTypesWithProjections.typeSubstitutor.1 extends TypeConstructorSubstitution {
    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
    @Nullable
    public TypeProjection get(@NotNull TypeConstructor typeConstructor0) {
        Intrinsics.checkNotNullParameter(typeConstructor0, "key");
        CapturedTypeConstructor capturedTypeConstructor0 = typeConstructor0 instanceof CapturedTypeConstructor ? ((CapturedTypeConstructor)typeConstructor0) : null;
        if(capturedTypeConstructor0 == null) {
            return null;
        }
        if(capturedTypeConstructor0.getProjection().isStarProjection()) {
            KotlinType kotlinType0 = capturedTypeConstructor0.getProjection().getType();
            return new TypeProjectionImpl(Variance.OUT_VARIANCE, kotlinType0);
        }
        return capturedTypeConstructor0.getProjection();
    }
}

