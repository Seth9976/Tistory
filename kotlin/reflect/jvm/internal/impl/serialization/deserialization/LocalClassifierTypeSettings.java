package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface LocalClassifierTypeSettings {
    public static final class Default implements LocalClassifierTypeSettings {
        @NotNull
        public static final Default INSTANCE;

        static {
            Default.INSTANCE = new Default();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        // 检测为 Lambda 实现
        @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings
        @Nullable
        public SimpleType getReplacementTypeForLocalClassifiers() [...]
    }

    @Nullable
    SimpleType getReplacementTypeForLocalClassifiers();
}

