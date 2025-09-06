package s;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.ScaleFactor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class r1 extends Lambda implements Function1 {
    public final long w;

    public r1(long v) {
        this.w = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((GraphicsLayerScope)object0).setScaleX(ScaleFactor.getScaleX-impl(this.w));
        ((GraphicsLayerScope)object0).setScaleY(ScaleFactor.getScaleY-impl(this.w));
        ((GraphicsLayerScope)object0).setTransformOrigin-__ExYCQ(0L);
        return Unit.INSTANCE;
    }
}

