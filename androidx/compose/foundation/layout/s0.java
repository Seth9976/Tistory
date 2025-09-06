package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;

public final class s0 extends CrossAxisAlignment {
    public final AlignmentLineProvider d;

    public s0(AlignmentLineProvider alignmentLineProvider0) {
        super(null);
        this.d = alignmentLineProvider0;
    }

    @Override  // androidx.compose.foundation.layout.CrossAxisAlignment
    public final int align$foundation_layout_release(int v, LayoutDirection layoutDirection0, Placeable placeable0, int v1) {
        int v2 = this.d.calculateAlignmentLinePosition(placeable0);
        if(v2 != 0x80000000) {
            int v3 = v1 - v2;
            return layoutDirection0 == LayoutDirection.Rtl ? v - v3 : v3;
        }
        return 0;
    }

    @Override  // androidx.compose.foundation.layout.CrossAxisAlignment
    public final Integer calculateAlignmentLinePosition$foundation_layout_release(Placeable placeable0) {
        return this.d.calculateAlignmentLinePosition(placeable0);
    }

    @Override  // androidx.compose.foundation.layout.CrossAxisAlignment
    public final boolean isRelative$foundation_layout_release() {
        return true;
    }
}

