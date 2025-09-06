package d0;

import androidx.compose.animation.core.AnimationState;
import java.util.concurrent.CancellationException;

public final class c extends CancellationException {
    public final int a;
    public final AnimationState b;

    public c(int v, AnimationState animationState0) {
        this.a = v;
        this.b = animationState0;
    }
}

