package w0;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import zd.c;

public final class s0 extends Lambda implements Function1 {
    public final MeasureScope w;
    public final t0 x;
    public final Placeable y;

    public s0(MeasureScope measureScope0, t0 t00, Placeable placeable0) {
        this.w = measureScope0;
        this.x = t00;
        this.y = placeable0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = this.w.isLookingAhead() ? this.x.n.getAnchors().positionOf(this.x.n.getTargetValue()) : this.x.n.requireOffset();
        float f1 = this.x.p == Orientation.Horizontal ? f : 0.0f;
        if(this.x.p != Orientation.Vertical) {
            f = 0.0f;
        }
        int v = c.roundToInt(f1);
        int v1 = c.roundToInt(f);
        PlacementScope.place$default(((PlacementScope)object0), this.y, v, v1, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

