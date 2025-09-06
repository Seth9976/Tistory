package s;

import androidx.compose.animation.n;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import zd.c;

public final class s1 extends Lambda implements Function1 {
    public final MeasureScope A;
    public final t1 w;
    public final Placeable x;
    public final long y;
    public final long z;

    public s1(t1 t10, Placeable placeable0, long v, long v1, MeasureScope measureScope0) {
        this.w = t10;
        this.x = placeable0;
        this.y = v;
        this.z = v1;
        this.A = measureScope0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        n n0 = (n)this.w.o.getValue();
        boolean z = ((Boolean)((Function0)this.w.p.getValue()).invoke()).booleanValue();
        Placeable placeable0 = this.x;
        if(z && n0 != null) {
            long v = IntSize.getWidth-impl(this.y) == 0 || IntSize.getHeight-impl(this.y) == 0 ? 0x3F8000003F800000L : n0.a.computeScaleFactor-H7hwNQA(IntSizeKt.toSize-ozmzZPI(this.y), IntSizeKt.toSize-ozmzZPI(this.z));
            long v1 = IntSizeKt.IntSize(c.roundToInt(ScaleFactor.getScaleX-impl(v) * ((float)IntSize.getWidth-impl(this.y))), c.roundToInt(ScaleFactor.getScaleY-impl(v) * ((float)IntSize.getHeight-impl(this.y))));
            LayoutDirection layoutDirection0 = this.A.getLayoutDirection();
            long v2 = n0.b.align-KFBX0sM(v1, this.z, layoutDirection0);
            PlacementScope.placeWithLayer$default(((PlacementScope)object0), placeable0, IntOffset.getX-impl(v2), IntOffset.getY-impl(v2), 0.0f, new r1(v), 4, null);
            return Unit.INSTANCE;
        }
        PlacementScope.place$default(((PlacementScope)object0), placeable0, 0, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

