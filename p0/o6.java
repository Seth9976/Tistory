package p0;

import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class o6 extends Lambda implements Function1 {
    public final long w;
    public final int x;
    public final float y;
    public final long z;

    public o6(long v, int v1, float f, long v2) {
        this.w = v;
        this.x = v1;
        this.y = f;
        this.z = v2;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = Size.getHeight-impl(((DrawScope)object0).getSize-NH-jbRc());
        ProgressIndicatorKt.access$drawLinearIndicatorBackground-AZGd3zU(((DrawScope)object0), this.w, f, this.x);
        ProgressIndicatorKt.b(((DrawScope)object0), 0.0f, this.y, this.z, f, this.x);
        return Unit.INSTANCE;
    }
}

