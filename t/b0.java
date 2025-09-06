package t;

import androidx.compose.animation.core.AnimationState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b0 extends Lambda implements Function0 {
    public final int w;
    public final AnimationState x;

    public b0(int v, AnimationState animationState0) {
        this.w = v;
        this.x = animationState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            this.x.setRunning$animation_core_release(false);
            return Unit.INSTANCE;
        }
        this.x.setRunning$animation_core_release(false);
        return Unit.INSTANCE;
    }
}

