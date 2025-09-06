package s;

import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.TransitionData;

public final class z0 extends EnterTransition {
    public final TransitionData b;

    public z0(TransitionData transitionData0) {
        super(null);
        this.b = transitionData0;
    }

    @Override  // androidx.compose.animation.EnterTransition
    public final TransitionData getData$animation_release() {
        return this.b;
    }
}

