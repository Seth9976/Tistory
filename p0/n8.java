package p0;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.c;

public final class n8 extends Lambda implements Function1 {
    public final Function0 A;
    public final ClosedFloatingPointRange w;
    public final int x;
    public final float y;
    public final Function1 z;

    public n8(ClosedFloatingPointRange closedFloatingPointRange0, int v, float f, Function1 function10, Function0 function00) {
        this.w = closedFloatingPointRange0;
        this.x = v;
        this.y = f;
        this.z = function10;
        this.A = function00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ClosedFloatingPointRange closedFloatingPointRange0 = this.w;
        float f = c.coerceIn(((Number)object0).floatValue(), ((Number)closedFloatingPointRange0.getStart()).floatValue(), ((Number)closedFloatingPointRange0.getEndInclusive()).floatValue());
        int v = this.x;
        if(v > 0 && v + 1 >= 0) {
            float f1 = f;
            float f2 = f1;
            for(int v1 = 0; true; ++v1) {
                float f3 = MathHelpersKt.lerp(((Number)closedFloatingPointRange0.getStart()).floatValue(), ((Number)closedFloatingPointRange0.getEndInclusive()).floatValue(), ((float)v1) / ((float)(v + 1)));
                float f4 = f3 - f;
                if(Math.abs(f4) <= f1) {
                    f1 = Math.abs(f4);
                    f2 = f3;
                }
                if(v1 == v + 1) {
                    break;
                }
            }
            f = f2;
        }
        if(f == this.y) {
            return false;
        }
        this.z.invoke(f);
        Function0 function00 = this.A;
        if(function00 != null) {
            function00.invoke();
        }
        return true;
    }
}

