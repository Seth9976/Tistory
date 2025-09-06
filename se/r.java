package se;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;

public final class r extends Lambda implements Function1 {
    public static final r w;

    static {
        r.w = new r(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((SimpleFunctionDescriptor)object0), "$this$selectMostSpecificInEachOverridableGroup");
        return (SimpleFunctionDescriptor)object0;
    }
}

