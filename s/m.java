package s;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.LayoutModifierWithPassThroughIntrinsics;
import androidx.compose.animation.core.Transition.DeferredAnimation;
import androidx.compose.runtime.State;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;

public final class m extends LayoutModifierWithPassThroughIntrinsics {
    public final DeferredAnimation a;
    public final State b;
    public final AnimatedContentTransitionScopeImpl c;

    public m(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl0, DeferredAnimation transition$DeferredAnimation0, State state0) {
        this.c = animatedContentTransitionScopeImpl0;
        super();
        this.a = transition$DeferredAnimation0;
        this.b = state0;
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, Measurable measurable0, long v) {
        long v1;
        Placeable placeable0 = measurable0.measure-BRTryo0(v);
        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl0 = this.c;
        k k0 = new k(animatedContentTransitionScopeImpl0, this);
        l l0 = new l(animatedContentTransitionScopeImpl0);
        State state0 = this.a.animate(k0, l0);
        animatedContentTransitionScopeImpl0.setAnimatedSize$animation_release(state0);
        if(measureScope0.isLookingAhead()) {
            v1 = IntSizeKt.IntSize(placeable0.getWidth(), placeable0.getHeight());
            return MeasureScope.layout$default(measureScope0, IntSize.getWidth-impl(v1), IntSize.getHeight-impl(v1), null, new j(animatedContentTransitionScopeImpl0, placeable0, v1), 4, null);
        }
        v1 = ((IntSize)state0.getValue()).unbox-impl();
        return MeasureScope.layout$default(measureScope0, IntSize.getWidth-impl(v1), IntSize.getHeight-impl(v1), null, new j(animatedContentTransitionScopeImpl0, placeable0, v1), 4, null);
    }
}

