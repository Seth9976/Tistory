package androidx.compose.ui.layout;

import androidx.compose.ui.unit.LayoutDirection;

public final class n extends PlacementScope {
    public final int b;
    public final LayoutDirection c;

    public n(int v, LayoutDirection layoutDirection0) {
        this.b = v;
        this.c = layoutDirection0;
    }

    @Override  // androidx.compose.ui.layout.Placeable$PlacementScope
    public final LayoutDirection getParentLayoutDirection() {
        return this.c;
    }

    @Override  // androidx.compose.ui.layout.Placeable$PlacementScope
    public final int getParentWidth() {
        return this.b;
    }
}

