package androidx.compose.material3;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import r0.a;

public final class u1 implements MultiContentMeasurePolicy {
    public final SheetState a;
    public final Function0 b;

    public u1(SheetState sheetState0, Function0 function00) {
        this.a = sheetState0;
        this.b = function00;
    }

    @Override  // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        Integer integer0;
        List list1 = (List)list0.get(0);
        List list2 = (List)list0.get(1);
        List list3 = (List)list0.get(2);
        List list4 = (List)list0.get(3);
        int v3 = Constraints.getMaxWidth-impl(v);
        int v4 = Constraints.getMaxHeight-impl(v);
        long v5 = Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 10, null);
        ArrayList arrayList0 = new ArrayList(list3.size());
        int v6 = list3.size();
        for(int v7 = 0; v7 < v6; v7 = a.f(((Measurable)list3.get(v7)), v5, arrayList0, v7, 1)) {
        }
        ArrayList arrayList1 = new ArrayList(list1.size());
        int v8 = list1.size();
        for(int v9 = 0; v9 < v8; v9 = a.f(((Measurable)list1.get(v9)), v5, arrayList1, v9, 1)) {
        }
        if(arrayList1.isEmpty()) {
            integer0 = null;
        }
        else {
            integer0 = ((Placeable)arrayList1.get(0)).getHeight();
            int v10 = CollectionsKt__CollectionsKt.getLastIndex(arrayList1);
            if(1 <= v10) {
                for(int v2 = 1; true; ++v2) {
                    Integer integer1 = ((Placeable)arrayList1.get(v2)).getHeight();
                    if(integer1.compareTo(integer0) > 0) {
                        integer0 = integer1;
                    }
                    if(v2 == v10) {
                        break;
                    }
                }
            }
        }
        int v11 = integer0 == null ? 0 : ((int)integer0);
        long v12 = Constraints.copy-Zbe2FdA$default(v5, 0, 0, 0, v4 - v11, 7, null);
        ArrayList arrayList2 = new ArrayList(list2.size());
        int v13 = list2.size();
        for(int v14 = 0; v14 < v13; v14 = a.f(((Measurable)list2.get(v14)), v12, arrayList2, v14, 1)) {
        }
        ArrayList arrayList3 = new ArrayList(list4.size());
        int v15 = list4.size();
        for(int v1 = 0; v1 < v15; v1 = a.f(((Measurable)list4.get(v1)), v5, arrayList3, v1, 1)) {
        }
        return MeasureScope.layout$default(measureScope0, v3, v4, null, new t1(arrayList0, v3, arrayList3, this.a, this.b, v4, arrayList2, arrayList1, v11), 4, null);
    }
}

