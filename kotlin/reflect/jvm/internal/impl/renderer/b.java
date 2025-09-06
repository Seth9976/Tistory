package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public static final b w;

    static {
        b.w = new b(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DescriptorRendererOptions)object0), "$this$withOptions");
        ((DescriptorRendererOptions)object0).setDebugMode(true);
        ((DescriptorRendererOptions)object0).setClassifierNamePolicy(FULLY_QUALIFIED.INSTANCE);
        ((DescriptorRendererOptions)object0).setModifiers(DescriptorRendererModifier.ALL);
        return Unit.INSTANCE;
    }
}

