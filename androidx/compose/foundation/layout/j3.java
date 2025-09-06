package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class j3 extends Lambda implements Function1 {
    public final k3 w;
    public final MeasureScope x;
    public final Placeable y;

    public j3(k3 k30, MeasureScope measureScope0, Placeable placeable0) {
        this.w = k30;
        this.x = measureScope0;
        this.y = placeable0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        long v = ((IntOffset)this.w.n.invoke(this.x)).unbox-impl();
        Placeable placeable0 = this.y;
        if(this.w.o) {
            PlacementScope.placeRelativeWithLayer$default(((PlacementScope)object0), placeable0, IntOffset.getX-impl(v), IntOffset.getY-impl(v), 0.0f, null, 12, null);
            return Unit.INSTANCE;
        }
        PlacementScope.placeWithLayer$default(((PlacementScope)object0), placeable0, IntOffset.getX-impl(v), IntOffset.getY-impl(v), 0.0f, null, 12, null);
        return Unit.INSTANCE;
    }
}

