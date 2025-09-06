package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class zh extends Lambda implements Function1 {
    public final State A;
    public final long B;
    public final State C;
    public final State D;
    public final int w;
    public final float x;
    public final State y;
    public final long z;

    public zh(int v, float f, State state0, long v1, State state1, long v2, State state2, State state3) {
        this.w = v;
        this.x = f;
        this.y = state0;
        this.z = v1;
        this.A = state1;
        this.B = v2;
        this.C = state2;
        this.D = state3;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = Size.getHeight-impl(((DrawScope)object0).getSize-NH-jbRc());
        float f1 = (StrokeCap.equals-impl0(this.w, 0) || Size.getHeight-impl(((DrawScope)object0).getSize-NH-jbRc()) > Size.getWidth-impl(((DrawScope)object0).getSize-NH-jbRc()) ? this.x : Dp.constructor-impl(((DrawScope)object0).toDp-u2uoSUM(f) + this.x)) / ((DrawScope)object0).toDp-u2uoSUM(Size.getWidth-impl(((DrawScope)object0).getSize-NH-jbRc()));
        State state0 = this.y;
        if(Float.compare(((Number)state0.getValue()).floatValue(), 1.0f - f1) < 0) {
            ProgressIndicatorKt.access$drawLinearIndicator-qYKTg0g(((DrawScope)object0), (((Number)state0.getValue()).floatValue() > 0.0f ? ((Number)state0.getValue()).floatValue() + f1 : 0.0f), 1.0f, this.z, f, this.w);
        }
        float f2 = ((Number)state0.getValue()).floatValue();
        State state1 = this.A;
        if(f2 - ((Number)state1.getValue()).floatValue() > 0.0f) {
            ProgressIndicatorKt.access$drawLinearIndicator-qYKTg0g(((DrawScope)object0), ((Number)state0.getValue()).floatValue(), ((Number)state1.getValue()).floatValue(), this.B, f, this.w);
        }
        int v = Float.compare(((Number)state1.getValue()).floatValue(), f1);
        State state2 = this.C;
        if(v > 0) {
            ProgressIndicatorKt.access$drawLinearIndicator-qYKTg0g(((DrawScope)object0), (((Number)state2.getValue()).floatValue() > 0.0f ? ((Number)state2.getValue()).floatValue() + f1 : 0.0f), (((Number)state1.getValue()).floatValue() < 1.0f ? ((Number)state1.getValue()).floatValue() - f1 : 1.0f), this.z, f, this.w);
        }
        float f3 = ((Number)state2.getValue()).floatValue();
        State state3 = this.D;
        if(f3 - ((Number)state3.getValue()).floatValue() > 0.0f) {
            ProgressIndicatorKt.access$drawLinearIndicator-qYKTg0g(((DrawScope)object0), ((Number)state2.getValue()).floatValue(), ((Number)state3.getValue()).floatValue(), this.B, f, this.w);
        }
        if(((Number)state3.getValue()).floatValue() > f1) {
            ProgressIndicatorKt.access$drawLinearIndicator-qYKTg0g(((DrawScope)object0), 0.0f, (((Number)state3.getValue()).floatValue() < 1.0f ? ((Number)state3.getValue()).floatValue() - f1 : 1.0f), this.z, f, this.w);
        }
        return Unit.INSTANCE;
    }
}

