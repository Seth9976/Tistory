package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Intrinsics;

public final class x0 extends CrossAxisAlignment {
    public final Vertical d;

    public x0(Vertical alignment$Vertical0) {
        super(null);
        this.d = alignment$Vertical0;
    }

    @Override  // androidx.compose.foundation.layout.CrossAxisAlignment
    public final int align$foundation_layout_release(int v, LayoutDirection layoutDirection0, Placeable placeable0, int v1) {
        return this.d.align(0, v);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof x0 ? Intrinsics.areEqual(this.d, ((x0)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.d + ')';
    }
}

