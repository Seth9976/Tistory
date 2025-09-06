package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey;
import org.jetbrains.annotations.NotNull;

public final class DescriptorBasedDeprecationInfoKt {
    public static final DescriptorBasedDeprecationInfoKt.DEPRECATED_FUNCTION_KEY.1 a;

    static {
        DescriptorBasedDeprecationInfoKt.a = new DescriptorBasedDeprecationInfoKt.DEPRECATED_FUNCTION_KEY.1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    public static final UserDataKey getDEPRECATED_FUNCTION_KEY() {
        return DescriptorBasedDeprecationInfoKt.a;
    }
}

