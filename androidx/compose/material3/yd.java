package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class yd extends Lambda implements Function1 {
    public final int w;
    public final Animatable x;

    public yd(Animatable animatable0, int v) {
        this.w = v;
        this.x = animatable0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            ((GraphicsLayerScope)object0).setAlpha(((Number)this.x.getValue()).floatValue());
            return Unit.INSTANCE;
        }
        float f = ((Number)this.x.getValue()).floatValue();
        float f1 = ModalBottomSheetKt.access$calculatePredictiveBackScaleX(((GraphicsLayerScope)object0), f);
        float f2 = ModalBottomSheetKt.access$calculatePredictiveBackScaleY(((GraphicsLayerScope)object0), f);
        ((GraphicsLayerScope)object0).setScaleY((f2 == 0.0f ? 1.0f : f1 / f2));
        ((GraphicsLayerScope)object0).setTransformOrigin-__ExYCQ(0x3F00000000000000L);
        return Unit.INSTANCE;
    }
}

