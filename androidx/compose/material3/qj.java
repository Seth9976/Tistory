package androidx.compose.material3;

import androidx.activity.BackEventCompat;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class qj extends Lambda implements Function1 {
    public final float A;
    public final MutableState B;
    public final int C;
    public final Placeable D;
    public final int E;
    public final Placeable F;
    public final int G;
    public final Placeable H;
    public final int I;
    public final MeasureScope w;
    public final long x;
    public final MutableState y;
    public final float z;

    public qj(MeasureScope measureScope0, long v, MutableState mutableState0, float f, float f1, MutableState mutableState1, int v1, Placeable placeable0, int v2, Placeable placeable1, int v3, Placeable placeable2, int v4) {
        this.w = measureScope0;
        this.x = v;
        this.y = mutableState0;
        this.z = f;
        this.A = f1;
        this.B = mutableState1;
        this.C = v1;
        this.D = placeable0;
        this.E = v2;
        this.F = placeable1;
        this.G = v3;
        this.H = placeable2;
        this.I = v4;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v = this.w.roundToPx-0680j_4(0.0f);
        Object object1 = this.y.getValue();
        LayoutDirection layoutDirection0 = this.w.getLayoutDirection();
        int v1 = SearchBar_androidKt.access$calculatePredictiveBackOffsetX-rOvwMX4(this.x, v, ((BackEventCompat)object1), layoutDirection0, this.z, this.A);
        Object object2 = this.y.getValue();
        Object object3 = this.B.getValue();
        int v2 = this.w.roundToPx-0680j_4(0.0f);
        int v3 = SearchBar_androidKt.access$calculatePredictiveBackOffsetY-dzo92Q0(this.x, v, ((BackEventCompat)object2), ((BackEventCompat)object3), this.C, v2, this.A);
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.D, v1, v3 + this.E, 0.0f, 4, null);
        int v4 = v3 + this.G;
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.F, v1, v4, 0.0f, 4, null);
        Placeable placeable0 = this.H;
        if(placeable0 != null) {
            PlacementScope.placeRelative$default(((PlacementScope)object0), placeable0, v1, this.F.getHeight() + v4 + this.I, 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }
}

