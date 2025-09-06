package z;

import androidx.compose.foundation.gestures.AnchoredDraggableState;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function0 {
    public final int w;
    public final AnchoredDraggableState x;

    public o(AnchoredDraggableState anchoredDraggableState0, int v) {
        this.w = v;
        this.x = anchoredDraggableState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return this.x.getAnchors();
            }
            case 1: {
                return TuplesKt.to(this.x.getAnchors(), this.x.getTargetValue());
            }
            case 2: {
                AnchoredDraggableState anchoredDraggableState1 = this.x;
                float f = anchoredDraggableState1.getAnchors().positionOf(anchoredDraggableState1.getSettledValue());
                float f1 = anchoredDraggableState1.getAnchors().positionOf(anchoredDraggableState1.getTargetValue()) - f;
                float f2 = Math.abs(f1);
                float f3 = 1.0f;
                if(!Float.isNaN(f2) && f2 > 0.000001f) {
                    float f4 = (anchoredDraggableState1.requireOffset() - f) / f1;
                    if(f4 < 0.000001f) {
                        return 0.0f;
                    }
                    if(f4 <= 0.999999f) {
                        f3 = f4;
                    }
                }
                return f3;
            }
            default: {
                AnchoredDraggableState anchoredDraggableState0 = this.x;
                Object object0 = AnchoredDraggableState.access$getDragTarget(anchoredDraggableState0);
                if(object0 == null) {
                    if(!Float.isNaN(anchoredDraggableState0.getOffset())) {
                        object0 = anchoredDraggableState0.getAnchors().closestAnchor(anchoredDraggableState0.getOffset());
                        return object0 == null ? anchoredDraggableState0.getCurrentValue() : object0;
                    }
                    return anchoredDraggableState0.getCurrentValue();
                }
                return object0;
            }
        }
    }
}

