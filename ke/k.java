package ke;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;

public final class k extends Lambda implements Function1 {
    public static final k w;

    static {
        k.w = new k(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DeclarationDescriptor)object0), "it");
        List list0 = ((CallableDescriptor)(((DeclarationDescriptor)object0))).getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(list0, "it as CallableDescriptor).typeParameters");
        return CollectionsKt___CollectionsKt.asSequence(list0);
    }
}

