package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public static final a w;

    static {
        a.w = new a(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DescriptorRendererOptions)object0), "$this$withOptions");
        ((DescriptorRendererOptions)object0).setModifiers(f0.emptySet());
        ((DescriptorRendererOptions)object0).setClassifierNamePolicy(SHORT.INSTANCE);
        ((DescriptorRendererOptions)object0).setParameterNameRenderingPolicy(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
        return Unit.INSTANCE;
    }
}

