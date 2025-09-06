package androidx.compose.material3;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Ref.IntRef;
import pd.d;
import r0.a;

public final class eo implements MultiContentMeasurePolicy {
    public final TabRowKt.TabRowImpl.1.scope.1.1 a;

    public eo(TabRowKt.TabRowImpl.1.scope.1.1 tabRowKt$TabRowImpl$1$scope$1$10) {
        this.a = tabRowKt$TabRowImpl$1$scope$1$10;
    }

    @Override  // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        List list1 = (List)list0.get(0);
        List list2 = (List)list0.get(1);
        List list3 = (List)list0.get(2);
        int v1 = Constraints.getMaxWidth-impl(v);
        int v2 = list1.size();
        IntRef ref$IntRef0 = new IntRef();
        if(v2 > 0) {
            ref$IntRef0.element = v1 / v2;
        }
        Integer integer0 = 0;
        int v3 = list1.size();
        for(int v4 = 0; v4 < v3; ++v4) {
            integer0 = Math.max(((Measurable)list1.get(v4)).maxIntrinsicHeight(ref$IntRef0.element), integer0.intValue());
        }
        int v5 = integer0.intValue();
        ArrayList arrayList0 = new ArrayList(v2);
        for(int v6 = 0; v6 < v2; ++v6) {
            float f = ((Dp)d.maxOf(Dp.box-impl(Dp.constructor-impl(measureScope0.toDp-u2uoSUM(Math.min(((Measurable)list1.get(v6)).maxIntrinsicWidth(v5), ref$IntRef0.element)) - TabKt.getHorizontalTextPadding() * 2.0f)), Dp.box-impl(24.0f))).unbox-impl();
            arrayList0.add(new TabPosition(Dp.constructor-impl(measureScope0.toDp-u2uoSUM(ref$IntRef0.element) * ((float)v6)), measureScope0.toDp-u2uoSUM(ref$IntRef0.element), f, null));
        }
        this.a.setTabPositions(arrayList0);
        ArrayList arrayList1 = new ArrayList(list1.size());
        int v7 = list1.size();
        for(int v8 = 0; v8 < v7; v8 = a.f(((Measurable)list1.get(v8)), Constraints.copy-Zbe2FdA(v, ref$IntRef0.element, ref$IntRef0.element, v5, v5), arrayList1, v8, 1)) {
        }
        ArrayList arrayList2 = new ArrayList(list2.size());
        int v9 = list2.size();
        for(int v10 = 0; v10 < v9; v10 = a.f(((Measurable)list2.get(v10)), Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 11, null), arrayList2, v10, 1)) {
        }
        ArrayList arrayList3 = new ArrayList(list3.size());
        int v11 = list3.size();
        for(int v12 = 0; v12 < v11; v12 = a.f(((Measurable)list3.get(v12)), Constraints.copy-Zbe2FdA(v, ref$IntRef0.element, ref$IntRef0.element, 0, v5), arrayList3, v12, 1)) {
        }
        return MeasureScope.layout$default(measureScope0, v1, v5, null, new co(arrayList1, arrayList2, arrayList3, ref$IntRef0, v5), 4, null);
    }
}

