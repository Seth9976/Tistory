package p0;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class d9 extends Lambda implements Function1 {
    public final int A;
    public final Placeable w;
    public final int x;
    public final Placeable y;
    public final int z;

    public d9(Placeable placeable0, int v, Placeable placeable1, int v1, int v2) {
        this.w = placeable0;
        this.x = v;
        this.y = placeable1;
        this.z = v1;
        this.A = v2;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.w, 0, this.x, 0.0f, 4, null);
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.y, this.z, this.A, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

