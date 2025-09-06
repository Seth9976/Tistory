package z;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.gestures.AnchoredDragScope;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;

public final class f extends Lambda implements Function1 {
    public final float w;
    public final AnchoredDragScope x;
    public final FloatRef y;
    public final FloatRef z;

    public f(float f, AnchoredDragScope anchoredDragScope0, FloatRef ref$FloatRef0, FloatRef ref$FloatRef1) {
        this.w = f;
        this.x = anchoredDragScope0;
        this.y = ref$FloatRef0;
        this.z = ref$FloatRef1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = Math.abs(((Number)((AnimationScope)object0).getValue()).floatValue());
        float f1 = this.w;
        FloatRef ref$FloatRef0 = this.z;
        FloatRef ref$FloatRef1 = this.y;
        AnchoredDragScope anchoredDragScope0 = this.x;
        if(Float.compare(f, Math.abs(f1)) >= 0) {
            float f2 = AnchoredDraggableKt.access$coerceToTarget(((Number)((AnimationScope)object0).getValue()).floatValue(), f1);
            anchoredDragScope0.dragTo(f2, ((Number)((AnimationScope)object0).getVelocity()).floatValue());
            ref$FloatRef1.element = Float.isNaN(((Number)((AnimationScope)object0).getVelocity()).floatValue()) ? 0.0f : ((Number)((AnimationScope)object0).getVelocity()).floatValue();
            ref$FloatRef0.element = f2;
            ((AnimationScope)object0).cancelAnimation();
            return Unit.INSTANCE;
        }
        anchoredDragScope0.dragTo(((Number)((AnimationScope)object0).getValue()).floatValue(), ((Number)((AnimationScope)object0).getVelocity()).floatValue());
        ref$FloatRef1.element = ((Number)((AnimationScope)object0).getVelocity()).floatValue();
        ref$FloatRef0.element = ((Number)((AnimationScope)object0).getValue()).floatValue();
        return Unit.INSTANCE;
    }
}

