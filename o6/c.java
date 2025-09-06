package o6;

import androidx.compose.foundation.gestures.FlingBehavior;
import dev.chrisbanes.snapper.SnapperFlingBehavior;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function0 {
    public final FlingBehavior w;

    public c(FlingBehavior flingBehavior0) {
        this.w = flingBehavior0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SnapperFlingBehavior snapperFlingBehavior0 = this.w instanceof SnapperFlingBehavior ? ((SnapperFlingBehavior)this.w) : null;
        return snapperFlingBehavior0 == null ? null : snapperFlingBehavior0.getAnimationTarget();
    }
}

