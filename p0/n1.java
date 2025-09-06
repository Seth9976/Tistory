package p0;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class n1 extends Lambda implements Function1 {
    public final int A;
    public final Placeable B;
    public final int C;
    public final int D;
    public final float w;
    public final Placeable x;
    public final int y;
    public final int z;

    public n1(float f, Placeable placeable0, int v, int v1, int v2, Placeable placeable1, int v3, int v4) {
        this.w = f;
        this.x = placeable0;
        this.y = v;
        this.z = v1;
        this.A = v2;
        this.B = placeable1;
        this.C = v3;
        this.D = v4;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v = this.A;
        if(Float.compare(this.w, 0.0f) != 0) {
            PlacementScope.placeRelative$default(((PlacementScope)object0), this.x, this.y, this.z + v, 0.0f, 4, null);
        }
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.B, this.C, this.D + v, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

