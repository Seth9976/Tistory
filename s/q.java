package s;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.core.Transition;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function0 {
    public final int w;
    public final Transition x;

    public q(Transition transition0, int v) {
        this.w = v;
        this.x = transition0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w != 0 ? this.x.a() : Boolean.valueOf(AnimatedVisibilityKt.access$getExitFinished(this.x));
    }
}

