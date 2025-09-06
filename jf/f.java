package jf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.OperatorChecks;

public final class f extends Lambda implements Function1 {
    public static final f w;

    static {
        f.w = new f(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        boolean z1;
        Intrinsics.checkNotNullParameter(((FunctionDescriptor)object0), "$this$$receiver");
        ReceiverParameterDescriptor receiverParameterDescriptor0 = ((FunctionDescriptor)object0).getDispatchReceiverParameter();
        if(receiverParameterDescriptor0 == null) {
            receiverParameterDescriptor0 = ((FunctionDescriptor)object0).getExtensionReceiverParameter();
        }
        OperatorChecks operatorChecks0 = OperatorChecks.INSTANCE;
        boolean z = false;
        if(receiverParameterDescriptor0 != null) {
            KotlinType kotlinType0 = ((FunctionDescriptor)object0).getReturnType();
            if(kotlinType0 == null) {
                z1 = false;
            }
            else {
                KotlinType kotlinType1 = receiverParameterDescriptor0.getType();
                Intrinsics.checkNotNullExpressionValue(kotlinType1, "receiver.type");
                z1 = TypeUtilsKt.isSubtypeOf(kotlinType0, kotlinType1);
            }
            if(z1 || OperatorChecks.access$incDecCheckForExpectClass(operatorChecks0, ((FunctionDescriptor)object0), receiverParameterDescriptor0)) {
                z = true;
            }
        }
        return !z ? "receiver must be a supertype of the return type" : null;
    }
}

