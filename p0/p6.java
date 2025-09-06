package p0;

import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class p6 extends Lambda implements Function1 {
    public final State A;
    public final State B;
    public final State C;
    public final long w;
    public final int x;
    public final long y;
    public final State z;

    public p6(long v, int v1, long v2, State state0, State state1, State state2, State state3) {
        this.w = v;
        this.x = v1;
        this.y = v2;
        this.z = state0;
        this.A = state1;
        this.B = state2;
        this.C = state3;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = Size.getHeight-impl(((DrawScope)object0).getSize-NH-jbRc());
        ProgressIndicatorKt.access$drawLinearIndicatorBackground-AZGd3zU(((DrawScope)object0), this.w, f, this.x);
        State state0 = this.z;
        float f1 = ProgressIndicatorKt.access$LinearProgressIndicator_2cYBFYY$lambda$1(state0);
        State state1 = this.A;
        if(f1 - ProgressIndicatorKt.access$LinearProgressIndicator_2cYBFYY$lambda$2(state1) > 0.0f) {
            ProgressIndicatorKt.b(((DrawScope)object0), ProgressIndicatorKt.access$LinearProgressIndicator_2cYBFYY$lambda$1(state0), ProgressIndicatorKt.access$LinearProgressIndicator_2cYBFYY$lambda$2(state1), this.y, f, this.x);
        }
        State state2 = this.B;
        float f2 = ProgressIndicatorKt.access$LinearProgressIndicator_2cYBFYY$lambda$3(state2);
        State state3 = this.C;
        if(f2 - ProgressIndicatorKt.access$LinearProgressIndicator_2cYBFYY$lambda$4(state3) > 0.0f) {
            ProgressIndicatorKt.b(((DrawScope)object0), ProgressIndicatorKt.access$LinearProgressIndicator_2cYBFYY$lambda$3(state2), ProgressIndicatorKt.access$LinearProgressIndicator_2cYBFYY$lambda$4(state3), this.y, f, this.x);
        }
        return Unit.INSTANCE;
    }
}

