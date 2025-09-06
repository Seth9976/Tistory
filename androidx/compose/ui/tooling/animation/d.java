package androidx.compose.ui.tooling.animation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function1 {
    public final AnimationSearch w;

    public d(AnimationSearch animationSearch0) {
        this.w = animationSearch0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((PreviewAnimationClock)this.w.a.invoke()).trackInfiniteTransition(((InfiniteTransitionSearchInfo)object0));
        return Unit.INSTANCE;
    }
}

