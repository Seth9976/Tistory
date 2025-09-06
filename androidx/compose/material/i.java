package androidx.compose.material;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import zd.c;

public final class i extends Lambda implements Function1 {
    public final int A;
    public final float B;
    public final int C;
    public final int D;
    public final BottomSheetState E;
    public final int F;
    public final int G;
    public final ArrayList H;
    public final ArrayList I;
    public final ArrayList J;
    public final ArrayList K;
    public final ArrayList L;
    public final int M;
    public final Function0 w;
    public final int x;
    public final SubcomposeMeasureScope y;
    public final int z;

    public i(Function0 function00, int v, SubcomposeMeasureScope subcomposeMeasureScope0, int v1, int v2, float f, int v3, int v4, BottomSheetState bottomSheetState0, int v5, int v6, ArrayList arrayList0, ArrayList arrayList1, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, int v7) {
        this.w = function00;
        this.x = v;
        this.y = subcomposeMeasureScope0;
        this.z = v1;
        this.A = v2;
        this.B = f;
        this.C = v3;
        this.D = v4;
        this.E = bottomSheetState0;
        this.F = v5;
        this.G = v6;
        this.H = arrayList0;
        this.I = arrayList1;
        this.J = arrayList2;
        this.K = arrayList3;
        this.L = arrayList4;
        this.M = v7;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v8;
        int v3;
        int v = c.roundToInt(((Number)this.w.invoke()).floatValue());
        int v1 = this.x;
        int v2 = this.z;
        SubcomposeMeasureScope subcomposeMeasureScope0 = this.y;
        if(FabPosition.equals-impl0(v1, 0)) {
            v3 = subcomposeMeasureScope0.roundToPx-0680j_4(16.0f);
        }
        else {
            v3 = FabPosition.equals-impl0(v1, 1) ? (v2 - this.A) / 2 : v2 - this.A - subcomposeMeasureScope0.roundToPx-0680j_4(16.0f);
        }
        int v4 = subcomposeMeasureScope0.toPx-0680j_4(this.B) < ((float)(this.C / 2)) ? v - this.C - subcomposeMeasureScope0.roundToPx-0680j_4(16.0f) : v - this.C / 2;
        int v5 = (v2 - this.D) / 2;
        int v6 = BottomSheetScaffoldKt.BottomSheetScaffoldLayout.1.1.1.WhenMappings.$EnumSwitchMapping$0[this.E.getCurrentValue().ordinal()];
        int v7 = this.F;
        switch(v6) {
            case 1: {
                v8 = v4 - v7;
                break;
            }
            case 2: {
                v8 = this.G - v7;
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        ArrayList arrayList0 = this.H;
        int v9 = arrayList0.size();
        for(int v10 = 0; v10 < v9; ++v10) {
            PlacementScope.placeRelative$default(((PlacementScope)object0), ((Placeable)arrayList0.get(v10)), 0, this.M, 0.0f, 4, null);
        }
        ArrayList arrayList1 = this.I;
        if(arrayList1 != null) {
            int v11 = arrayList1.size();
            for(int v12 = 0; v12 < v11; ++v12) {
                PlacementScope.placeRelative$default(((PlacementScope)object0), ((Placeable)arrayList1.get(v12)), 0, 0, 0.0f, 4, null);
            }
        }
        ArrayList arrayList2 = this.J;
        int v13 = arrayList2.size();
        for(int v14 = 0; v14 < v13; ++v14) {
            PlacementScope.placeRelative$default(((PlacementScope)object0), ((Placeable)arrayList2.get(v14)), 0, v, 0.0f, 4, null);
        }
        ArrayList arrayList3 = this.K;
        if(arrayList3 != null) {
            int v15 = arrayList3.size();
            for(int v16 = 0; v16 < v15; ++v16) {
                PlacementScope.placeRelative$default(((PlacementScope)object0), ((Placeable)arrayList3.get(v16)), v3, v4, 0.0f, 4, null);
            }
        }
        ArrayList arrayList4 = this.L;
        int v17 = arrayList4.size();
        for(int v18 = 0; v18 < v17; ++v18) {
            PlacementScope.placeRelative$default(((PlacementScope)object0), ((Placeable)arrayList4.get(v18)), v5, v8, 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }
}

