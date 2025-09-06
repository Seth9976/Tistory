package p0;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.Transition.Segment;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class ub extends Lambda implements Function3 {
    public static final ub w;

    static {
        ub.w = new ub(3);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Object object3;
        int v = ((Number)object2).intValue();
        ((Composer)object1).startReplaceableGroup(-1079955085);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1079955085, v, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:286)");
        }
        s4 s40 = s4.a;
        s4 s41 = s4.b;
        if(((Segment)object0).isTransitioningTo(s40, s41)) {
            object3 = AnimationSpecKt.tween$default(67, 0, EasingKt.getLinearEasing(), 2, null);
        }
        else if(((Segment)object0).isTransitioningTo(s41, s40) || ((Segment)object0).isTransitioningTo(s4.c, s41)) {
            object3 = AnimationSpecKt.tween(83, 67, EasingKt.getLinearEasing());
        }
        else {
            object3 = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceableGroup();
        return object3;
    }
}

