package s;

import androidx.compose.animation.SharedBoundsNode;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class d1 extends Lambda implements Function1 {
    public final Placeable w;
    public final SharedBoundsNode x;
    public final long y;

    public d1(Placeable placeable0, SharedBoundsNode sharedBoundsNode0, long v) {
        this.w = placeable0;
        this.x = sharedBoundsNode0;
        this.y = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Offset offset0;
        LayoutCoordinates layoutCoordinates0 = ((PlacementScope)object0).getCoordinates();
        SharedBoundsNode sharedBoundsNode0 = this.x;
        if(layoutCoordinates0 == null) {
            offset0 = null;
        }
        else {
            long v = SharedBoundsNode.access$getRootLookaheadCoords(sharedBoundsNode0).localPositionOf-R5De75A(layoutCoordinates0, 0L);
            if(SharedBoundsNode.access$getSharedElement(sharedBoundsNode0).getCurrentBounds() == null) {
                SharedBoundsNode.access$getSharedElement(sharedBoundsNode0).setCurrentBounds(RectKt.Rect-tz77jQw(v, this.y));
            }
            offset0 = Offset.box-impl(v);
        }
        PlacementScope.place$default(((PlacementScope)object0), this.w, 0, 0, 0.0f, 4, null);
        if(offset0 != null) {
            SharedBoundsNode.access$getSharedElement(sharedBoundsNode0).onLookaheadResult-v_w8tDc(sharedBoundsNode0.getState(), this.y, offset0.unbox-impl());
        }
        return Unit.INSTANCE;
    }
}

