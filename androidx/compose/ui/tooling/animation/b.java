package androidx.compose.ui.tooling.animation;

import androidx.compose.ui.Modifier.Element;
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
        return Boolean.valueOf(Intrinsics.areEqual(((Element)object0).getClass().getName(), "androidx.compose.animation.SizeAnimationModifierElement"));
    }
}

