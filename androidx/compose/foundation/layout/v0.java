package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Intrinsics;

public final class v0 extends CrossAxisAlignment {
    public final Horizontal d;

    public v0(Horizontal alignment$Horizontal0) {
        super(null);
        this.d = alignment$Horizontal0;
    }

    @Override  // androidx.compose.foundation.layout.CrossAxisAlignment
    public final int align$foundation_layout_release(int v, LayoutDirection layoutDirection0, Placeable placeable0, int v1) {
        return this.d.align(0, v, layoutDirection0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof v0 ? Intrinsics.areEqual(this.d, ((v0)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.d + ')';
    }
}

