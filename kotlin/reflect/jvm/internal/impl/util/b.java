package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

public final class b implements Check {
    public static final b a;

    static {
        b.a = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // kotlin.reflect.jvm.internal.impl.util.Check
    public final boolean check(FunctionDescriptor functionDescriptor0) {
        Intrinsics.checkNotNullParameter(functionDescriptor0, "functionDescriptor");
        List list0 = functionDescriptor0.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(list0, "functionDescriptor.valueParameters");
        if(!(list0 instanceof Collection) || !list0.isEmpty()) {
            for(Object object0: list0) {
                Intrinsics.checkNotNullExpressionValue(((ValueParameterDescriptor)object0), "it");
                if(DescriptorUtilsKt.declaresOrInheritsDefaultValue(((ValueParameterDescriptor)object0)) || ((ValueParameterDescriptor)object0).getVarargElementType() != null) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.util.Check
    public final String getDescription() {
        return "should not have varargs or parameters with default values";
    }

    @Override  // kotlin.reflect.jvm.internal.impl.util.Check
    public final String invoke(FunctionDescriptor functionDescriptor0) {
        return DefaultImpls.invoke(this, functionDescriptor0);
    }
}

