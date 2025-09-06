package androidx.compose.material3;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class r3 extends Lambda implements Function1 {
    public final int A;
    public final Placeable B;
    public final int C;
    public final Placeable w;
    public final int x;
    public final int y;
    public final Placeable z;

    public r3(Placeable placeable0, int v, int v1, Placeable placeable1, int v2, Placeable placeable2, int v3) {
        this.w = placeable0;
        this.x = v;
        this.y = v1;
        this.z = placeable1;
        this.A = v2;
        this.B = placeable2;
        this.C = v3;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v = this.y;
        Placeable placeable0 = this.w;
        if(placeable0 != null) {
            PlacementScope.placeRelative$default(((PlacementScope)object0), placeable0, 0, Alignment.Companion.getCenterVertically().align(this.x, v), 0.0f, 4, null);
        }
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.z, this.A, 0, 0.0f, 4, null);
        Placeable placeable1 = this.B;
        if(placeable1 != null) {
            int v1 = Alignment.Companion.getCenterVertically().align(this.C, v);
            PlacementScope.placeRelative$default(((PlacementScope)object0), placeable1, this.A + this.z.getWidth(), v1, 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }
}

