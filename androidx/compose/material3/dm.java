package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class dm extends Lambda implements Function1 {
    public final int A;
    public final Placeable B;
    public final int C;
    public final int D;
    public final Placeable w;
    public final int x;
    public final Placeable y;
    public final int z;

    public dm(Placeable placeable0, int v, Placeable placeable1, int v1, int v2, Placeable placeable2, int v3, int v4) {
        this.w = placeable0;
        this.x = v;
        this.y = placeable1;
        this.z = v1;
        this.A = v2;
        this.B = placeable2;
        this.C = v3;
        this.D = v4;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.w, 0, this.x, 0.0f, 4, null);
        Placeable placeable0 = this.y;
        if(placeable0 != null) {
            PlacementScope.placeRelative$default(((PlacementScope)object0), placeable0, this.z, this.A, 0.0f, 4, null);
        }
        Placeable placeable1 = this.B;
        if(placeable1 != null) {
            PlacementScope.placeRelative$default(((PlacementScope)object0), placeable1, this.C, this.D, 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }
}

