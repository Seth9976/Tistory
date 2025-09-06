package s;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.Transition.Segment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class v0 extends Lambda implements Function1 {
    public static final v0 w;

    static {
        v0.w = new v0(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Segment transition$Segment0 = (Segment)object0;
        return EnterExitTransitionKt.c;
    }
}

