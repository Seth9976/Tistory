package androidx.compose.material3;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import zd.c;

public final class qg extends Lambda implements Function1 {
    public final int A;
    public final float B;
    public final float C;
    public final Placeable D;
    public final int E;
    public final float F;
    public final Placeable G;
    public final int H;
    public final float I;
    public final int J;
    public final MeasureScope K;
    public final Placeable w;
    public final boolean x;
    public final float y;
    public final Placeable z;

    public qg(Placeable placeable0, boolean z, float f, Placeable placeable1, int v, float f1, float f2, Placeable placeable2, int v1, float f3, Placeable placeable3, int v2, float f4, int v3, MeasureScope measureScope0) {
        this.w = placeable0;
        this.x = z;
        this.y = f;
        this.z = placeable1;
        this.A = v;
        this.B = f1;
        this.C = f2;
        this.D = placeable2;
        this.E = v1;
        this.F = f3;
        this.G = placeable3;
        this.H = v2;
        this.I = f4;
        this.J = v3;
        this.K = measureScope0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = this.F;
        float f1 = this.C;
        Placeable placeable0 = this.w;
        if(placeable0 != null) {
            int v = c.roundToInt(f - this.K.toPx-0680j_4(NavigationRailKt.g) + f1);
            PlacementScope.placeRelative$default(((PlacementScope)object0), placeable0, (this.J - placeable0.getWidth()) / 2, v, 0.0f, 4, null);
        }
        if(this.x || this.y != 0.0f) {
            int v1 = c.roundToInt(this.B + f1);
            PlacementScope.placeRelative$default(((PlacementScope)object0), this.z, this.A, v1, 0.0f, 4, null);
        }
        int v2 = c.roundToInt(f + f1);
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.D, this.E, v2, 0.0f, 4, null);
        int v3 = c.roundToInt(this.I + f1);
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.G, this.H, v3, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

