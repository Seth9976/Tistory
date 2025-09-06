package u;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class r0 extends Lambda implements Function1 {
    public final Brush w;
    public final long x;
    public final long y;
    public final DrawStyle z;

    public r0(Brush brush0, long v, long v1, DrawStyle drawStyle0) {
        this.w = brush0;
        this.x = v;
        this.y = v1;
        this.z = drawStyle0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((ContentDrawScope)object0).drawContent();
        DrawScope.drawRect-AsUm42w$default(((ContentDrawScope)object0), this.w, this.x, this.y, 0.0f, this.z, null, 0, 104, null);
        return Unit.INSTANCE;
    }
}

