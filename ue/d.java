package ue;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

public final class d extends Lambda implements Function1 {
    public static final d w;

    static {
        d.w = new d(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ClassifierDescriptor classifierDescriptor0 = ((UnwrappedType)object0).getConstructor().getDeclarationDescriptor();
        if(classifierDescriptor0 == null) {
            return false;
        }
        return !Intrinsics.areEqual(classifierDescriptor0.getName(), JavaToKotlinClassMap.INSTANCE.getFUNCTION_N_FQ_NAME().shortName()) || !Intrinsics.areEqual(DescriptorUtilsKt.fqNameOrNull(classifierDescriptor0), JavaToKotlinClassMap.INSTANCE.getFUNCTION_N_FQ_NAME()) ? false : true;
    }
}

