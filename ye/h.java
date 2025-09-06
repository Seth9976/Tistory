package ye;

import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;

public final class h extends Lambda implements Function1 {
    public static final h w;

    static {
        h.w = new h(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DescriptorRendererOptions)object0), "$this$withOptions");
        ((DescriptorRendererOptions)object0).setExcludedTypeAnnotationClasses(g0.plus(((DescriptorRendererOptions)object0).getExcludedTypeAnnotationClasses(), CollectionsKt__CollectionsKt.listOf(new FqName[]{FqNames.extensionFunctionType, FqNames.contextFunctionTypeParams})));
        return Unit.INSTANCE;
    }
}

