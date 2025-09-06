package p0;

import androidx.compose.material.SliderKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.c;

public final class v7 extends Lambda implements Function1 {
    public final State A;
    public final ClosedFloatingPointRange B;
    public final MutableFloatState w;
    public final MutableFloatState x;
    public final FloatRef y;
    public final FloatRef z;

    public v7(MutableFloatState mutableFloatState0, MutableFloatState mutableFloatState1, FloatRef ref$FloatRef0, FloatRef ref$FloatRef1, State state0, ClosedFloatingPointRange closedFloatingPointRange0) {
        this.w = mutableFloatState0;
        this.x = mutableFloatState1;
        this.y = ref$FloatRef0;
        this.z = ref$FloatRef1;
        this.A = state0;
        this.B = closedFloatingPointRange0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = this.w.getFloatValue();
        float f1 = this.x.getFloatValue();
        this.w.setFloatValue(f1 + (f + ((Number)object0).floatValue()));
        this.x.setFloatValue(0.0f);
        float f2 = c.coerceIn(this.w.getFloatValue(), this.y.element, this.z.element);
        ((Function1)this.A.getValue()).invoke(SliderKt.access$scale(this.y.element, this.z.element, f2, ((Number)this.B.getStart()).floatValue(), ((Number)this.B.getEndInclusive()).floatValue()));
        return Unit.INSTANCE;
    }
}

