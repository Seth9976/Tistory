package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class w4 extends Lambda implements Function1 {
    public final MeasureScope A;
    public final x4 w;
    public final int x;
    public final Placeable y;
    public final int z;

    public w4(x4 x40, int v, Placeable placeable0, int v1, MeasureScope measureScope0) {
        this.w = x40;
        this.x = v;
        this.y = placeable0;
        this.z = v1;
        this.A = measureScope0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        long v = ((IntOffset)((Function2)this.w.p).invoke(IntSize.box-impl(IntSizeKt.IntSize(this.x - this.y.getWidth(), this.z - this.y.getHeight())), this.A.getLayoutDirection())).unbox-impl();
        PlacementScope.place-70tqf50$default(((PlacementScope)object0), this.y, v, 0.0f, 2, null);
        return Unit.INSTANCE;
    }
}

