package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DisjointKeysUnionTypeSubstitution extends TypeSubstitution {
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final TypeSubstitution create(@NotNull TypeSubstitution typeSubstitution0, @NotNull TypeSubstitution typeSubstitution1) {
            Intrinsics.checkNotNullParameter(typeSubstitution0, "first");
            Intrinsics.checkNotNullParameter(typeSubstitution1, "second");
            if(typeSubstitution0.isEmpty()) {
                return typeSubstitution1;
            }
            return typeSubstitution1.isEmpty() ? typeSubstitution0 : new DisjointKeysUnionTypeSubstitution(typeSubstitution0, typeSubstitution1, null);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final TypeSubstitution a;
    public final TypeSubstitution b;

    static {
        DisjointKeysUnionTypeSubstitution.Companion = new Companion(null);
    }

    public DisjointKeysUnionTypeSubstitution(TypeSubstitution typeSubstitution0, TypeSubstitution typeSubstitution1, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = typeSubstitution0;
        this.b = typeSubstitution1;
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateCapturedTypes() {
        return this.a.approximateCapturedTypes() || this.b.approximateCapturedTypes();
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateContravariantCapturedTypes() {
        return this.a.approximateContravariantCapturedTypes() || this.b.approximateContravariantCapturedTypes();
    }

    @JvmStatic
    @NotNull
    public static final TypeSubstitution create(@NotNull TypeSubstitution typeSubstitution0, @NotNull TypeSubstitution typeSubstitution1) {
        return DisjointKeysUnionTypeSubstitution.Companion.create(typeSubstitution0, typeSubstitution1);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @NotNull
    public Annotations filterAnnotations(@NotNull Annotations annotations0) {
        Intrinsics.checkNotNullParameter(annotations0, "annotations");
        Annotations annotations1 = this.a.filterAnnotations(annotations0);
        return this.b.filterAnnotations(annotations1);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @Nullable
    public TypeProjection get(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "key");
        TypeProjection typeProjection0 = this.a.get(kotlinType0);
        return typeProjection0 == null ? this.b.get(kotlinType0) : typeProjection0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @NotNull
    public KotlinType prepareTopLevelType(@NotNull KotlinType kotlinType0, @NotNull Variance variance0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "topLevelType");
        Intrinsics.checkNotNullParameter(variance0, "position");
        KotlinType kotlinType1 = this.a.prepareTopLevelType(kotlinType0, variance0);
        return this.b.prepareTopLevelType(kotlinType1, variance0);
    }
}

