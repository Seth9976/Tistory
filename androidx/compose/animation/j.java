package androidx.compose.animation;

import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function1 {
    public final AnimatedContentTransitionScopeImpl w;
    public final Function1 x;

    public j(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl0, Function1 function10) {
        this.w = animatedContentTransitionScopeImpl0;
        this.x = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v = ((Number)object0).intValue();
        State state0 = (State)this.w.getTargetSizeMap$animation_release().get(this.w.getTransition$animation_release().getTargetState());
        long v1 = state0 == null ? 0L : ((IntSize)state0.getValue()).unbox-impl();
        Integer integer0 = (int)(IntSize.getWidth-impl(v1) - IntOffset.getX-impl(AnimatedContentTransitionScopeImpl.access$calculateOffset-emnUabE(this.w, IntSizeKt.IntSize(v, v), v1)));
        return (Integer)this.x.invoke(integer0);
    }
}

