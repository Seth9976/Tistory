package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface TypeAliasExpansionReportStrategy {
    public static final class DO_NOTHING implements TypeAliasExpansionReportStrategy {
        @NotNull
        public static final DO_NOTHING INSTANCE;

        static {
            DO_NOTHING.INSTANCE = new DO_NOTHING();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override  // kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy
        public void boundsViolationInSubstitution(@NotNull TypeSubstitutor typeSubstitutor0, @NotNull KotlinType kotlinType0, @NotNull KotlinType kotlinType1, @NotNull TypeParameterDescriptor typeParameterDescriptor0) {
            Intrinsics.checkNotNullParameter(typeSubstitutor0, "substitutor");
            Intrinsics.checkNotNullParameter(kotlinType0, "unsubstitutedArgument");
            Intrinsics.checkNotNullParameter(kotlinType1, "argument");
            Intrinsics.checkNotNullParameter(typeParameterDescriptor0, "typeParameter");
        }

        @Override  // kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy
        public void conflictingProjection(@NotNull TypeAliasDescriptor typeAliasDescriptor0, @Nullable TypeParameterDescriptor typeParameterDescriptor0, @NotNull KotlinType kotlinType0) {
            Intrinsics.checkNotNullParameter(typeAliasDescriptor0, "typeAlias");
            Intrinsics.checkNotNullParameter(kotlinType0, "substitutedArgument");
        }

        @Override  // kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy
        public void recursiveTypeAlias(@NotNull TypeAliasDescriptor typeAliasDescriptor0) {
            Intrinsics.checkNotNullParameter(typeAliasDescriptor0, "typeAlias");
        }

        @Override  // kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy
        public void repeatedAnnotation(@NotNull AnnotationDescriptor annotationDescriptor0) {
            Intrinsics.checkNotNullParameter(annotationDescriptor0, "annotation");
        }
    }

    void boundsViolationInSubstitution(@NotNull TypeSubstitutor arg1, @NotNull KotlinType arg2, @NotNull KotlinType arg3, @NotNull TypeParameterDescriptor arg4);

    void conflictingProjection(@NotNull TypeAliasDescriptor arg1, @Nullable TypeParameterDescriptor arg2, @NotNull KotlinType arg3);

    void recursiveTypeAlias(@NotNull TypeAliasDescriptor arg1);

    void repeatedAnnotation(@NotNull AnnotationDescriptor arg1);
}

