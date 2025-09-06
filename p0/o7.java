package p0;

import androidx.compose.animation.core.Animatable;
import androidx.compose.material.SliderKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import ce.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlin.ranges.ClosedFloatingPointRange;

public final class o7 extends Lambda implements Function1 {
    public final FloatRef A;
    public final FloatRef B;
    public final ClosedFloatingPointRange C;
    public final boolean w;
    public final MutableFloatState x;
    public final MutableFloatState y;
    public final State z;

    public o7(boolean z, MutableFloatState mutableFloatState0, MutableFloatState mutableFloatState1, State state0, FloatRef ref$FloatRef0, FloatRef ref$FloatRef1, ClosedFloatingPointRange closedFloatingPointRange0) {
        this.w = z;
        this.x = mutableFloatState0;
        this.y = mutableFloatState1;
        this.z = state0;
        this.A = ref$FloatRef0;
        this.B = ref$FloatRef1;
        this.C = closedFloatingPointRange0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        (this.w ? this.x : this.y).setFloatValue(((Number)((Animatable)object0).getValue()).floatValue());
        Function1 function10 = (Function1)this.z.getValue();
        ClosedFloatingPointRange closedFloatingPointRange0 = e.rangeTo(this.x.getFloatValue(), this.y.getFloatValue());
        function10.invoke(SliderKt.access$scale(this.A.element, this.B.element, closedFloatingPointRange0, ((Number)this.C.getStart()).floatValue(), ((Number)this.C.getEndInclusive()).floatValue()));
        return Unit.INSTANCE;
    }
}

