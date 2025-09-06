package w0;

import androidx.compose.material3.internal.AnchoredDraggableState;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function0 {
    public final int w;
    public final AnchoredDraggableState x;

    public s(AnchoredDraggableState anchoredDraggableState0, int v) {
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
                Object object1 = AnchoredDraggableState.access$getDragTarget(anchoredDraggableState1);
                if(object1 == null) {
                    float f1 = anchoredDraggableState1.getOffset();
                    return Float.isNaN(f1) ? anchoredDraggableState1.getCurrentValue() : AnchoredDraggableState.access$computeTargetWithoutThresholds(anchoredDraggableState1, f1, anchoredDraggableState1.getCurrentValue());
                }
                return object1;
            }
            case 3: {
                AnchoredDraggableState anchoredDraggableState2 = this.x;
                float f2 = anchoredDraggableState2.getAnchors().positionOf(anchoredDraggableState2.getCurrentValue());
                float f3 = anchoredDraggableState2.getAnchors().positionOf(anchoredDraggableState2.getClosestValue$material3_release()) - f2;
                float f4 = Math.abs(f3);
                float f5 = 1.0f;
                if(!Float.isNaN(f4) && f4 > 0.000001f) {
                    float f6 = (anchoredDraggableState2.requireOffset() - f2) / f3;
                    if(f6 < 0.000001f) {
                        return 0.0f;
                    }
                    if(f6 <= 0.999999f) {
                        f5 = f6;
                    }
                }
                return f5;
            }
            default: {
                AnchoredDraggableState anchoredDraggableState0 = this.x;
                Object object0 = AnchoredDraggableState.access$getDragTarget(anchoredDraggableState0);
                if(object0 == null) {
                    float f = anchoredDraggableState0.getOffset();
                    return Float.isNaN(f) ? anchoredDraggableState0.getCurrentValue() : AnchoredDraggableState.access$computeTarget(anchoredDraggableState0, f, anchoredDraggableState0.getCurrentValue(), 0.0f);
                }
                return object0;
            }
        }
    }
}

