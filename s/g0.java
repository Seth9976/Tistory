package s;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Transition.Segment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class g0 extends Lambda implements Function1 {
    public static final g0 w;

    static {
        g0.w = new g0(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Segment transition$Segment0 = (Segment)object0;
        return AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
    }
}

