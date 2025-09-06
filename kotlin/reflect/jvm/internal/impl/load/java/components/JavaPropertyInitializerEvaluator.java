package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface JavaPropertyInitializerEvaluator {
    public static final class DoNothing implements JavaPropertyInitializerEvaluator {
        @NotNull
        public static final DoNothing INSTANCE;

        static {
            DoNothing.INSTANCE = new DoNothing();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override  // kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator
        @Nullable
        public ConstantValue getInitializerConstant(@NotNull JavaField javaField0, @NotNull PropertyDescriptor propertyDescriptor0) {
            Intrinsics.checkNotNullParameter(javaField0, "field");
            Intrinsics.checkNotNullParameter(propertyDescriptor0, "descriptor");
            return null;
        }
    }

    @Nullable
    ConstantValue getInitializerConstant(@NotNull JavaField arg1, @NotNull PropertyDescriptor arg2);
}

