package androidx.compose.animation.core;

import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function1 {
    public final InfiniteTransition w;
    public final TransitionAnimationState x;

    public c(InfiniteTransition infiniteTransition0, TransitionAnimationState infiniteTransition$TransitionAnimationState0) {
        this.w = infiniteTransition0;
        this.x = infiniteTransition$TransitionAnimationState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        DisposableEffectScope disposableEffectScope0 = (DisposableEffectScope)object0;
        this.w.addAnimation$animation_core_release(this.x);
        return new InfiniteTransitionKt.animateValue.2.1.invoke..inlined.onDispose.1(this.w, this.x);
    }
}

