package s;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.SizeTransform;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition.Segment;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function1 {
    public final AnimatedContentTransitionScopeImpl w;
    public final m x;

    public k(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl0, m m0) {
        this.w = animatedContentTransitionScopeImpl0;
        this.x = m0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        State state0 = (State)this.w.getTargetSizeMap$animation_release().get(((Segment)object0).getInitialState());
        long v = state0 == null ? 0L : ((IntSize)state0.getValue()).unbox-impl();
        State state1 = (State)this.w.getTargetSizeMap$animation_release().get(((Segment)object0).getTargetState());
        long v1 = state1 == null ? 0L : ((IntSize)state1.getValue()).unbox-impl();
        SizeTransform sizeTransform0 = (SizeTransform)this.x.b.getValue();
        if(sizeTransform0 != null) {
            FiniteAnimationSpec finiteAnimationSpec0 = sizeTransform0.createAnimationSpec-TemP2vQ(v, v1);
            if(finiteAnimationSpec0 != null) {
                return finiteAnimationSpec0;
            }
        }
        return AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
    }
}

