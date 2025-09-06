package androidx.compose.material3;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Ref.FloatRef;
import pd.d;
import r0.a;

public final class un implements MultiContentMeasurePolicy {
    public final float a;
    public final TabRowKt.ScrollableTabRowImpl.1.scope.1.1 b;
    public final int c;
    public final si d;

    public un(float f, TabRowKt.ScrollableTabRowImpl.1.scope.1.1 tabRowKt$ScrollableTabRowImpl$1$scope$1$10, int v, si si0) {
        this.a = f;
        this.b = tabRowKt$ScrollableTabRowImpl$1$scope$1$10;
        this.c = v;
        this.d = si0;
    }

    @Override  // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        List list1 = (List)list0.get(0);
        List list2 = (List)list0.get(1);
        List list3 = (List)list0.get(2);
        float f = this.a;
        int v1 = measureScope0.roundToPx-0680j_4(f);
        int v2 = list1.size();
        int v3 = measureScope0.roundToPx-0680j_4(90.0f);
        Integer integer0 = 0;
        int v4 = list1.size();
        for(int v5 = 0; v5 < v4; ++v5) {
            integer0 = Math.max(integer0.intValue(), ((Measurable)list1.get(v5)).maxIntrinsicHeight(0x7FFFFFFF));
        }
        int v6 = integer0.intValue();
        long v7 = Constraints.copy-Zbe2FdA$default(v, v3, 0, v6, v6, 2, null);
        FloatRef ref$FloatRef0 = new FloatRef();
        ref$FloatRef0.element = f;
        ArrayList arrayList0 = new ArrayList(list1.size());
        int v8 = list1.size();
        for(int v9 = 0; v9 < v8; v9 = a.f(((Measurable)list1.get(v9)), v7, arrayList0, v9, 1)) {
        }
        ArrayList arrayList1 = new ArrayList(v2);
        int v11 = v1 * 2;
        for(int v10 = 0; v10 < v2; ++v10) {
            float f1 = ((Dp)d.maxOf(Dp.box-impl(90.0f), Dp.box-impl(measureScope0.toDp-u2uoSUM(((Placeable)arrayList0.get(v10)).getWidth())))).unbox-impl();
            v11 = measureScope0.roundToPx-0680j_4(f1) + v11;
            float f2 = ((Dp)d.maxOf(Dp.box-impl(f1 - 0.0f), Dp.box-impl(24.0f))).unbox-impl();
            TabPosition tabPosition0 = new TabPosition(ref$FloatRef0.element, f1, f2, null);
            ref$FloatRef0.element += f1;
            arrayList1.add(tabPosition0);
        }
        this.b.setTabPositions(arrayList1);
        ArrayList arrayList2 = new ArrayList(list2.size());
        int v12 = list2.size();
        for(int v13 = 0; v13 < v12; v13 = a.f(((Measurable)list2.get(v13)), Constraints.copy-Zbe2FdA$default(v, v11, v11, 0, 0, 8, null), arrayList2, v13, 1)) {
        }
        ArrayList arrayList3 = new ArrayList(list3.size());
        int v14 = list3.size();
        for(int v15 = 0; v15 < v14; v15 = a.f(((Measurable)list3.get(v15)), Constraints.copy-Zbe2FdA(v, 0, measureScope0.roundToPx-0680j_4(((TabPosition)arrayList1.get(this.c)).getWidth-D9Ej5fM()), 0, v6), arrayList3, v15, 1)) {
        }
        return MeasureScope.layout$default(measureScope0, v11, v6, null, new tn(ref$FloatRef0, this.a, arrayList0, arrayList2, arrayList3, this.d, measureScope0, v1, arrayList1, this.c, v6), 4, null);
    }
}

