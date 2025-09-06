package kotlin.reflect.jvm.internal.impl.types;

import d0.s;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import md.c;
import org.jetbrains.annotations.NotNull;

public final class StarProjectionImpl extends TypeProjectionBase {
    public final TypeParameterDescriptor a;
    public final Lazy b;

    public StarProjectionImpl(@NotNull TypeParameterDescriptor typeParameterDescriptor0) {
        Intrinsics.checkNotNullParameter(typeParameterDescriptor0, "typeParameter");
        super();
        this.a = typeParameterDescriptor0;
        s s0 = new s(this, 13);
        this.b = c.lazy(LazyThreadSafetyMode.PUBLICATION, s0);
    }

    public static final TypeParameterDescriptor access$getTypeParameter$p(StarProjectionImpl starProjectionImpl0) {
        return starProjectionImpl0.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    public Variance getProjectionKind() {
        return Variance.OUT_VARIANCE;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    public KotlinType getType() {
        return (KotlinType)this.b.getValue();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public boolean isStarProjection() {
        return true;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    public TypeProjection refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefiner");
        return this;
    }
}

