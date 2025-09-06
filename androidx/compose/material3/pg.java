package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class pg extends Lambda implements Function1 {
    public final Placeable A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final Placeable w;
    public final Placeable x;
    public final int y;
    public final int z;

    public pg(int v, int v1, int v2, int v3, int v4, int v5, Placeable placeable0, Placeable placeable1, Placeable placeable2) {
        this.w = placeable0;
        this.x = placeable1;
        this.y = v;
        this.z = v1;
        this.A = placeable2;
        this.B = v2;
        this.C = v3;
        this.D = v4;
        this.E = v5;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Placeable placeable0 = this.w;
        if(placeable0 != null) {
            PlacementScope.placeRelative$default(((PlacementScope)object0), placeable0, (this.D - placeable0.getWidth()) / 2, (this.E - placeable0.getHeight()) / 2, 0.0f, 4, null);
        }
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.x, this.y, this.z, 0.0f, 4, null);
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.A, this.B, this.C, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

