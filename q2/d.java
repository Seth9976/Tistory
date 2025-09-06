package q2;

import androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function0 {
    public final TransitionAnimationState w;
    public final long x;
    public final long y;

    public d(TransitionAnimationState infiniteTransition$TransitionAnimationState0, long v, long v1) {
        this.w = infiniteTransition$TransitionAnimationState0;
        this.x = v;
        this.y = v1;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        TransitionAnimationState infiniteTransition$TransitionAnimationState0 = this.w;
        linkedHashMap0.put(0L, infiniteTransition$TransitionAnimationState0.getAnimation().getValueFromNanos(0L));
        long v1 = this.x;
        linkedHashMap0.put(v1, infiniteTransition$TransitionAnimationState0.getAnimation().getValueFromNanos(v1 * 1000000L));
        for(long v = 0L; v <= v1; v += this.y) {
            linkedHashMap0.put(v, infiniteTransition$TransitionAnimationState0.getAnimation().getValueFromNanos(v * 1000000L));
        }
        return linkedHashMap0;
    }
}

