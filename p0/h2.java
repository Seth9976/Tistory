package p0;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Transition.Segment;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.state.ToggleableState;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class h2 extends Lambda implements Function3 {
    public static final h2 w;

    static {
        h2.w = new h2(3);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Object object4;
        int v = ((Number)object2).intValue();
        ((Composer)object1).startReplaceableGroup(-1707702900);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1707702900, v, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:267)");
        }
        Object object3 = ((Segment)object0).getInitialState();
        ToggleableState toggleableState0 = ToggleableState.Off;
        if(object3 == toggleableState0) {
            object4 = AnimationSpecKt.tween$default(100, 0, null, 6, null);
        }
        else if(((Segment)object0).getTargetState() == toggleableState0) {
            object4 = AnimationSpecKt.snap(100);
        }
        else {
            object4 = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceableGroup();
        return object4;
    }
}

