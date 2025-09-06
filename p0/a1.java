package p0;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a1 extends Lambda implements Function1 {
    public final Placeable w;
    public final MeasureScope x;
    public final Placeable y;

    public a1(Placeable placeable0, MeasureScope measureScope0, Placeable placeable1) {
        this.w = placeable0;
        this.x = measureScope0;
        this.y = placeable1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = this.w.getWidth() <= this.x.roundToPx-0680j_4(4.0f) * 2 ? -4.0f : -6.0f;
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.y, 0, 0, 0.0f, 4, null);
        int v = this.x.roundToPx-0680j_4(f);
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.w, v + this.y.getWidth(), -this.w.getHeight() / 2, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

