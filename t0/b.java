package t0;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public final int w;
    public static final b x;
    public static final b y;

    static {
        b.x = new b(1, 0);
        b.y = new b(1, 1);
    }

    public b(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            DrawContext drawContext0 = ((ContentDrawScope)object0).getDrawContext();
            long v = drawContext0.getSize-NH-jbRc();
            drawContext0.getCanvas().save();
            drawContext0.getTransform().clipRect-N_I0leg(-3.402823E+38f, 0.0f, 3.402823E+38f, 3.402823E+38f, 1);
            ((ContentDrawScope)object0).drawContent();
            drawContext0.getCanvas().restore();
            drawContext0.setSize-uvyYCjk(v);
            return Unit.INSTANCE;
        }
        SemanticsPropertyReceiver semanticsPropertyReceiver0 = (SemanticsPropertyReceiver)object0;
        return Unit.INSTANCE;
    }
}

