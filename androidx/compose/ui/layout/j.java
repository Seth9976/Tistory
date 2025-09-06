package androidx.compose.ui.layout;

import androidx.compose.ui.node.Owner;
import androidx.compose.ui.unit.LayoutDirection;

public final class j extends PlacementScope {
    public final Owner b;

    public j(Owner owner0) {
        this.b = owner0;
    }

    @Override  // androidx.compose.ui.layout.Placeable$PlacementScope
    public final LayoutCoordinates getCoordinates() {
        return this.b.getRoot().getOuterCoordinator$ui_release();
    }

    @Override  // androidx.compose.ui.layout.Placeable$PlacementScope
    public final LayoutDirection getParentLayoutDirection() {
        return this.b.getLayoutDirection();
    }

    @Override  // androidx.compose.ui.layout.Placeable$PlacementScope
    public final int getParentWidth() {
        return this.b.getRoot().getWidth();
    }
}

