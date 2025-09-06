package androidx.compose.material3;

import androidx.compose.animation.core.AnimationScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;

public final class b1 extends Lambda implements Function1 {
    public final FloatRef w;
    public final TopAppBarState x;
    public final FloatRef y;

    public b1(FloatRef ref$FloatRef0, TopAppBarState topAppBarState0, FloatRef ref$FloatRef1) {
        this.w = ref$FloatRef0;
        this.x = topAppBarState0;
        this.y = ref$FloatRef1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = ((Number)((AnimationScope)object0).getValue()).floatValue() - this.w.element;
        float f1 = this.x.getHeightOffset();
        this.x.setHeightOffset(f1 + f);
        float f2 = Math.abs(f1 - this.x.getHeightOffset());
        this.w.element = ((Number)((AnimationScope)object0).getValue()).floatValue();
        this.y.element = ((Number)((AnimationScope)object0).getVelocity()).floatValue();
        if(Math.abs(f - f2) > 0.5f) {
            ((AnimationScope)object0).cancelAnimation();
        }
        return Unit.INSTANCE;
    }
}

