package ze;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;

public final class b extends Lambda implements Function2 {
    public static final b w;

    static {
        b.w = new b(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        DeclarationDescriptor declarationDescriptor0 = (DeclarationDescriptor)object0;
        DeclarationDescriptor declarationDescriptor1 = (DeclarationDescriptor)object1;
        return false;
    }
}

