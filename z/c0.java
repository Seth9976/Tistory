package z;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.gestures.DefaultFlingBehavior;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;

public final class c0 extends Lambda implements Function1 {
    public final FloatRef w;
    public final ScrollScope x;
    public final FloatRef y;
    public final DefaultFlingBehavior z;

    public c0(FloatRef ref$FloatRef0, ScrollScope scrollScope0, FloatRef ref$FloatRef1, DefaultFlingBehavior defaultFlingBehavior0) {
        this.w = ref$FloatRef0;
        this.x = scrollScope0;
        this.y = ref$FloatRef1;
        this.z = defaultFlingBehavior0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = ((Number)((AnimationScope)object0).getValue()).floatValue() - this.w.element;
        float f1 = this.x.scrollBy(f);
        this.w.element = ((Number)((AnimationScope)object0).getValue()).floatValue();
        this.y.element = ((Number)((AnimationScope)object0).getVelocity()).floatValue();
        if(Math.abs(f - f1) > 0.5f) {
            ((AnimationScope)object0).cancelAnimation();
        }
        int v = this.z.getLastAnimationCycleCount();
        this.z.setLastAnimationCycleCount(v + 1);
        return Unit.INSTANCE;
    }
}

