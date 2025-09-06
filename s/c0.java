package s;

import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.Fade;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition.Segment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class c0 extends Lambda implements Function1 {
    public final EnterTransition w;
    public final ExitTransition x;

    public c0(EnterTransition enterTransition0, ExitTransition exitTransition0) {
        this.w = enterTransition0;
        this.x = exitTransition0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        FiniteAnimationSpec finiteAnimationSpec0;
        EnterExitState enterExitState0 = EnterExitState.Visible;
        if(((Segment)object0).isTransitioningTo(EnterExitState.PreEnter, enterExitState0)) {
            Fade fade0 = this.w.getData$animation_release().getFade();
            if(fade0 != null) {
                finiteAnimationSpec0 = fade0.getAnimationSpec();
                return finiteAnimationSpec0 == null ? EnterExitTransitionKt.b : finiteAnimationSpec0;
            }
            return EnterExitTransitionKt.b;
        }
        if(((Segment)object0).isTransitioningTo(enterExitState0, EnterExitState.PostExit)) {
            Fade fade1 = this.x.getData$animation_release().getFade();
            if(fade1 != null) {
                finiteAnimationSpec0 = fade1.getAnimationSpec();
                if(finiteAnimationSpec0 != null) {
                    return finiteAnimationSpec0;
                }
            }
            return EnterExitTransitionKt.b;
        }
        return EnterExitTransitionKt.b;
    }
}

