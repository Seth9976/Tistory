package s;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function2 {
    public static final g w;

    static {
        g.w = new g(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.box-impl(0x100000001L), 1, null);
    }
}

