package s;

import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.Slide;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition.Segment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class x0 extends Lambda implements Function1 {
    public final y0 w;

    public x0(y0 y00) {
        this.w = y00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        FiniteAnimationSpec finiteAnimationSpec0;
        EnterExitState enterExitState0 = EnterExitState.Visible;
        boolean z = ((Segment)object0).isTransitioningTo(EnterExitState.PreEnter, enterExitState0);
        y0 y00 = this.w;
        if(z) {
            Slide slide0 = y00.r.getData$animation_release().getSlide();
            if(slide0 != null) {
                finiteAnimationSpec0 = slide0.getAnimationSpec();
                return finiteAnimationSpec0 == null ? EnterExitTransitionKt.c : finiteAnimationSpec0;
            }
            return EnterExitTransitionKt.c;
        }
        if(((Segment)object0).isTransitioningTo(enterExitState0, EnterExitState.PostExit)) {
            Slide slide1 = y00.s.getData$animation_release().getSlide();
            if(slide1 != null) {
                finiteAnimationSpec0 = slide1.getAnimationSpec();
                if(finiteAnimationSpec0 != null) {
                    return finiteAnimationSpec0;
                }
            }
            return EnterExitTransitionKt.c;
        }
        return EnterExitTransitionKt.c;
    }
}

