package x0;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Lambda;
import r0.a;

public final class e extends Lambda implements Function1 {
    public final int w;
    public static final e x;
    public static final e y;

    static {
        e.x = new e(1, 0);
        e.y = new e(1, 1);
    }

    public e(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            return new PullToRefreshStateImpl(new Animatable(((Number)object0).floatValue(), VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), null, null, 12, null), null);
        }
        DrawContext drawContext0 = ((ContentDrawScope)object0).getDrawContext();
        long v = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        try {
            drawContext0.getTransform().clipRect-N_I0leg(-3.402823E+38f, 0.0f, 3.402823E+38f, 3.402823E+38f, 1);
            ((ContentDrawScope)object0).drawContent();
            return Unit.INSTANCE;
        }
        finally {
            a.y(drawContext0, v);
        }
    }
}

