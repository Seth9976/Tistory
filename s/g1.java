package s;

import androidx.compose.animation.BoundsAnimation;
import androidx.compose.animation.SharedBoundsNode;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g1 extends Lambda implements Function1 {
    public final SharedBoundsNode w;
    public final Placeable x;

    public g1(SharedBoundsNode sharedBoundsNode0, Placeable placeable0) {
        this.w = sharedBoundsNode0;
        this.x = placeable0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        long v;
        SharedBoundsNode sharedBoundsNode0 = this.w;
        if(!SharedBoundsNode.access$getSharedElement(sharedBoundsNode0).getFoundMatch()) {
            LayoutCoordinates layoutCoordinates0 = ((PlacementScope)object0).getCoordinates();
            if(layoutCoordinates0 != null) {
                SharedBoundsNode.access$updateCurrentBounds(sharedBoundsNode0, layoutCoordinates0);
            }
            PlacementScope.place$default(((PlacementScope)object0), this.x, 0, 0, 0.0f, 4, null);
            return Unit.INSTANCE;
        }
        if(SharedBoundsNode.access$getSharedElement(sharedBoundsNode0).getTargetBounds() != null) {
            BoundsAnimation boundsAnimation0 = SharedBoundsNode.access$getBoundsAnimation(sharedBoundsNode0);
            Rect rect0 = SharedBoundsNode.access$getSharedElement(sharedBoundsNode0).getCurrentBounds();
            Intrinsics.checkNotNull(rect0);
            Rect rect1 = SharedBoundsNode.access$getSharedElement(sharedBoundsNode0).getTargetBounds();
            Intrinsics.checkNotNull(rect1);
            boundsAnimation0.animate(rect0, rect1);
        }
        Rect rect2 = SharedBoundsNode.access$getBoundsAnimation(sharedBoundsNode0).getValue();
        LayoutCoordinates layoutCoordinates1 = ((PlacementScope)object0).getCoordinates();
        Offset offset0 = layoutCoordinates1 == null ? null : Offset.box-impl(SharedBoundsNode.access$getRootCoords(sharedBoundsNode0).localPositionOf-R5De75A(layoutCoordinates1, 0L));
        if(rect2 == null) {
            if(SharedBoundsNode.access$getBoundsAnimation(sharedBoundsNode0).getTarget()) {
                LayoutCoordinates layoutCoordinates2 = ((PlacementScope)object0).getCoordinates();
                if(layoutCoordinates2 != null) {
                    SharedBoundsNode.access$updateCurrentBounds(sharedBoundsNode0, layoutCoordinates2);
                }
            }
            Rect rect3 = SharedBoundsNode.access$getSharedElement(sharedBoundsNode0).getCurrentBounds();
            Intrinsics.checkNotNull(rect3);
            v = rect3.getTopLeft-F1C5BW0();
        }
        else {
            if(SharedBoundsNode.access$getBoundsAnimation(sharedBoundsNode0).getTarget()) {
                SharedBoundsNode.access$getSharedElement(sharedBoundsNode0).setCurrentBounds(rect2);
            }
            v = rect2.getTopLeft-F1C5BW0();
        }
        long v1 = offset0 == null ? 0L : Offset.minus-MK-Hz9U(v, offset0.unbox-impl());
        PlacementScope.place$default(((PlacementScope)object0), this.x, Math.round(Offset.getX-impl(v1)), Math.round(Offset.getY-impl(v1)), 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

