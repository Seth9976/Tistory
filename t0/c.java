package t0;

import androidx.compose.material.pullrefresh.PullRefreshIndicatorKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function1 {
    public final PullRefreshState w;
    public final State x;
    public final long y;
    public final Path z;

    public c(PullRefreshState pullRefreshState0, State state0, long v, Path path0) {
        this.w = pullRefreshState0;
        this.x = state0;
        this.y = v;
        this.z = path0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        a a0 = PullRefreshIndicatorKt.access$ArrowValues(this.w.getProgress());
        float f = ((Number)this.x.getValue()).floatValue();
        long v = ((DrawScope)object0).getCenter-F1C5BW0();
        DrawContext drawContext0 = ((DrawScope)object0).getDrawContext();
        long v1 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        drawContext0.getTransform().rotate-Uv8p0NA(a0.a, v);
        float f1 = ((DrawScope)object0).toPx-0680j_4(0.0f);
        float f2 = ((DrawScope)object0).toPx-0680j_4(0.0f) / 2.0f + f1;
        Rect rect0 = new Rect(Offset.getX-impl(SizeKt.getCenter-uvyYCjk(((DrawScope)object0).getSize-NH-jbRc())) - f2, Offset.getY-impl(SizeKt.getCenter-uvyYCjk(((DrawScope)object0).getSize-NH-jbRc())) - f2, Offset.getX-impl(SizeKt.getCenter-uvyYCjk(((DrawScope)object0).getSize-NH-jbRc())) + f2, Offset.getY-impl(SizeKt.getCenter-uvyYCjk(((DrawScope)object0).getSize-NH-jbRc())) + f2);
        long v2 = rect0.getSize-NH-jbRc();
        Stroke stroke0 = new Stroke(((DrawScope)object0).toPx-0680j_4(0.0f), 0.0f, 2, 0, null, 26, null);
        DrawScope.drawArc-yD3GUKo$default(((DrawScope)object0), this.y, a0.b, a0.c - a0.b, false, rect0.getTopLeft-F1C5BW0(), v2, f, stroke0, null, 0, 0x300, null);
        PullRefreshIndicatorKt.access$drawArrow-Bx497Mc(((DrawScope)object0), this.z, rect0, this.y, f, a0);
        r0.a.y(drawContext0, v1);
        return Unit.INSTANCE;
    }
}

