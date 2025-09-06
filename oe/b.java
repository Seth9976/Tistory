package oe;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;

public final class b extends Lambda implements Function1 {
    public static final b w;

    static {
        b.w = new b(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((CallableMemberDescriptor)object0), "it");
        return Boolean.valueOf(BuiltinMethodsWithSpecialGenericSignature.access$getHasErasedValueParametersInJava(BuiltinMethodsWithSpecialGenericSignature.INSTANCE, ((CallableMemberDescriptor)object0)));
    }
}

