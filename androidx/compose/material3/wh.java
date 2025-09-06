package androidx.compose.material3;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class wh extends Lambda implements Function1 {
    public final long A;
    public final Function1 B;
    public final int w;
    public final float x;
    public final Function0 y;
    public final long z;

    public wh(int v, float f, Function0 function00, long v1, long v2, Function1 function10) {
        this.w = v;
        this.x = f;
        this.y = function00;
        this.z = v1;
        this.A = v2;
        this.B = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = Size.getHeight-impl(((DrawScope)object0).getSize-NH-jbRc());
        float f1 = StrokeCap.equals-impl0(this.w, 0) || Size.getHeight-impl(((DrawScope)object0).getSize-NH-jbRc()) > Size.getWidth-impl(((DrawScope)object0).getSize-NH-jbRc()) ? this.x : Dp.constructor-impl(((DrawScope)object0).toDp-u2uoSUM(f) + this.x);
        float f2 = ((DrawScope)object0).toDp-u2uoSUM(Size.getWidth-impl(((DrawScope)object0).getSize-NH-jbRc()));
        float f3 = ((Number)this.y.invoke()).floatValue();
        float f4 = Math.min(f3, f1 / f2) + f3;
        if(f4 <= 1.0f) {
            ProgressIndicatorKt.access$drawLinearIndicator-qYKTg0g(((DrawScope)object0), f4, 1.0f, this.z, f, this.w);
        }
        ProgressIndicatorKt.access$drawLinearIndicator-qYKTg0g(((DrawScope)object0), 0.0f, f3, this.A, f, this.w);
        this.B.invoke(((DrawScope)object0));
        return Unit.INSTANCE;
    }
}

