package androidx.compose.material3;

import androidx.compose.ui.graphics.ColorFilter.Companion;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class ob extends Lambda implements Function1 {
    public final Painter w;
    public final ColorProducer x;

    public ob(Painter painter0, ColorProducer colorProducer0) {
        this.w = painter0;
        this.x = colorProducer0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ColorFilter colorFilter0;
        long v = ((DrawScope)object0).getSize-NH-jbRc();
        ColorProducer colorProducer0 = this.x;
        if(colorProducer0 == null) {
            colorFilter0 = null;
        }
        else {
            long v1 = colorProducer0.invoke-0d7_KjU();
            colorFilter0 = Companion.tint-xETnrds$default(ColorFilter.Companion, v1, 0, 2, null);
        }
        Painter.draw-x_KDEd0$default(this.w, ((DrawScope)object0), v, 0.0f, colorFilter0, 2, null);
        return Unit.INSTANCE;
    }
}

