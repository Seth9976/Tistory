package androidx.compose.material3;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.IntRef;
import pd.d;
import r0.a;

public final class jo extends Lambda implements Function2 {
    public final Function2 w;
    public final Function2 x;
    public final Function3 y;

    public jo(Function2 function20, Function2 function21, Function3 function30) {
        this.w = function20;
        this.x = function21;
        this.y = function30;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        long v = ((Constraints)object1).unbox-impl();
        int v1 = Constraints.getMaxWidth-impl(v);
        List list0 = ((SubcomposeMeasureScope)object0).subcompose(lo.a, this.w);
        int v2 = list0.size();
        IntRef ref$IntRef0 = new IntRef();
        if(v2 > 0) {
            ref$IntRef0.element = v1 / v2;
        }
        Integer integer0 = 0;
        int v4 = list0.size();
        for(int v5 = 0; v5 < v4; ++v5) {
            integer0 = Math.max(((Measurable)list0.get(v5)).maxIntrinsicHeight(ref$IntRef0.element), integer0.intValue());
        }
        int v6 = integer0.intValue();
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v7 = list0.size();
        for(int v8 = 0; v8 < v7; v8 = a.f(((Measurable)list0.get(v8)), Constraints.copy-Zbe2FdA(v, ref$IntRef0.element, ref$IntRef0.element, v6, v6), arrayList0, v8, 1)) {
        }
        ArrayList arrayList1 = new ArrayList(v2);
        for(int v3 = 0; v3 < v2; ++v3) {
            float f = ((Dp)d.maxOf(Dp.box-impl(Dp.constructor-impl(((SubcomposeMeasureScope)object0).toDp-u2uoSUM(Math.min(((Measurable)list0.get(v3)).maxIntrinsicWidth(v6), ref$IntRef0.element)) - TabKt.getHorizontalTextPadding() * 2.0f)), Dp.box-impl(24.0f))).unbox-impl();
            arrayList1.add(new TabPosition(Dp.constructor-impl(((SubcomposeMeasureScope)object0).toDp-u2uoSUM(ref$IntRef0.element) * ((float)v3)), ((SubcomposeMeasureScope)object0).toDp-u2uoSUM(ref$IntRef0.element), f, null));
        }
        return MeasureScope.layout$default(((SubcomposeMeasureScope)object0), v1, v6, null, new io(arrayList0, ((SubcomposeMeasureScope)object0), this.x, ref$IntRef0, v, v6, this.y, arrayList1, v1), 4, null);
    }
}

