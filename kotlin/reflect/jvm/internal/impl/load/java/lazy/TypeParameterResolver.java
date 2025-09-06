package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface TypeParameterResolver {
    public static final class EMPTY implements TypeParameterResolver {
        @NotNull
        public static final EMPTY INSTANCE;

        static {
            EMPTY.INSTANCE = new EMPTY();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver
        @Nullable
        public TypeParameterDescriptor resolveTypeParameter(@NotNull JavaTypeParameter javaTypeParameter0) {
            Intrinsics.checkNotNullParameter(javaTypeParameter0, "javaTypeParameter");
            return null;
        }
    }

    @Nullable
    TypeParameterDescriptor resolveTypeParameter(@NotNull JavaTypeParameter arg1);
}

