package p0;

import androidx.compose.material.SliderKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class q7 extends Lambda implements Function1 {
    public final FloatRef A;
    public final Function0 B;
    public final CoroutineScope C;
    public final State D;
    public final ClosedFloatingPointRange E;
    public final MutableFloatState w;
    public final MutableFloatState x;
    public final List y;
    public final FloatRef z;

    public q7(MutableFloatState mutableFloatState0, MutableFloatState mutableFloatState1, List list0, FloatRef ref$FloatRef0, FloatRef ref$FloatRef1, Function0 function00, CoroutineScope coroutineScope0, State state0, ClosedFloatingPointRange closedFloatingPointRange0) {
        this.w = mutableFloatState0;
        this.x = mutableFloatState1;
        this.y = list0;
        this.z = ref$FloatRef0;
        this.A = ref$FloatRef1;
        this.B = function00;
        this.C = coroutineScope0;
        this.D = state0;
        this.E = closedFloatingPointRange0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        boolean z = ((Boolean)object0).booleanValue();
        float f = (z ? this.w : this.x).getFloatValue();
        float f1 = SliderKt.access$snapValueToTick(f, this.y, this.z.element, this.A.element);
        if(f == f1) {
            Function0 function00 = this.B;
            if(function00 != null) {
                function00.invoke();
                return Unit.INSTANCE;
            }
        }
        else {
            p7 p70 = new p7(f, f1, this.B, z, this.w, this.x, this.D, this.z, this.A, this.E, null);
            BuildersKt.launch$default(this.C, null, null, p70, 3, null);
        }
        return Unit.INSTANCE;
    }
}

