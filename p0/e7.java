package p0;

import androidx.compose.material.FabPlacement;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class e7 extends Lambda implements Function1 {
    public final ArrayList A;
    public final int B;
    public final int C;
    public final int D;
    public final Integer E;
    public final FabPlacement F;
    public final Integer G;
    public final ArrayList w;
    public final ArrayList x;
    public final ArrayList y;
    public final ArrayList z;

    public e7(ArrayList arrayList0, ArrayList arrayList1, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, int v, int v1, int v2, Integer integer0, FabPlacement fabPlacement0, Integer integer1) {
        this.w = arrayList0;
        this.x = arrayList1;
        this.y = arrayList2;
        this.z = arrayList3;
        this.A = arrayList4;
        this.B = v;
        this.C = v1;
        this.D = v2;
        this.E = integer0;
        this.F = fabPlacement0;
        this.G = integer1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v6;
        ArrayList arrayList0 = this.w;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            PlacementScope.place$default(((PlacementScope)object0), ((Placeable)arrayList0.get(v1)), 0, this.B, 0.0f, 4, null);
        }
        ArrayList arrayList1 = this.x;
        int v2 = arrayList1.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            PlacementScope.place$default(((PlacementScope)object0), ((Placeable)arrayList1.get(v3)), 0, 0, 0.0f, 4, null);
        }
        ArrayList arrayList2 = this.y;
        int v4 = arrayList2.size();
        for(int v5 = 0; true; ++v5) {
            v6 = this.C;
            if(v5 >= v4) {
                break;
            }
            PlacementScope.place$default(((PlacementScope)object0), ((Placeable)arrayList2.get(v5)), 0, v6 - this.D, 0.0f, 4, null);
        }
        ArrayList arrayList3 = this.z;
        int v7 = arrayList3.size();
        for(int v8 = 0; v8 < v7; ++v8) {
            PlacementScope.place$default(((PlacementScope)object0), ((Placeable)arrayList3.get(v8)), 0, v6 - (this.E == null ? 0 : ((int)this.E)), 0.0f, 4, null);
        }
        ArrayList arrayList4 = this.A;
        int v9 = arrayList4.size();
        for(int v10 = 0; v10 < v9; ++v10) {
            PlacementScope.place$default(((PlacementScope)object0), ((Placeable)arrayList4.get(v10)), (this.F == null ? 0 : this.F.getLeft()), v6 - (this.G == null ? 0 : ((int)this.G)), 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }
}

