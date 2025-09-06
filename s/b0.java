package s;

import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.GraphicsLayerBlockForEnterExit;
import androidx.compose.animation.Scale;
import androidx.compose.animation.core.Transition.DeferredAnimation;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.jvm.functions.Function1;

public final class b0 implements GraphicsLayerBlockForEnterExit {
    public final DeferredAnimation a;
    public final DeferredAnimation b;
    public final Transition c;
    public final EnterTransition d;
    public final ExitTransition e;
    public final DeferredAnimation f;

    public b0(DeferredAnimation transition$DeferredAnimation0, DeferredAnimation transition$DeferredAnimation1, Transition transition0, EnterTransition enterTransition0, ExitTransition exitTransition0, DeferredAnimation transition$DeferredAnimation2) {
        this.a = transition$DeferredAnimation0;
        this.b = transition$DeferredAnimation1;
        this.c = transition0;
        this.d = enterTransition0;
        this.e = exitTransition0;
        this.f = transition$DeferredAnimation2;
    }

    @Override  // androidx.compose.animation.GraphicsLayerBlockForEnterExit
    public final Function1 init() {
        TransformOrigin transformOrigin0;
        EnterTransition enterTransition0 = this.d;
        ExitTransition exitTransition0 = this.e;
        State state0 = null;
        State state1 = this.a == null ? null : this.a.animate(new c0(enterTransition0, exitTransition0), new d0(enterTransition0, exitTransition0, 0));
        State state2 = this.b == null ? null : this.b.animate(new f0(enterTransition0, exitTransition0), new d0(enterTransition0, exitTransition0, 1));
        if(this.c.getCurrentState() == EnterExitState.PreEnter) {
            Scale scale0 = enterTransition0.getData$animation_release().getScale();
            if(scale0 == null) {
                scale0 = exitTransition0.getData$animation_release().getScale();
                transformOrigin0 = scale0 == null ? null : TransformOrigin.box-impl(scale0.getTransformOrigin-SzJe1aQ());
            }
            else {
                transformOrigin0 = TransformOrigin.box-impl(scale0.getTransformOrigin-SzJe1aQ());
            }
        }
        else {
            Scale scale1 = exitTransition0.getData$animation_release().getScale();
            if(scale1 == null) {
                scale1 = enterTransition0.getData$animation_release().getScale();
                transformOrigin0 = scale1 == null ? null : TransformOrigin.box-impl(scale1.getTransformOrigin-SzJe1aQ());
            }
            else {
                transformOrigin0 = TransformOrigin.box-impl(scale1.getTransformOrigin-SzJe1aQ());
            }
        }
        DeferredAnimation transition$DeferredAnimation0 = this.f;
        if(transition$DeferredAnimation0 != null) {
            h0 h00 = new h0(transformOrigin0, enterTransition0, exitTransition0);
            state0 = transition$DeferredAnimation0.animate(g0.w, h00);
        }
        return new e0(state1, state2, state0);
    }
}

