package s;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function1 {
    public final AnimatedContentTransitionScopeImpl w;

    public l(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl0) {
        this.w = animatedContentTransitionScopeImpl0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        State state0 = (State)this.w.getTargetSizeMap$animation_release().get(object0);
        return state0 == null ? IntSize.box-impl(0L) : IntSize.box-impl(((IntSize)state0.getValue()).unbox-impl());
    }
}

