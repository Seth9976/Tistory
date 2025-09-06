package ye;

import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;

public final class b extends Lambda implements Function1 {
    public static final b w;

    static {
        b.w = new b(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DescriptorRendererOptions)object0), "$this$withOptions");
        ((DescriptorRendererOptions)object0).setWithDefinedIn(false);
        ((DescriptorRendererOptions)object0).setModifiers(f0.emptySet());
        ((DescriptorRendererOptions)object0).setWithoutSuperTypes(true);
        return Unit.INSTANCE;
    }
}

