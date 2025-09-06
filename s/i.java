package s;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.Modifier;

public final class i implements AnimatedContentScope, AnimatedVisibilityScope {
    public final AnimatedVisibilityScope a;

    public i(AnimatedVisibilityScope animatedVisibilityScope0) {
        this.a = animatedVisibilityScope0;
    }

    @Override  // androidx.compose.animation.AnimatedVisibilityScope
    public final Modifier animateEnterExit(Modifier modifier0, EnterTransition enterTransition0, ExitTransition exitTransition0, String s) {
        return this.a.animateEnterExit(modifier0, enterTransition0, exitTransition0, s);
    }

    @Override  // androidx.compose.animation.AnimatedVisibilityScope
    public final Transition getTransition() {
        return this.a.getTransition();
    }
}

