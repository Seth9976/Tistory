package u1;

import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.vector.VectorComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import r0.a;

public final class b extends Lambda implements Function1 {
    public final VectorComponent w;

    public b(VectorComponent vectorComponent0) {
        this.w = vectorComponent0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        DrawContext drawContext0 = ((DrawScope)object0).getDrawContext();
        long v = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        try {
            drawContext0.getTransform().scale-0AR0LA0(this.w.k, this.w.l, 0L);
            this.w.getRoot().draw(((DrawScope)object0));
            return Unit.INSTANCE;
        }
        finally {
            a.y(drawContext0, v);
        }
    }
}

