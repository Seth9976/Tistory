package p0;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;

public final class k7 extends Lambda implements Function0 {
    public final ClosedFloatingPointRange A;
    public final ClosedFloatingPointRange w;
    public final Function1 x;
    public final float y;
    public final MutableState z;

    public k7(ClosedFloatingPointRange closedFloatingPointRange0, Function1 function10, float f, MutableState mutableState0, ClosedFloatingPointRange closedFloatingPointRange1) {
        this.w = closedFloatingPointRange0;
        this.x = function10;
        this.y = f;
        this.z = mutableState0;
        this.A = closedFloatingPointRange1;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float f = ((Number)this.w.getEndInclusive()).floatValue();
        float f1 = ((Number)this.w.getStart()).floatValue();
        float f2 = ((Number)this.x.invoke(this.y)).floatValue();
        MutableState mutableState0 = this.z;
        if(Math.abs(f2 - ((Number)mutableState0.getValue()).floatValue()) > (f - f1) / 1000.0f) {
            Comparable comparable0 = (Comparable)mutableState0.getValue();
            if(this.A.contains(comparable0)) {
                mutableState0.setValue(f2);
            }
        }
        return Unit.INSTANCE;
    }
}

