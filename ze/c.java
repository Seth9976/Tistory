package ze;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;

public final class c extends Lambda implements Function2 {
    public static final c w;

    static {
        c.w = new c(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        DeclarationDescriptor declarationDescriptor0 = (DeclarationDescriptor)object0;
        DeclarationDescriptor declarationDescriptor1 = (DeclarationDescriptor)object1;
        return false;
    }
}

