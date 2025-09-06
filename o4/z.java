package o4;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function1 {
    public static final z w;

    static {
        z.w = new z(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        AnimatedContentTransitionScope animatedContentTransitionScope0 = (AnimatedContentTransitionScope)object0;
        return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
    }
}

