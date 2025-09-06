package p0;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public final Placeable w;
    public final int x;
    public final Placeable y;
    public final int z;

    public a(Placeable placeable0, int v, Placeable placeable1, int v1) {
        this.w = placeable0;
        this.x = v;
        this.y = placeable1;
        this.z = v1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Placeable placeable0 = this.w;
        if(placeable0 != null) {
            PlacementScope.place$default(((PlacementScope)object0), placeable0, 0, this.x, 0.0f, 4, null);
        }
        Placeable placeable1 = this.y;
        if(placeable1 != null) {
            PlacementScope.place$default(((PlacementScope)object0), placeable1, 0, this.z, 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }
}

