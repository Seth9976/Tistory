package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class TypeSubstitution {
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    @JvmField
    @NotNull
    public static final TypeSubstitution EMPTY;

    static {
        TypeSubstitution.Companion = new Companion(null);
        TypeSubstitution.EMPTY = new TypeSubstitution.Companion.EMPTY.1();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitution;-><init>()V
    }

    public boolean approximateCapturedTypes() {
        return false;
    }

    public boolean approximateContravariantCapturedTypes() {
        return false;
    }

    @NotNull
    public final TypeSubstitutor buildSubstitutor() {
        TypeSubstitutor typeSubstitutor0 = TypeSubstitutor.create(this);
        Intrinsics.checkNotNullExpressionValue(typeSubstitutor0, "create(this)");
        return typeSubstitutor0;
    }

    @NotNull
    public Annotations filterAnnotations(@NotNull Annotations annotations0) {
        Intrinsics.checkNotNullParameter(annotations0, "annotations");
        return annotations0;
    }

    @Nullable
    public abstract TypeProjection get(@NotNull KotlinType arg1);

    public boolean isEmpty() {
        return false;
    }

    @NotNull
    public KotlinType prepareTopLevelType(@NotNull KotlinType kotlinType0, @NotNull Variance variance0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "topLevelType");
        Intrinsics.checkNotNullParameter(variance0, "position");
        return kotlinType0;
    }

    @NotNull
    public final TypeSubstitution replaceWithNonApproximating() {
        return new TypeSubstitution() {
            @Override  // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public boolean approximateCapturedTypes() {
                return false;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public boolean approximateContravariantCapturedTypes() {
                return false;
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
        };
    }
}

