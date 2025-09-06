package p0;

import androidx.compose.material.BottomDrawerValue;
import androidx.compose.material.DraggableAnchorsConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class n3 extends Lambda implements Function1 {
    public final float w;
    public final float x;
    public final boolean y;

    public n3(float f, float f1, boolean z) {
        this.w = f;
        this.x = f1;
        this.y = z;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = this.w;
        ((DraggableAnchorsConfig)object0).at(BottomDrawerValue.Closed, f);
        float f1 = this.x;
        if(f1 > 0.5f * f || this.y) {
            ((DraggableAnchorsConfig)object0).at(BottomDrawerValue.Open, 0.5f * f);
        }
        if(f1 > 0.0f) {
            ((DraggableAnchorsConfig)object0).at(BottomDrawerValue.Expanded, Math.max(0.0f, f - f1));
        }
        return Unit.INSTANCE;
    }
}

