package ue;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

public final class e extends Lambda implements Function1 {
    public static final e w;

    static {
        e.w = new e(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((CallableMemberDescriptor)object0), "it");
        ReceiverParameterDescriptor receiverParameterDescriptor0 = ((CallableMemberDescriptor)object0).getExtensionReceiverParameter();
        Intrinsics.checkNotNull(receiverParameterDescriptor0);
        KotlinType kotlinType0 = receiverParameterDescriptor0.getType();
        Intrinsics.checkNotNullExpressionValue(kotlinType0, "it.extensionReceiverParameter!!.type");
        return kotlinType0;
    }
}

