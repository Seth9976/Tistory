package s;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class s0 extends Lambda implements Function1 {
    public final Placeable w;
    public final long x;
    public final long y;
    public final Function1 z;

    public s0(Placeable placeable0, long v, long v1, Function1 function10) {
        this.w = placeable0;
        this.x = v;
        this.y = v1;
        this.z = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((PlacementScope)object0).placeWithLayer(this.w, IntOffset.getX-impl(this.x) + IntOffset.getX-impl(this.y), IntOffset.getY-impl(this.y) + IntOffset.getY-impl(this.x), 0.0f, this.z);
        return Unit.INSTANCE;
    }
}

