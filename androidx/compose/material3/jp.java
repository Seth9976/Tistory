package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.q;
import zd.c;

public final class jp extends Lambda implements Function1 {
    public final float A;
    public final float B;
    public final Placeable w;
    public final ArrayList x;
    public final Placeable y;
    public final long z;

    public jp(Placeable placeable0, ArrayList arrayList0, Placeable placeable1, long v, float f, float f1) {
        this.w = placeable0;
        this.x = arrayList0;
        this.y = placeable1;
        this.z = v;
        this.A = f;
        this.B = f1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        long v2;
        Placeable placeable0 = this.w;
        if(placeable0 != null) {
            PlacementScope.place$default(((PlacementScope)object0), placeable0, 0, 0, 0.0f, 4, null);
        }
        ArrayList arrayList0 = this.x;
        int v = arrayList0.size();
        for(int v1 = 0; true; ++v1) {
            v2 = this.z;
            if(v1 >= v) {
                break;
            }
            Placeable placeable1 = (Placeable)arrayList0.get(v1);
            double f = ((double)(this.B * ((float)v1))) - 1.570796;
            PlacementScope.place$default(((PlacementScope)object0), placeable1, c.roundToInt(Math.cos(f) * ((double)this.A) + ((double)(Constraints.getMaxWidth-impl(v2) / 2 - placeable1.getWidth() / 2))), c.roundToInt(Math.sin(f) * ((double)this.A) + ((double)(Constraints.getMaxHeight-impl(v2) / 2 - placeable1.getHeight() / 2))), 0.0f, 4, null);
        }
        Placeable placeable2 = this.y;
        if(placeable2 != null) {
            PlacementScope.place$default(((PlacementScope)object0), placeable2, q.d(placeable2, Constraints.getMinWidth-impl(v2), 2), q.A(placeable2, Constraints.getMinHeight-impl(v2), 2), 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }
}

