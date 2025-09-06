package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import pd.c;

public final class p1 extends Lambda implements Function2 {
    public final LayoutCoordinates w;

    public p1(LayoutCoordinates layoutCoordinates0) {
        this.w = layoutCoordinates0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        LayoutCoordinates layoutCoordinates0 = ((Selectable)object0).getLayoutCoordinates();
        LayoutCoordinates layoutCoordinates1 = ((Selectable)object1).getLayoutCoordinates();
        long v = layoutCoordinates0 == null ? 0L : this.w.localPositionOf-R5De75A(layoutCoordinates0, 0L);
        long v1 = layoutCoordinates1 == null ? 0L : this.w.localPositionOf-R5De75A(layoutCoordinates1, 0L);
        return Offset.getY-impl(v) == Offset.getY-impl(v1) ? c.compareValues(Offset.getX-impl(v), Offset.getX-impl(v1)) : c.compareValues(Offset.getY-impl(v), Offset.getY-impl(v1));
    }
}

