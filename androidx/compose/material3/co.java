package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.IntRef;

public final class co extends Lambda implements Function1 {
    public final int A;
    public final ArrayList w;
    public final ArrayList x;
    public final ArrayList y;
    public final IntRef z;

    public co(ArrayList arrayList0, ArrayList arrayList1, ArrayList arrayList2, IntRef ref$IntRef0, int v) {
        this.w = arrayList0;
        this.x = arrayList1;
        this.y = arrayList2;
        this.z = ref$IntRef0;
        this.A = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v5;
        ArrayList arrayList0 = this.w;
        int v = arrayList0.size();
        for(int v2 = 0; v2 < v; ++v2) {
            PlacementScope.placeRelative$default(((PlacementScope)object0), ((Placeable)arrayList0.get(v2)), v2 * this.z.element, 0, 0.0f, 4, null);
        }
        ArrayList arrayList1 = this.x;
        int v3 = arrayList1.size();
        for(int v4 = 0; true; ++v4) {
            v5 = this.A;
            if(v4 >= v3) {
                break;
            }
            Object object1 = arrayList1.get(v4);
            PlacementScope.placeRelative$default(((PlacementScope)object0), ((Placeable)object1), 0, v5 - ((Placeable)object1).getHeight(), 0.0f, 4, null);
        }
        ArrayList arrayList2 = this.y;
        int v6 = arrayList2.size();
        for(int v1 = 0; v1 < v6; ++v1) {
            Object object2 = arrayList2.get(v1);
            PlacementScope.placeRelative$default(((PlacementScope)object0), ((Placeable)object2), 0, v5 - ((Placeable)object2).getHeight(), 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }
}

