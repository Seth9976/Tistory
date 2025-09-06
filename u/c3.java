package u;

import androidx.compose.foundation.ScrollingLayoutNode;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.c;

public final class c3 extends Lambda implements Function1 {
    public final ScrollingLayoutNode w;
    public final int x;
    public final Placeable y;

    public c3(ScrollingLayoutNode scrollingLayoutNode0, int v, Placeable placeable0) {
        this.w = scrollingLayoutNode0;
        this.x = v;
        this.y = placeable0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v = 0;
        int v1 = c.coerceIn(this.w.getScrollerState().getValue(), 0, this.x);
        int v2 = this.w.isReversed() ? v1 - this.x : -v1;
        int v3 = this.w.isVertical() ? 0 : v2;
        if(this.w.isVertical()) {
            v = v2;
        }
        ((PlacementScope)object0).withMotionFrameOfReferencePlacement(new b3(this.y, v3, v));
        return Unit.INSTANCE;
    }
}

