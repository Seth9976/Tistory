package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class gg extends Lambda implements Function1 {
    public final int A;
    public final int B;
    public final Placeable C;
    public final int D;
    public final int E;
    public final Placeable F;
    public final int G;
    public final int H;
    public final Placeable w;
    public final int x;
    public final int y;
    public final Placeable z;

    public gg(Placeable placeable0, int v, int v1, Placeable placeable1, int v2, int v3, Placeable placeable2, int v4, int v5, Placeable placeable3, int v6, int v7) {
        this.w = placeable0;
        this.x = v;
        this.y = v1;
        this.z = placeable1;
        this.A = v2;
        this.B = v3;
        this.C = placeable2;
        this.D = v4;
        this.E = v5;
        this.F = placeable3;
        this.G = v6;
        this.H = v7;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.w, this.x, this.y, 0.0f, 4, null);
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.z, this.A, this.B, 0.0f, 4, null);
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.C, this.D, this.E, 0.0f, 4, null);
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.F, this.G, this.H, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

