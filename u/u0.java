package u;

import androidx.compose.foundation.BorderKt;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import r0.a;

public final class u0 extends Lambda implements Function1 {
    public final float A;
    public final long B;
    public final long C;
    public final Stroke D;
    public final boolean w;
    public final Brush x;
    public final long y;
    public final float z;

    public u0(boolean z, Brush brush0, long v, float f, float f1, long v1, long v2, Stroke stroke0) {
        this.w = z;
        this.x = brush0;
        this.y = v;
        this.z = f;
        this.A = f1;
        this.B = v1;
        this.C = v2;
        this.D = stroke0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        long v3;
        DrawContext drawContext1;
        ContentDrawScope contentDrawScope0 = (ContentDrawScope)object0;
        contentDrawScope0.drawContent();
        if(this.w) {
            DrawScope.drawRoundRect-ZuiqVtQ$default(contentDrawScope0, this.x, 0L, 0L, this.y, 0.0f, null, null, 0, 0xF6, null);
            return Unit.INSTANCE;
        }
        long v = this.y;
        float f = this.z;
        if(CornerRadius.getX-impl(v) < f) {
            float f1 = Size.getWidth-impl(contentDrawScope0.getSize-NH-jbRc());
            float f2 = Size.getHeight-impl(contentDrawScope0.getSize-NH-jbRc());
            Brush brush0 = this.x;
            long v1 = this.y;
            DrawContext drawContext0 = contentDrawScope0.getDrawContext();
            long v2 = drawContext0.getSize-NH-jbRc();
            drawContext0.getCanvas().save();
            try {
                drawContext0.getTransform().clipRect-N_I0leg(this.A, this.A, f1 - this.A, f2 - this.A, 0);
                drawContext1 = drawContext0;
            }
            catch(Throwable throwable0) {
                v3 = v2;
                drawContext1 = drawContext0;
                a.y(drawContext1, v3);
                throw throwable0;
            }
            try {
                DrawScope.drawRoundRect-ZuiqVtQ$default(contentDrawScope0, brush0, 0L, 0L, v1, 0.0f, null, null, 0, 0xF6, null);
            }
            catch(Throwable throwable0) {
                v3 = v2;
                a.y(drawContext1, v3);
                throw throwable0;
            }
            a.y(drawContext1, v2);
            return Unit.INSTANCE;
        }
        DrawScope.drawRoundRect-ZuiqVtQ$default(contentDrawScope0, this.x, this.B, this.C, BorderKt.access$shrink-Kibmq7A(v, f), 0.0f, this.D, null, 0, 0xD0, null);
        return Unit.INSTANCE;
    }
}

