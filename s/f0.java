package s;

import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.Scale;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition.Segment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class f0 extends Lambda implements Function1 {
    public final EnterTransition w;
    public final ExitTransition x;

    public f0(EnterTransition enterTransition0, ExitTransition exitTransition0) {
        this.w = enterTransition0;
        this.x = exitTransition0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        FiniteAnimationSpec finiteAnimationSpec0;
        EnterExitState enterExitState0 = EnterExitState.Visible;
        if(((Segment)object0).isTransitioningTo(EnterExitState.PreEnter, enterExitState0)) {
            Scale scale0 = this.w.getData$animation_release().getScale();
            if(scale0 != null) {
                finiteAnimationSpec0 = scale0.getAnimationSpec();
                return finiteAnimationSpec0 == null ? EnterExitTransitionKt.b : finiteAnimationSpec0;
            }
            return EnterExitTransitionKt.b;
        }
        if(((Segment)object0).isTransitioningTo(enterExitState0, EnterExitState.PostExit)) {
            Scale scale1 = this.x.getData$animation_release().getScale();
            if(scale1 != null) {
                finiteAnimationSpec0 = scale1.getAnimationSpec();
                if(finiteAnimationSpec0 != null) {
                    return finiteAnimationSpec0;
                }
            }
            return EnterExitTransitionKt.b;
        }
        return EnterExitTransitionKt.b;
    }
}

