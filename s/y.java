package s;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt.rememberTransition.2.1.invoke..inlined.onDispose.1;
import androidx.compose.animation.core.TransitionKt.updateTransition.1.1.invoke..inlined.onDispose.1;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class y extends Lambda implements Function1 {
    public final int w;
    public final Transition x;

    public y(Transition transition0, int v) {
        this.w = v;
        this.x = transition0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                return Boolean.valueOf(!Intrinsics.areEqual(object0, this.x.getTargetState()));
            }
            case 1: {
                DisposableEffectScope disposableEffectScope1 = (DisposableEffectScope)object0;
                return new TransitionKt.rememberTransition.2.1.invoke..inlined.onDispose.1(this.x);
            }
            default: {
                DisposableEffectScope disposableEffectScope0 = (DisposableEffectScope)object0;
                return new TransitionKt.updateTransition.1.1.invoke..inlined.onDispose.1(this.x);
            }
        }
    }
}

