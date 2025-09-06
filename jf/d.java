package jf;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

public final class d extends Lambda implements Function1 {
    public static final d w;

    static {
        d.w = new d(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((FunctionDescriptor)object0), "$this$$receiver");
        List list0 = ((FunctionDescriptor)object0).getValueParameters();
        Intrinsics.checkNotNullExpressionValue(list0, "valueParameters");
        ValueParameterDescriptor valueParameterDescriptor0 = (ValueParameterDescriptor)CollectionsKt___CollectionsKt.lastOrNull(list0);
        return valueParameterDescriptor0 == null || DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor0) || valueParameterDescriptor0.getVarargElementType() != null ? "last parameter should not have a default value or be a vararg" : null;
    }
}

