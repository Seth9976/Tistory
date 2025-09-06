package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;

public final class j extends Lambda implements Function1 {
    public final float w;
    public final FloatRef x;
    public final ScrollScope y;
    public final Function1 z;

    public j(float f, FloatRef ref$FloatRef0, ScrollScope scrollScope0, Function1 function10) {
        this.w = f;
        this.x = ref$FloatRef0;
        this.y = scrollScope0;
        this.z = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = Math.abs(((Number)((AnimationScope)object0).getValue()).floatValue());
        float f1 = this.w;
        Function1 function10 = this.z;
        ScrollScope scrollScope0 = this.y;
        FloatRef ref$FloatRef0 = this.x;
        if(Float.compare(f, Math.abs(f1)) >= 0) {
            float f2 = SnapFlingBehaviorKt.access$coerceToTarget(((Number)((AnimationScope)object0).getValue()).floatValue(), f1);
            SnapFlingBehaviorKt.access$animateDecay$consumeDelta(((AnimationScope)object0), scrollScope0, function10, f2 - ref$FloatRef0.element);
            ((AnimationScope)object0).cancelAnimation();
            ref$FloatRef0.element = f2;
            return Unit.INSTANCE;
        }
        SnapFlingBehaviorKt.access$animateDecay$consumeDelta(((AnimationScope)object0), scrollScope0, function10, ((Number)((AnimationScope)object0).getValue()).floatValue() - ref$FloatRef0.element);
        ref$FloatRef0.element = ((Number)((AnimationScope)object0).getValue()).floatValue();
        return Unit.INSTANCE;
    }
}

