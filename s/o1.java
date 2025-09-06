package s;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class o1 extends Lambda implements Function1 {
    public final MeasureScope A;
    public final Placeable B;
    public final p1 w;
    public final long x;
    public final int y;
    public final int z;

    public o1(p1 p10, long v, int v1, int v2, MeasureScope measureScope0, Placeable placeable0) {
        this.w = p10;
        this.x = v;
        this.y = v1;
        this.z = v2;
        this.A = measureScope0;
        this.B = placeable0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Alignment alignment0 = this.w.o;
        LayoutDirection layoutDirection0 = this.A.getLayoutDirection();
        long v = alignment0.align-KFBX0sM(this.x, IntSizeKt.IntSize(this.y, this.z), layoutDirection0);
        PlacementScope.placeRelative-70tqf50$default(((PlacementScope)object0), this.B, v, 0.0f, 2, null);
        return Unit.INSTANCE;
    }
}

