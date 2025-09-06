package androidx.compose.animation.core;

import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function1 {
    public final Transition w;
    public final TransitionAnimationState x;

    public i(Transition transition0, TransitionAnimationState transition$TransitionAnimationState0) {
        this.w = transition0;
        this.x = transition$TransitionAnimationState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        DisposableEffectScope disposableEffectScope0 = (DisposableEffectScope)object0;
        this.w.addAnimation$animation_core_release(this.x);
        return new TransitionKt.createTransitionAnimation.1.1.invoke..inlined.onDispose.1(this.w, this.x);
    }
}

