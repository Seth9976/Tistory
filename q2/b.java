package q2;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.RepeatableSpec;
import androidx.compose.animation.core.SnapSpec;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.animation.core.StartOffsetType;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function0 {
    public final AnimationSpec w;

    public b(AnimationSpec animationSpec0) {
        this.w = animationSpec0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AnimationSpec animationSpec0 = this.w;
        if(animationSpec0 instanceof TweenSpec) {
            return ((TweenSpec)animationSpec0).getDelay().longValue();
        }
        if(animationSpec0 instanceof SnapSpec) {
            return ((SnapSpec)animationSpec0).getDelay().longValue();
        }
        if(animationSpec0 instanceof KeyframesSpec) {
            return ((KeyframesSpec)animationSpec0).getConfig().getDelayMillis().longValue();
        }
        if(animationSpec0 instanceof RepeatableSpec) {
            return StartOffsetType.equals-impl0(StartOffset.getOffsetType-Eo1U57Q(((RepeatableSpec)animationSpec0).getInitialStartOffset-Rmkjzm4()), -1) ? StartOffset.getOffsetMillis-impl(((RepeatableSpec)animationSpec0).getInitialStartOffset-Rmkjzm4()).longValue() : 0L;
        }
        if(animationSpec0 instanceof InfiniteRepeatableSpec) {
            return StartOffsetType.equals-impl0(StartOffset.getOffsetType-Eo1U57Q(((InfiniteRepeatableSpec)animationSpec0).getInitialStartOffset-Rmkjzm4()), -1) ? StartOffset.getOffsetMillis-impl(((InfiniteRepeatableSpec)animationSpec0).getInitialStartOffset-Rmkjzm4()).longValue() : 0L;
        }
        return animationSpec0 instanceof VectorizedDurationBasedAnimationSpec ? ((VectorizedDurationBasedAnimationSpec)animationSpec0).getDelayMillis().longValue() : 0L;
    }
}

