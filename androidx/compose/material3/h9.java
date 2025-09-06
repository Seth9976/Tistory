package androidx.compose.material3;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.ranges.c;
import r0.a;

public final class h9 implements MeasurePolicy {
    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        int v2 = Constraints.getMaxWidth-impl(v);
        int v3 = Constraints.getMinHeight-impl(v);
        int v4 = list0.size();
        if(v4 < 1) {
            return MeasureScope.layout$default(measureScope0, v2, v3, null, f9.w, 4, null);
        }
        if(!Constraints.getHasBoundedWidth-impl(v)) {
            ArrayList arrayList0 = new ArrayList(list0.size());
            int v5 = list0.size();
            for(int v1 = 0; v1 < v5; ++v1) {
                arrayList0.add(((Measurable)list0.get(v1)).measure-BRTryo0(ConstraintsKt.constrain-N9IONVI(v, Constraints.Companion.fixedHeight-OenEA2s(v3))));
            }
            return MeasureScope.layout$default(measureScope0, v2, v3, null, new g9(arrayList0), 4, null);
        }
        int v6 = v2 / v4;
        int v7 = list0.size();
        for(int v8 = 0; v8 < v7; ++v8) {
            int v9 = ((Measurable)list0.get(v8)).maxIntrinsicHeight(v6);
            if(v3 < v9) {
                v3 = c.coerceAtMost(v9, Constraints.getMaxHeight-impl(v));
            }
        }
        ArrayList arrayList1 = new ArrayList(list0.size());
        int v10 = list0.size();
        for(int v11 = 0; v11 < v10; v11 = a.f(((Measurable)list0.get(v11)), ConstraintsKt.constrain-N9IONVI(v, Constraints.Companion.fixed-JhjzzOo(v6, v3)), arrayList1, v11, 1)) {
        }
        return MeasureScope.layout$default(measureScope0, v2, v3, null, new g9(arrayList1), 4, null);
    }
}

