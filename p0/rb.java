package p0;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Transition.Segment;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class rb extends Lambda implements Function3 {
    public static final rb w;

    static {
        rb.w = new rb(3);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Segment transition$Segment0 = (Segment)object0;
        int v = ((Number)object2).intValue();
        ((Composer)object1).startReplaceableGroup(0xFE0D8738);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFE0D8738, v, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:322)");
        }
        TweenSpec tweenSpec0 = AnimationSpecKt.tween$default(150, 0, null, 6, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceableGroup();
        return tweenSpec0;
    }
}

