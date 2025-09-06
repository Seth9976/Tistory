package p0;

import androidx.compose.material.AnchoredDraggableKt;
import androidx.compose.material.BottomDrawerState;
import androidx.compose.material.BottomDrawerValue;
import androidx.compose.material.DraggableAnchors;
import androidx.compose.ui.unit.IntSize;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class o3 extends Lambda implements Function1 {
    public final BottomDrawerState w;
    public final float x;
    public final boolean y;

    public o3(BottomDrawerState bottomDrawerState0, float f, boolean z) {
        this.w = bottomDrawerState0;
        this.x = f;
        this.y = z;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        BottomDrawerValue bottomDrawerValue0;
        DraggableAnchors draggableAnchors0 = AnchoredDraggableKt.DraggableAnchors(new n3(this.x, ((float)IntSize.getHeight-impl(((IntSize)object0).unbox-impl())), this.y));
        BottomDrawerState bottomDrawerState0 = this.w;
        if(bottomDrawerState0.getAnchoredDraggableState$material_release().getAnchors().getSize() > 0 || !draggableAnchors0.hasAnchorFor(bottomDrawerState0.getCurrentValue())) {
            switch(bottomDrawerState0.getTargetValue()) {
                case 1: {
                    bottomDrawerValue0 = BottomDrawerValue.Closed;
                    break;
                }
                case 2: 
                case 3: {
                    bottomDrawerValue0 = BottomDrawerValue.Open;
                    if(!draggableAnchors0.hasAnchorFor(bottomDrawerValue0)) {
                        bottomDrawerValue0 = BottomDrawerValue.Expanded;
                        if(!draggableAnchors0.hasAnchorFor(bottomDrawerValue0)) {
                            bottomDrawerValue0 = BottomDrawerValue.Closed;
                        }
                    }
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        else {
            bottomDrawerValue0 = bottomDrawerState0.getCurrentValue();
        }
        bottomDrawerState0.getAnchoredDraggableState$material_release().updateAnchors(draggableAnchors0, bottomDrawerValue0);
        return Unit.INSTANCE;
    }
}

