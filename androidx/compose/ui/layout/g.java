package androidx.compose.ui.layout;

import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.LayoutDirection;

public final class g extends PlacementScope {
    public final LookaheadCapablePlaceable b;

    public g(LookaheadCapablePlaceable lookaheadCapablePlaceable0) {
        this.b = lookaheadCapablePlaceable0;
    }

    @Override  // androidx.compose.ui.layout.Placeable$PlacementScope
    public final float current(Ruler ruler0, float f) {
        return this.b.findRulerValue(ruler0, f);
    }

    @Override  // androidx.compose.ui.layout.Placeable$PlacementScope
    public final LayoutCoordinates getCoordinates() {
        LookaheadCapablePlaceable lookaheadCapablePlaceable0 = this.b;
        LayoutCoordinates layoutCoordinates0 = lookaheadCapablePlaceable0.isPlacingForAlignment$ui_release() ? null : lookaheadCapablePlaceable0.getCoordinates();
        if(layoutCoordinates0 == null) {
            lookaheadCapablePlaceable0.getLayoutNode().getLayoutDelegate$ui_release().onCoordinatesUsed();
        }
        return layoutCoordinates0;
    }

    @Override  // androidx.compose.ui.layout.Placeable$PlacementScope
    public final LayoutDirection getParentLayoutDirection() {
        return this.b.getLayoutDirection();
    }

    @Override  // androidx.compose.ui.layout.Placeable$PlacementScope
    public final int getParentWidth() {
        return this.b.getMeasuredWidth();
    }
}

