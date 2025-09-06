package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import zd.c;

public final class t1 extends Lambda implements Function1 {
    public final Function0 A;
    public final int B;
    public final ArrayList C;
    public final ArrayList D;
    public final int E;
    public final ArrayList w;
    public final int x;
    public final ArrayList y;
    public final SheetState z;

    public t1(ArrayList arrayList0, int v, ArrayList arrayList1, SheetState sheetState0, Function0 function00, int v1, ArrayList arrayList2, ArrayList arrayList3, int v2) {
        this.w = arrayList0;
        this.x = v;
        this.y = arrayList1;
        this.z = sheetState0;
        this.A = function00;
        this.B = v1;
        this.C = arrayList2;
        this.D = arrayList3;
        this.E = v2;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v12;
        Integer integer3;
        Integer integer1;
        ArrayList arrayList0 = this.w;
        Integer integer0 = null;
        if(arrayList0.isEmpty()) {
            integer1 = null;
        }
        else {
            integer1 = ((Placeable)arrayList0.get(0)).getWidth();
            int v1 = CollectionsKt__CollectionsKt.getLastIndex(arrayList0);
            if(1 <= v1) {
                for(int v2 = 1; true; ++v2) {
                    Integer integer2 = ((Placeable)arrayList0.get(v2)).getWidth();
                    if(integer2.compareTo(integer1) > 0) {
                        integer1 = integer2;
                    }
                    if(v2 == v1) {
                        break;
                    }
                }
            }
        }
        int v3 = this.x;
        int v4 = Integer.max(0, (v3 - (integer1 == null ? 0 : ((int)integer1))) / 2);
        ArrayList arrayList1 = this.y;
        if(arrayList1.isEmpty()) {
            integer3 = null;
        }
        else {
            integer3 = ((Placeable)arrayList1.get(0)).getWidth();
            int v5 = CollectionsKt__CollectionsKt.getLastIndex(arrayList1);
            if(1 <= v5) {
                for(int v6 = 1; true; ++v6) {
                    Integer integer4 = ((Placeable)arrayList1.get(v6)).getWidth();
                    if(integer4.compareTo(integer3) > 0) {
                        integer3 = integer4;
                    }
                    if(v6 == v5) {
                        break;
                    }
                }
            }
        }
        int v7 = integer3 == null ? 0 : ((int)integer3);
        if(!arrayList1.isEmpty()) {
            integer0 = ((Placeable)arrayList1.get(0)).getHeight();
            int v8 = CollectionsKt__CollectionsKt.getLastIndex(arrayList1);
            if(1 <= v8) {
                for(int v9 = 1; true; ++v9) {
                    Integer integer5 = ((Placeable)arrayList1.get(v9)).getHeight();
                    if(integer5.compareTo(integer0) > 0) {
                        integer0 = integer5;
                    }
                    if(v9 == v8) {
                        break;
                    }
                }
            }
        }
        int v10 = integer0 == null ? 0 : ((int)integer0);
        int v11 = BottomSheetScaffoldKt.BottomSheetScaffoldLayout.2.1.1.WhenMappings.$EnumSwitchMapping$0[this.z.getCurrentValue().ordinal()];
        switch(v11) {
            case 1: {
                v12 = c.roundToInt(((Number)this.A.invoke()).floatValue());
                break;
            }
            case 2: {
                v12 = this.B;
                break;
            }
            default: {
                if(v11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                v12 = this.B;
            }
        }
        ArrayList arrayList2 = this.C;
        int v13 = arrayList2.size();
        for(int v14 = 0; v14 < v13; ++v14) {
            PlacementScope.placeRelative$default(((PlacementScope)object0), ((Placeable)arrayList2.get(v14)), 0, this.E, 0.0f, 4, null);
        }
        ArrayList arrayList3 = this.D;
        int v15 = arrayList3.size();
        for(int v16 = 0; v16 < v15; ++v16) {
            PlacementScope.placeRelative$default(((PlacementScope)object0), ((Placeable)arrayList3.get(v16)), 0, 0, 0.0f, 4, null);
        }
        int v17 = arrayList0.size();
        for(int v18 = 0; v18 < v17; ++v18) {
            PlacementScope.placeRelative$default(((PlacementScope)object0), ((Placeable)arrayList0.get(v18)), v4, 0, 0.0f, 4, null);
        }
        int v19 = arrayList1.size();
        for(int v = 0; v < v19; ++v) {
            PlacementScope.placeRelative$default(((PlacementScope)object0), ((Placeable)arrayList1.get(v)), (v3 - v7) / 2, v12 - v10, 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }
}

