package androidx.compose.animation;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function1 {
    public final Function1 w;
    public final AnimatedContentTransitionScopeImpl x;

    public h(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl0, Function1 function10) {
        this.w = function10;
        this.x = animatedContentTransitionScopeImpl0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v = ((Number)object0).intValue();
        long v1 = AnimatedContentTransitionScopeImpl.access$getCurrentSize-YbymL2g(this.x);
        Integer integer0 = (int)(-IntOffset.getY-impl(AnimatedContentTransitionScopeImpl.access$calculateOffset-emnUabE(this.x, IntSizeKt.IntSize(v, v), v1)) - v);
        return (Integer)this.w.invoke(integer0);
    }
}

