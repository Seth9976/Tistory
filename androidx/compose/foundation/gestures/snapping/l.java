package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;

public final class l extends Lambda implements Function1 {
    public final float w;
    public final FloatRef x;
    public final ScrollScope y;
    public final Function1 z;

    public l(float f, FloatRef ref$FloatRef0, ScrollScope scrollScope0, Function1 function10) {
        this.w = f;
        this.x = ref$FloatRef0;
        this.y = scrollScope0;
        this.z = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = SnapFlingBehaviorKt.access$coerceToTarget(((Number)((AnimationScope)object0).getValue()).floatValue(), this.w);
        FloatRef ref$FloatRef0 = this.x;
        float f1 = f - ref$FloatRef0.element;
        float f2 = this.y.scrollBy(f1);
        this.z.invoke(f2);
        if(Math.abs(f1 - f2) > 0.5f || f != ((Number)((AnimationScope)object0).getValue()).floatValue()) {
            ((AnimationScope)object0).cancelAnimation();
        }
        ref$FloatRef0.element += f2;
        return Unit.INSTANCE;
    }
}

