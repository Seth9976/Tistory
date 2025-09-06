package p0;

import androidx.compose.material.AnchoredDraggableState;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function0 {
    public final int w;
    public final AnchoredDraggableState x;

    public t(AnchoredDraggableState anchoredDraggableState0, int v) {
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
                AnchoredDraggableState anchoredDraggableState0 = this.x;
                Object object0 = AnchoredDraggableState.access$getDragTarget(anchoredDraggableState0);
                if(object0 == null) {
                    float f = anchoredDraggableState0.getOffset();
                    return Float.isNaN(f) ? anchoredDraggableState0.getCurrentValue() : AnchoredDraggableState.access$computeTargetWithoutThresholds(anchoredDraggableState0, f, anchoredDraggableState0.getCurrentValue());
                }
                return object0;
            }
            case 3: {
                AnchoredDraggableState anchoredDraggableState1 = this.x;
                float f1 = anchoredDraggableState1.getAnchors().positionOf(anchoredDraggableState1.getCurrentValue());
                float f2 = anchoredDraggableState1.getAnchors().positionOf(anchoredDraggableState1.getClosestValue$material_release()) - f1;
                float f3 = Math.abs(f2);
                float f4 = 1.0f;
                if(!Float.isNaN(f3) && f3 > 0.000001f) {
                    float f5 = (anchoredDraggableState1.requireOffset() - f1) / f2;
                    if(f5 < 0.000001f) {
                        return 0.0f;
                    }
                    if(f5 <= 0.999999f) {
                        f4 = f5;
                    }
                }
                return f4;
            }
            case 4: {
                AnchoredDraggableState anchoredDraggableState2 = this.x;
                Object object1 = AnchoredDraggableState.access$getDragTarget(anchoredDraggableState2);
                if(object1 == null) {
                    float f6 = anchoredDraggableState2.getOffset();
                    return Float.isNaN(f6) ? anchoredDraggableState2.getCurrentValue() : AnchoredDraggableState.access$computeTarget(anchoredDraggableState2, f6, anchoredDraggableState2.getCurrentValue(), 0.0f);
                }
                return object1;
            }
            case 5: {
                return (Boolean)this.x.getCurrentValue();
            }
            default: {
                return this.x.requireOffset();
            }
        }
    }
}

