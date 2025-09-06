package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class mi extends Lambda implements Function1 {
    public final FabPlacement A;
    public final int B;
    public final int C;
    public final WindowInsets D;
    public final SubcomposeMeasureScope E;
    public final int F;
    public final int G;
    public final Integer H;
    public final ArrayList I;
    public final Integer J;
    public final ArrayList w;
    public final ArrayList x;
    public final ArrayList y;
    public final ArrayList z;

    public mi(ArrayList arrayList0, ArrayList arrayList1, ArrayList arrayList2, ArrayList arrayList3, FabPlacement fabPlacement0, int v, int v1, WindowInsets windowInsets0, SubcomposeMeasureScope subcomposeMeasureScope0, int v2, int v3, Integer integer0, ArrayList arrayList4, Integer integer1) {
        this.w = arrayList0;
        this.x = arrayList1;
        this.y = arrayList2;
        this.z = arrayList3;
        this.A = fabPlacement0;
        this.B = v;
        this.C = v1;
        this.D = windowInsets0;
        this.E = subcomposeMeasureScope0;
        this.F = v2;
        this.G = v3;
        this.H = integer0;
        this.I = arrayList4;
        this.J = integer1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v7;
        ArrayList arrayList0 = this.w;
        int v = arrayList0.size();
        for(int v2 = 0; v2 < v; ++v2) {
            PlacementScope.place$default(((PlacementScope)object0), ((Placeable)arrayList0.get(v2)), 0, 0, 0.0f, 4, null);
        }
        ArrayList arrayList1 = this.x;
        int v3 = arrayList1.size();
        for(int v4 = 0; v4 < v3; ++v4) {
            PlacementScope.place$default(((PlacementScope)object0), ((Placeable)arrayList1.get(v4)), 0, 0, 0.0f, 4, null);
        }
        ArrayList arrayList2 = this.y;
        int v5 = arrayList2.size();
        for(int v6 = 0; true; ++v6) {
            v7 = this.F;
            if(v6 >= v5) {
                break;
            }
            Object object1 = arrayList2.get(v6);
            LayoutDirection layoutDirection0 = this.E.getLayoutDirection();
            PlacementScope.place$default(((PlacementScope)object0), ((Placeable)object1), this.D.getLeft(this.E, layoutDirection0) + (this.B - this.C) / 2, v7 - this.G, 0.0f, 4, null);
        }
        ArrayList arrayList3 = this.z;
        int v8 = arrayList3.size();
        for(int v9 = 0; v9 < v8; ++v9) {
            PlacementScope.place$default(((PlacementScope)object0), ((Placeable)arrayList3.get(v9)), 0, v7 - (this.H == null ? 0 : ((int)this.H)), 0.0f, 4, null);
        }
        FabPlacement fabPlacement0 = this.A;
        if(fabPlacement0 != null) {
            ArrayList arrayList4 = this.I;
            int v10 = arrayList4.size();
            for(int v1 = 0; v1 < v10; ++v1) {
                Object object2 = arrayList4.get(v1);
                Intrinsics.checkNotNull(this.J);
                PlacementScope.place$default(((PlacementScope)object0), ((Placeable)object2), fabPlacement0.getLeft(), v7 - ((int)this.J), 0.0f, 4, null);
            }
        }
        return Unit.INSTANCE;
    }
}

