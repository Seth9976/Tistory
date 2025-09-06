package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement.Horizontal;
import androidx.compose.foundation.layout.Arrangement.Vertical;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.q;

public final class r0 extends Lambda implements Function1 {
    public final long A;
    public final Placeable B;
    public final MeasureScope C;
    public final Vertical D;
    public final int E;
    public final int F;
    public final Placeable w;
    public final int x;
    public final Placeable y;
    public final Horizontal z;

    public r0(Placeable placeable0, int v, Placeable placeable1, Horizontal arrangement$Horizontal0, long v1, Placeable placeable2, MeasureScope measureScope0, Vertical arrangement$Vertical0, int v2, int v3) {
        this.w = placeable0;
        this.x = v;
        this.y = placeable1;
        this.z = arrangement$Horizontal0;
        this.A = v1;
        this.B = placeable2;
        this.C = measureScope0;
        this.D = arrangement$Vertical0;
        this.E = v2;
        this.F = v3;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v3;
        int v2;
        Placeable placeable0 = this.w;
        int v = this.x;
        PlacementScope.placeRelative$default(((PlacementScope)object0), placeable0, 0, (v - placeable0.getHeight()) / 2, 0.0f, 4, null);
        Arrangement arrangement0 = Arrangement.INSTANCE;
        Horizontal arrangement$Horizontal0 = this.z;
        boolean z = Intrinsics.areEqual(arrangement$Horizontal0, arrangement0.getCenter());
        Placeable placeable1 = this.B;
        long v1 = this.A;
        Placeable placeable2 = this.y;
        if(z) {
            v2 = q.d(placeable2, Constraints.getMaxWidth-impl(v1), 2);
            if(v2 < placeable0.getWidth()) {
                v2 = placeable0.getWidth();
            }
            else if(placeable2.getWidth() + v2 > Constraints.getMaxWidth-impl(v1) - placeable1.getWidth()) {
                v2 += Constraints.getMaxWidth-impl(v1) - placeable1.getWidth() - (placeable2.getWidth() + v2);
            }
        }
        else {
            v2 = Intrinsics.areEqual(arrangement$Horizontal0, arrangement0.getEnd()) ? Constraints.getMaxWidth-impl(v1) - placeable2.getWidth() - placeable1.getWidth() : Math.max(this.C.roundToPx-0680j_4(12.0f), placeable0.getWidth());
        }
        Vertical arrangement$Vertical0 = this.D;
        if(Intrinsics.areEqual(arrangement$Vertical0, arrangement0.getCenter())) {
            v3 = q.A(placeable2, v, 2);
        }
        else if(Intrinsics.areEqual(arrangement$Vertical0, arrangement0.getBottom())) {
            int v4 = this.E;
            if(v4 == 0) {
                v3 = v - placeable2.getHeight();
            }
            else {
                int v5 = v4 - (placeable2.getHeight() - this.F);
                int v6 = placeable2.getHeight() + v5;
                if(v6 > Constraints.getMaxHeight-impl(v1)) {
                    v5 -= v6 - Constraints.getMaxHeight-impl(v1);
                }
                v3 = v - placeable2.getHeight() - Math.max(0, v5);
            }
        }
        else {
            v3 = 0;
        }
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.y, v2, v3, 0.0f, 4, null);
        int v7 = q.A(placeable1, v, 2);
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.B, Constraints.getMaxWidth-impl(v1) - placeable1.getWidth(), v7, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

