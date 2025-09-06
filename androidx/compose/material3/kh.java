package androidx.compose.material3;

import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class kh extends Lambda implements Function1 {
    public final long A;
    public final State B;
    public final State C;
    public final State D;
    public final State E;
    public final int w;
    public final long x;
    public final Stroke y;
    public final float z;

    public kh(long v, Stroke stroke0, float f, long v1, State state0, State state1, State state2, State state3) {
        this.w = 1;
        this.x = v;
        this.y = stroke0;
        this.z = f;
        this.A = v1;
        this.B = state0;
        this.C = state1;
        this.D = state2;
        this.E = state3;
        super(1);
    }

    public kh(long v, Stroke stroke0, State state0, State state1, State state2, State state3, float f, long v1) {
        this.w = 0;
        this.x = v;
        this.y = stroke0;
        this.B = state0;
        this.C = state1;
        this.D = state2;
        this.E = state3;
        this.z = f;
        this.A = v1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            ProgressIndicatorKt.access$drawCircularIndicatorBackground-bw27NRU(((DrawScope)object0), this.x, this.y);
            float f = ((float)ProgressIndicatorKt.access$CircularProgressIndicator_LxG7B9w$lambda$8(this.B)) * 216.0f % 360.0f;
            float f1 = Math.abs(ProgressIndicatorKt.access$CircularProgressIndicator_LxG7B9w$lambda$10(this.C) - ProgressIndicatorKt.access$CircularProgressIndicator_LxG7B9w$lambda$11(this.D));
            float f2 = ProgressIndicatorKt.access$CircularProgressIndicator_LxG7B9w$lambda$9(this.E);
            ProgressIndicatorKt.access$drawIndeterminateCircularIndicator-hrjfTZI(((DrawScope)object0), ProgressIndicatorKt.access$CircularProgressIndicator_LxG7B9w$lambda$11(this.D) + (f2 + (f - 90.0f)), this.z, f1, this.A, this.y);
            return Unit.INSTANCE;
        }
        androidx.compose.material3.ProgressIndicatorKt.access$drawCircularIndicatorTrack-bw27NRU(((DrawScope)object0), this.x, this.y);
        float f3 = ((Number)this.B.getValue()).floatValue();
        float f4 = Math.abs(((Number)this.C.getValue()).floatValue() - ((Number)this.D.getValue()).floatValue());
        androidx.compose.material3.ProgressIndicatorKt.access$drawIndeterminateCircularIndicator-hrjfTZI(((DrawScope)object0), ((Number)this.E.getValue()).floatValue() + (f3 * 216.0f % 360.0f - 90.0f) + ((Number)this.D.getValue()).floatValue(), this.z, f4, this.A, this.y);
        return Unit.INSTANCE;
    }
}

