package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import org.jetbrains.annotations.NotNull;

public interface JavaClassesTracker {
    public static final class Default implements JavaClassesTracker {
        @NotNull
        public static final Default INSTANCE;

        static {
            Default.INSTANCE = new Default();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        // 检测为 Lambda 实现
        @Override  // kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker
        public void reportClass(@NotNull JavaClassDescriptor javaClassDescriptor0) [...]
    }

    void reportClass(@NotNull JavaClassDescriptor arg1);
}

