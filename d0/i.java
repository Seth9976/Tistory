package d0;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function1 {
    public final int w;
    public final GraphicsLayer x;
    public final LazyLayoutItemAnimation y;

    public i(GraphicsLayer graphicsLayer0, LazyLayoutItemAnimation lazyLayoutItemAnimation0, int v) {
        this.w = v;
        this.x = graphicsLayer0;
        this.y = lazyLayoutItemAnimation0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            float f = ((Number)((Animatable)object0).getValue()).floatValue();
            this.x.setAlpha(f);
            this.y.c.invoke();
            return Unit.INSTANCE;
        }
        float f1 = ((Number)((Animatable)object0).getValue()).floatValue();
        this.x.setAlpha(f1);
        this.y.c.invoke();
        return Unit.INSTANCE;
    }
}

