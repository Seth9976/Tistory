package p0;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.Transition.Segment;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class f5 extends Lambda implements Function3 {
    public static final f5 w;

    static {
        f5.w = new f5(3);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ((Composer)object1).startReplaceableGroup(-800950068);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-800950068, v, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:72)");
        }
        TweenSpec tweenSpec0 = ((Segment)object0).isTransitioningTo(Boolean.FALSE, Boolean.TRUE) ? AnimationSpecKt.tween$default(120, 0, EasingKt.getLinearOutSlowInEasing(), 2, null) : AnimationSpecKt.tween$default(1, 74, null, 4, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceableGroup();
        return tweenSpec0;
    }
}

