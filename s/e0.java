package s;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class e0 extends Lambda implements Function1 {
    public final State w;
    public final State x;
    public final State y;

    public e0(State state0, State state1, State state2) {
        this.w = state0;
        this.x = state1;
        this.y = state2;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = 1.0f;
        ((GraphicsLayerScope)object0).setAlpha((this.w == null ? 1.0f : ((Number)this.w.getValue()).floatValue()));
        State state0 = this.x;
        ((GraphicsLayerScope)object0).setScaleX((state0 == null ? 1.0f : ((Number)state0.getValue()).floatValue()));
        if(state0 != null) {
            f = ((Number)state0.getValue()).floatValue();
        }
        ((GraphicsLayerScope)object0).setScaleY(f);
        ((GraphicsLayerScope)object0).setTransformOrigin-__ExYCQ((this.y == null ? 0x3F0000003F000000L : ((TransformOrigin)this.y.getValue()).unbox-impl()));
        return Unit.INSTANCE;
    }
}

