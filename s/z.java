package s;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition.Segment;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function3 {
    public final FiniteAnimationSpec w;

    public z(FiniteAnimationSpec finiteAnimationSpec0) {
        this.w = finiteAnimationSpec0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Segment transition$Segment0 = (Segment)object0;
        int v = ((Number)object2).intValue();
        ((Composer)object1).startReplaceGroup(438406499);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(438406499, v, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:128)");
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceGroup();
        return this.w;
    }
}

