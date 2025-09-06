package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.Transition.Segment;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class yq extends Lambda implements Function3 {
    public static final yq w;

    static {
        yq.w = new yq(3);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ((Composer)object1).startReplaceGroup(0xEF3561A0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xEF3561A0, v, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:609)");
        }
        TweenSpec tweenSpec0 = ((Segment)object0).isTransitioningTo(Boolean.FALSE, Boolean.TRUE) ? AnimationSpecKt.tween$default(150, 0, EasingKt.getLinearEasing(), 2, null) : AnimationSpecKt.tween$default(75, 0, EasingKt.getLinearEasing(), 2, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceGroup();
        return tweenSpec0;
    }
}

