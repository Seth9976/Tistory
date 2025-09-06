package p0;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import r0.a;

public final class x4 implements MeasurePolicy {
    public final List a;

    public x4(List list0) {
        this.a = list0;
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        long v1 = Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0x7FFFFFFF, 3, null);
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v2 = list0.size();
        for(int v3 = 0; v3 < v2; v3 = a.f(((Measurable)list0.get(v3)), v1, arrayList0, v3, 1)) {
        }
        int v4 = arrayList0.size();
        Integer integer0 = 0;
        for(int v5 = 0; v5 < v4; ++v5) {
            integer0 = Math.max(integer0.intValue(), ((Placeable)arrayList0.get(v5)).getWidth());
        }
        int v6 = integer0.intValue();
        int v7 = arrayList0.size();
        Integer[] arr_integer = new Integer[v7];
        for(int v8 = 0; v8 < v7; ++v8) {
            arr_integer[v8] = 0;
        }
        int v9 = arrayList0.size();
        int v11 = 0;
        for(int v10 = 0; v10 < v9; ++v10) {
            Placeable placeable0 = (Placeable)arrayList0.get(v10);
            int v12 = v10 <= 0 ? 0 : ((Placeable)arrayList0.get(v10 - 1)).getHeight() - ((Placeable)arrayList0.get(v10 - 1)).get(AlignmentLineKt.getLastBaseline());
            int v13 = Math.max(0, measureScope0.roundToPx-0680j_4(((Dp)this.a.get(v10)).unbox-impl()) - placeable0.get(AlignmentLineKt.getFirstBaseline()) - v12);
            arr_integer[v10] = (int)(v13 + v11);
            v11 += placeable0.getHeight() + v13;
        }
        return MeasureScope.layout$default(measureScope0, v6, v11, null, new w4(arrayList0, arr_integer), 4, null);
    }
}

