package d0;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlin.ranges.c;

public final class e extends Lambda implements Function1 {
    public final float w;
    public final FloatRef x;
    public final ScrollScope y;

    public e(float f, FloatRef ref$FloatRef0, ScrollScope scrollScope0) {
        this.w = f;
        this.x = ref$FloatRef0;
        this.y = scrollScope0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = this.w;
        float f1 = 0.0f;
        if(f > 0.0f) {
            f1 = c.coerceAtMost(((Number)((AnimationScope)object0).getValue()).floatValue(), f);
        }
        else if(f < 0.0f) {
            f1 = c.coerceAtLeast(((Number)((AnimationScope)object0).getValue()).floatValue(), f);
        }
        FloatRef ref$FloatRef0 = this.x;
        float f2 = f1 - ref$FloatRef0.element;
        if(f2 != this.y.scrollBy(f2) || f1 != ((Number)((AnimationScope)object0).getValue()).floatValue()) {
            ((AnimationScope)object0).cancelAnimation();
        }
        ref$FloatRef0.element += f2;
        return Unit.INSTANCE;
    }
}

