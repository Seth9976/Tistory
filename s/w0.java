package s;

import androidx.compose.animation.ChangeSize;
import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition.Segment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class w0 extends Lambda implements Function1 {
    public final y0 w;

    public w0(y0 y00) {
        this.w = y00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        EnterExitState enterExitState0 = EnterExitState.Visible;
        boolean z = ((Segment)object0).isTransitioningTo(EnterExitState.PreEnter, enterExitState0);
        FiniteAnimationSpec finiteAnimationSpec0 = null;
        y0 y00 = this.w;
        if(z) {
            ChangeSize changeSize0 = y00.r.getData$animation_release().getChangeSize();
            if(changeSize0 != null) {
                finiteAnimationSpec0 = changeSize0.getAnimationSpec();
            }
        }
        else if(((Segment)object0).isTransitioningTo(enterExitState0, EnterExitState.PostExit)) {
            ChangeSize changeSize1 = y00.s.getData$animation_release().getChangeSize();
            if(changeSize1 != null) {
                finiteAnimationSpec0 = changeSize1.getAnimationSpec();
            }
        }
        else {
            finiteAnimationSpec0 = EnterExitTransitionKt.d;
        }
        return finiteAnimationSpec0 == null ? EnterExitTransitionKt.d : finiteAnimationSpec0;
    }
}

