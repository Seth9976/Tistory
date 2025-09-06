package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

public interface PlatformDependentTypeTransformer {
    public static final class None implements PlatformDependentTypeTransformer {
        @NotNull
        public static final None INSTANCE;

        static {
            None.INSTANCE = new None();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentTypeTransformer
        @NotNull
        public SimpleType transformPlatformType(@NotNull ClassId classId0, @NotNull SimpleType simpleType0) {
            Intrinsics.checkNotNullParameter(classId0, "classId");
            Intrinsics.checkNotNullParameter(simpleType0, "computedType");
            return simpleType0;
        }
    }

    @NotNull
    SimpleType transformPlatformType(@NotNull ClassId arg1, @NotNull SimpleType arg2);
}

