package p0;

import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class l6 extends Lambda implements Function1 {
    public final float w;
    public final long x;
    public final Stroke y;
    public final long z;

    public l6(float f, long v, Stroke stroke0, long v1) {
        this.w = f;
        this.x = v;
        this.y = stroke0;
        this.z = v1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ProgressIndicatorKt.access$drawCircularIndicatorBackground-bw27NRU(((DrawScope)object0), this.x, this.y);
        ProgressIndicatorKt.access$drawDeterminateCircularIndicator-42QJj7c(((DrawScope)object0), 270.0f, this.w * 360.0f, this.z, this.y);
        return Unit.INSTANCE;
    }
}

