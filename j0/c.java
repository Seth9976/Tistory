package j0;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import r0.a;

public final class c extends Lambda implements Function1 {
    public final float w;
    public final ImageBitmap x;
    public final ColorFilter y;

    public c(float f, ImageBitmap imageBitmap0, ColorFilter colorFilter0) {
        this.w = f;
        this.x = imageBitmap0;
        this.y = colorFilter0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((ContentDrawScope)object0).drawContent();
        DrawContext drawContext0 = ((ContentDrawScope)object0).getDrawContext();
        long v = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        try {
            DrawTransform drawTransform0 = drawContext0.getTransform();
            DrawTransform.translate$default(drawTransform0, this.w, 0.0f, 2, null);
            drawTransform0.rotate-Uv8p0NA(45.0f, 0L);
            DrawScope.drawImage-gbVJVH8$default(((ContentDrawScope)object0), this.x, 0L, 0.0f, null, this.y, 0, 46, null);
            return Unit.INSTANCE;
        }
        finally {
            a.y(drawContext0, v);
        }
    }
}

