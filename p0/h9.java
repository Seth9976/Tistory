package p0;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class h9 extends Lambda implements Function1 {
    public final int w;
    public final Placeable x;

    public h9(Placeable placeable0, int v) {
        this.w = v;
        this.x = placeable0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.x, 0, (this.w - this.x.getHeight()) / 2, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

