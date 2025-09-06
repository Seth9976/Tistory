package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

public final class b implements ApproachAnimation {
    public final int a;
    public final Object b;

    public b(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // androidx.compose.foundation.gestures.snapping.ApproachAnimation
    public final Object approachAnimation(ScrollScope scrollScope0, Object object0, Object object1, Function1 function10, Continuation continuation0) {
        if(this.a != 0) {
            float f = ((Number)object0).floatValue();
            float f1 = ((Number)object1).floatValue();
            return SnapFlingBehaviorKt.access$animateWithTarget(scrollScope0, Math.signum(f1) * Math.abs(f), f, AnimationStateKt.AnimationState$default(0.0f, f1, 0L, 0L, false, 28, null), ((AnimationSpec)this.b), function10, continuation0);
        }
        return SnapFlingBehaviorKt.access$animateDecay(scrollScope0, ((Number)object0).floatValue(), AnimationStateKt.AnimationState$default(0.0f, ((Number)object1).floatValue(), 0L, 0L, false, 28, null), ((DecayAnimationSpec)this.b), function10, continuation0);
    }
}

