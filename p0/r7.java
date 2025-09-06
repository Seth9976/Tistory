package p0;

import androidx.compose.material.SliderKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import ce.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.c;

public final class r7 extends Lambda implements Function2 {
    public final FloatRef A;
    public final State B;
    public final ClosedFloatingPointRange C;
    public final MutableFloatState w;
    public final MutableFloatState x;
    public final ClosedFloatingPointRange y;
    public final FloatRef z;

    public r7(MutableFloatState mutableFloatState0, MutableFloatState mutableFloatState1, ClosedFloatingPointRange closedFloatingPointRange0, FloatRef ref$FloatRef0, FloatRef ref$FloatRef1, State state0, ClosedFloatingPointRange closedFloatingPointRange1) {
        this.w = mutableFloatState0;
        this.x = mutableFloatState1;
        this.y = closedFloatingPointRange0;
        this.z = ref$FloatRef0;
        this.A = ref$FloatRef1;
        this.B = state0;
        this.C = closedFloatingPointRange1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ClosedFloatingPointRange closedFloatingPointRange2;
        float f = ((Number)object1).floatValue();
        FloatRef ref$FloatRef0 = this.A;
        FloatRef ref$FloatRef1 = this.z;
        ClosedFloatingPointRange closedFloatingPointRange0 = this.y;
        ClosedFloatingPointRange closedFloatingPointRange1 = this.C;
        MutableFloatState mutableFloatState0 = this.x;
        MutableFloatState mutableFloatState1 = this.w;
        if(((Boolean)object0).booleanValue()) {
            mutableFloatState1.setFloatValue(mutableFloatState1.getFloatValue() + f);
            mutableFloatState0.setFloatValue(s7.a(closedFloatingPointRange1, ref$FloatRef1, ref$FloatRef0, ((Number)closedFloatingPointRange0.getEndInclusive()).floatValue()));
            float f1 = mutableFloatState0.getFloatValue();
            closedFloatingPointRange2 = e.rangeTo(c.coerceIn(mutableFloatState1.getFloatValue(), ref$FloatRef1.element, f1), f1);
        }
        else {
            mutableFloatState0.setFloatValue(mutableFloatState0.getFloatValue() + f);
            mutableFloatState1.setFloatValue(s7.a(closedFloatingPointRange1, ref$FloatRef1, ref$FloatRef0, ((Number)closedFloatingPointRange0.getStart()).floatValue()));
            float f2 = mutableFloatState1.getFloatValue();
            closedFloatingPointRange2 = e.rangeTo(f2, c.coerceIn(mutableFloatState0.getFloatValue(), f2, ref$FloatRef0.element));
        }
        ((Function1)this.B.getValue()).invoke(SliderKt.access$scale(ref$FloatRef1.element, ref$FloatRef0.element, closedFloatingPointRange2, ((Number)closedFloatingPointRange1.getStart()).floatValue(), ((Number)closedFloatingPointRange1.getEndInclusive()).floatValue()));
        return Unit.INSTANCE;
    }
}

