package n1;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function1 {
    public final Function1 A;
    public final CacheDrawScope w;
    public final Density x;
    public final LayoutDirection y;
    public final long z;

    public c(CacheDrawScope cacheDrawScope0, Density density0, LayoutDirection layoutDirection0, long v, Function1 function10) {
        this.w = cacheDrawScope0;
        this.x = density0;
        this.y = layoutDirection0;
        this.z = v;
        this.A = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ContentDrawScope contentDrawScope0 = this.w.getContentDrawScope$ui_release();
        Intrinsics.checkNotNull(contentDrawScope0);
        Canvas canvas0 = ((DrawScope)object0).getDrawContext().getCanvas();
        Density density0 = contentDrawScope0.getDrawContext().getDensity();
        LayoutDirection layoutDirection0 = contentDrawScope0.getDrawContext().getLayoutDirection();
        Canvas canvas1 = contentDrawScope0.getDrawContext().getCanvas();
        long v = contentDrawScope0.getDrawContext().getSize-NH-jbRc();
        GraphicsLayer graphicsLayer0 = contentDrawScope0.getDrawContext().getGraphicsLayer();
        DrawContext drawContext0 = contentDrawScope0.getDrawContext();
        drawContext0.setDensity(this.x);
        drawContext0.setLayoutDirection(this.y);
        drawContext0.setCanvas(canvas0);
        drawContext0.setSize-uvyYCjk(SizeKt.Size(IntSize.getWidth-impl(this.z), IntSize.getHeight-impl(this.z)));
        drawContext0.setGraphicsLayer(null);
        canvas0.save();
        try {
            this.A.invoke(contentDrawScope0);
            return Unit.INSTANCE;
        }
        finally {
            canvas0.restore();
            DrawContext drawContext1 = contentDrawScope0.getDrawContext();
            drawContext1.setDensity(density0);
            drawContext1.setLayoutDirection(layoutDirection0);
            drawContext1.setCanvas(canvas1);
            drawContext1.setSize-uvyYCjk(v);
            drawContext1.setGraphicsLayer(graphicsLayer0);
        }
    }
}

