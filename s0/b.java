package s0;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import zd.c;

public final class b extends Lambda implements Function1 {
    public final int w;
    public final g x;

    public b(g g0, int v) {
        this.w = v;
        this.x = g0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            IntSize intSize0 = IntSize.box-impl(((IntSize)object0).unbox-impl());
            this.x.L.setValue(intSize0);
            this.x.updatePosition();
            return Unit.INSTANCE;
        }
        LayoutCoordinates layoutCoordinates0 = ((LayoutCoordinates)object0).getParentLayoutCoordinates();
        Intrinsics.checkNotNull(layoutCoordinates0);
        long v = layoutCoordinates0.getSize-YbymL2g();
        long v1 = LayoutCoordinatesKt.positionInWindow(layoutCoordinates0);
        IntRect intRect0 = IntRectKt.IntRect-VbeCjmY(IntOffsetKt.IntOffset(c.roundToInt(Offset.getX-impl(v1)), c.roundToInt(Offset.getY-impl(v1))), v);
        this.x.K.setValue(intRect0);
        this.x.updatePosition();
        return Unit.INSTANCE;
    }
}

