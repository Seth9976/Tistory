package androidx.compose.animation.core;

import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function1 {
    public final Transition w;
    public final DeferredAnimation x;

    public h(Transition transition0, DeferredAnimation transition$DeferredAnimation0) {
        this.w = transition0;
        this.x = transition$DeferredAnimation0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        DisposableEffectScope disposableEffectScope0 = (DisposableEffectScope)object0;
        return new TransitionKt.createDeferredAnimation.1.1.invoke..inlined.onDispose.1(this.w, this.x);
    }
}

