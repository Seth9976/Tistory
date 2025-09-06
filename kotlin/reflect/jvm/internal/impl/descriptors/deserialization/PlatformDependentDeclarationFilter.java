package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import org.jetbrains.annotations.NotNull;

public interface PlatformDependentDeclarationFilter {
    public static final class All implements PlatformDependentDeclarationFilter {
        @NotNull
        public static final All INSTANCE;

        static {
            All.INSTANCE = new All();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
        public boolean isFunctionAvailable(@NotNull ClassDescriptor classDescriptor0, @NotNull SimpleFunctionDescriptor simpleFunctionDescriptor0) {
            Intrinsics.checkNotNullParameter(classDescriptor0, "classDescriptor");
            Intrinsics.checkNotNullParameter(simpleFunctionDescriptor0, "functionDescriptor");
            return true;
        }
    }

    public static final class NoPlatformDependent implements PlatformDependentDeclarationFilter {
        @NotNull
        public static final NoPlatformDependent INSTANCE;

        static {
            NoPlatformDependent.INSTANCE = new NoPlatformDependent();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
        public boolean isFunctionAvailable(@NotNull ClassDescriptor classDescriptor0, @NotNull SimpleFunctionDescriptor simpleFunctionDescriptor0) {
            Intrinsics.checkNotNullParameter(classDescriptor0, "classDescriptor");
            Intrinsics.checkNotNullParameter(simpleFunctionDescriptor0, "functionDescriptor");
            return !simpleFunctionDescriptor0.getAnnotations().hasAnnotation(PlatformDependentDeclarationFilterKt.getPLATFORM_DEPENDENT_ANNOTATION_FQ_NAME());
        }
    }

    boolean isFunctionAvailable(@NotNull ClassDescriptor arg1, @NotNull SimpleFunctionDescriptor arg2);
}

