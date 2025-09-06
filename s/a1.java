package s;

import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.TransitionData;

public final class a1 extends ExitTransition {
    public final TransitionData c;

    public a1(TransitionData transitionData0) {
        super(null);
        this.c = transitionData0;
    }

    @Override  // androidx.compose.animation.ExitTransition
    public final TransitionData getData$animation_release() {
        return this.c;
    }
}

