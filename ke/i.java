package ke;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;

public final class i extends Lambda implements Function1 {
    public static final i w;

    static {
        i.w = new i(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DeclarationDescriptor)object0), "it");
        return Boolean.valueOf(((DeclarationDescriptor)object0) instanceof CallableDescriptor);
    }
}

