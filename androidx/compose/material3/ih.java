package androidx.compose.material3;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class ih extends Lambda implements Function1 {
    public final long A;
    public final Stroke B;
    public final long C;
    public final Function0 w;
    public final int x;
    public final float y;
    public final float z;

    public ih(Function0 function00, int v, float f, float f1, long v1, Stroke stroke0, long v2) {
        this.w = function00;
        this.x = v;
        this.y = f;
        this.z = f1;
        this.A = v1;
        this.B = stroke0;
        this.C = v2;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = ((Number)this.w.invoke()).floatValue();
        float f1 = (StrokeCap.equals-impl0(this.x, 0) || Size.getHeight-impl(((DrawScope)object0).getSize-NH-jbRc()) > Size.getWidth-impl(((DrawScope)object0).getSize-NH-jbRc()) ? this.y : this.y + this.z) / ((float)(((double)((DrawScope)object0).toDp-u2uoSUM(Size.getWidth-impl(((DrawScope)object0).getSize-NH-jbRc()))) * 3.141593)) * 360.0f;
        ProgressIndicatorKt.a(((DrawScope)object0), Math.min(f * 360.0f, f1) + (270.0f + f * 360.0f), 360.0f - f * 360.0f - Math.min(f * 360.0f, f1) * 2.0f, this.A, this.B);
        ProgressIndicatorKt.access$drawDeterminateCircularIndicator-42QJj7c(((DrawScope)object0), 270.0f, f * 360.0f, this.C, this.B);
        return Unit.INSTANCE;
    }
}

