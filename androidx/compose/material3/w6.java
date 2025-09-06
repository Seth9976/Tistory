package androidx.compose.material3;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class w6 extends Lambda implements Function1 {
    public final int w;

    public w6(int v) {
        this.w = v;
        super(1);
    }

    // 去混淆评级： 低(40)
    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return DisplayMode.equals-impl0(((DisplayMode)((AnimatedContentTransitionScope)object0).getTargetState()).unbox-impl(), 1) ? ((AnimatedContentTransitionScope)object0).using(AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically$default(null, a5.C, 1, null).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(100, 100, null, 4, null), 0.0f, 2, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, 2, null).plus(EnterExitTransitionKt.slideOutVertically$default(null, new v6(this.w, 0), 1, null))), AnimatedContentKt.SizeTransform(true, u4.C)) : ((AnimatedContentTransitionScope)object0).using(AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically(AnimationSpecKt.tween$default(0, 50, null, 5, null), new v6(this.w, 1)).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(100, 100, null, 4, null), 0.0f, 2, null)), EnterExitTransitionKt.slideOutVertically$default(null, a5.D, 1, null).plus(EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, 2, null))), AnimatedContentKt.SizeTransform(true, u4.C));
    }
}

