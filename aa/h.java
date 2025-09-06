package aa;

import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function1 {
    public final float A;
    public final Paint B;
    public final Function1 w;
    public final int x;
    public final Path y;
    public final long z;

    public h(Function1 function10, int v, Path path0, long v1, float f, Paint paint0) {
        this.w = function10;
        this.x = v;
        this.y = path0;
        this.z = v1;
        this.A = f;
        this.B = paint0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ContentDrawScope)object0), "$this$onDrawWithContent");
        Size size0 = Size.box-impl(((ContentDrawScope)object0).getSize-NH-jbRc());
        long v = ((Size)this.w.invoke(size0)).unbox-impl();
        long v1 = OffsetKt.Offset(Offset.getX-impl(((ContentDrawScope)object0).getCenter-F1C5BW0()) - Size.getWidth-impl(v) / 2.0f, Offset.getY-impl(((ContentDrawScope)object0).getCenter-F1C5BW0()) - Size.getHeight-impl(v) / 2.0f);
        ((ContentDrawScope)object0).drawContent();
        float f = Size.getMinDimension-impl(v) * ((float)this.x) / 100.0f;
        long v2 = CornerRadiusKt.CornerRadius(f, f);
        this.y.reset();
        RoundRect roundRect0 = RoundRectKt.RoundRect-ZAM2FJo$default(RectKt.Rect-tz77jQw(v1, v), 0L, v2, 0L, v2, 10, null);
        Path.addRoundRect$default(this.y, roundRect0, null, 2, null);
        Stroke stroke0 = new Stroke(this.A, 0.0f, 0, 0, null, 30, null);
        DrawScope.drawPath-LG529CI$default(((ContentDrawScope)object0), this.y, this.z, 0.0f, stroke0, null, 0, 52, null);
        ((ContentDrawScope)object0).getDrawContext().getCanvas().drawPath(this.y, this.B);
        return Unit.INSTANCE;
    }
}

