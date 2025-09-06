package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DelegatedTypeSubstitution extends TypeSubstitution {
    public final TypeSubstitution a;

    public DelegatedTypeSubstitution(@NotNull TypeSubstitution typeSubstitution0) {
        Intrinsics.checkNotNullParameter(typeSubstitution0, "substitution");
        super();
        this.a = typeSubstitution0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateCapturedTypes() {
        return this.a.approximateCapturedTypes();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateContravariantCapturedTypes() {
        return this.a.approximateContravariantCapturedTypes();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @NotNull
    public Annotations filterAnnotations(@NotNull Annotations annotations0) {
        Intrinsics.checkNotNullParameter(annotations0, "annotations");
        return this.a.filterAnnotations(annotations0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @Nullable
    public TypeProjection get(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "key");
        return this.a.get(kotlinType0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @NotNull
    public KotlinType prepareTopLevelType(@NotNull KotlinType kotlinType0, @NotNull Variance variance0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "topLevelType");
        Intrinsics.checkNotNullParameter(variance0, "position");
        return this.a.prepareTopLevelType(kotlinType0, variance0);
    }
}

