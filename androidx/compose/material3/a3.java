package androidx.compose.material3;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.ranges.c;
import r0.a;

public final class a3 implements MeasurePolicy {
    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        int v14;
        ArrayList arrayList0;
        int v1 = Constraints.getMaxWidth-impl(v);
        int v2 = Constraints.getMinHeight-impl(v);
        int v3 = list0.size();
        if(v3 < 1) {
            return MeasureScope.layout$default(measureScope0, v1, v2, null, y2.w, 4, null);
        }
        IntRef ref$IntRef0 = new IntRef();
        if(!Constraints.getHasBoundedWidth-impl(v)) {
            arrayList0 = new ArrayList(list0.size());
            int v5 = list0.size();
            for(int v4 = 0; v4 < v5; ++v4) {
                arrayList0.add(((Measurable)list0.get(v4)).measure-BRTryo0(ConstraintsKt.constrain-N9IONVI(v, Constraints.Companion.fixedHeight-OenEA2s(v2))));
            }
            return MeasureScope.layout$default(measureScope0, v1, v2, null, new z2(ref$IntRef0, arrayList0), 4, null);
        }
        int v6 = ExpressiveNavigationBarKt.access$calculateCenteredContentHorizontalPadding(v3, v1);
        ref$IntRef0.element = v6;
        int v7 = (v1 - v6 * 2) / v3;
        int v8 = list0.size();
        for(int v9 = 0; v9 < v8; ++v9) {
            int v10 = ((Measurable)list0.get(v9)).maxIntrinsicHeight(v7);
            if(v2 < v10) {
                v2 = c.coerceAtMost(v10, Constraints.getMaxHeight-impl(v));
            }
        }
        arrayList0 = new ArrayList(list0.size());
        int v11 = list0.size();
        for(int v12 = 0; v12 < v11; v12 = a.f(((Measurable)object0), ConstraintsKt.constrain-N9IONVI(v, Constraints.Companion.fixed-JhjzzOo(v14, v2)), arrayList0, v12, 1)) {
            Object object0 = list0.get(v12);
            int v13 = ((Measurable)object0).maxIntrinsicWidth(Constraints.getMinHeight-impl(v));
            if(v7 < v13) {
                v14 = c.coerceAtMost(v13, v1 / v3);
                ref$IntRef0.element -= (v14 - v7) / 2;
            }
            else {
                v14 = v7;
            }
        }
        return MeasureScope.layout$default(measureScope0, v1, v2, null, new z2(ref$IntRef0, arrayList0), 4, null);
    }
}

