package androidx.compose.material3;

import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import r0.a;

public final class kp implements MeasurePolicy {
    public final float a;

    public kp(float f) {
        this.a = f;
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        Object object3;
        Object object1;
        float f = measureScope0.toPx-0680j_4(this.a);
        long v2 = Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 10, null);
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v3 = list0.size();
        for(int v4 = 0; true; ++v4) {
            ac ac0 = ac.b;
            ac ac1 = ac.a;
            if(v4 >= v3) {
                break;
            }
            Object object0 = list0.get(v4);
            if(LayoutIdKt.getLayoutId(((Measurable)object0)) != ac1 && LayoutIdKt.getLayoutId(((Measurable)object0)) != ac0) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(arrayList0.size());
        int v5 = arrayList0.size();
        for(int v6 = 0; v6 < v5; v6 = a.f(((Measurable)arrayList0.get(v6)), v2, arrayList1, v6, 1)) {
        }
        int v7 = list0.size();
        for(int v8 = 0; true; ++v8) {
            object1 = null;
            if(v8 >= v7) {
                break;
            }
            Object object2 = list0.get(v8);
            if(LayoutIdKt.getLayoutId(((Measurable)object2)) == ac1) {
                object1 = object2;
                break;
            }
        }
        int v9 = list0.size();
        for(int v1 = 0; true; ++v1) {
            object3 = null;
            if(v1 >= v9) {
                break;
            }
            Object object4 = list0.get(v1);
            if(LayoutIdKt.getLayoutId(((Measurable)object4)) == ac0) {
                object3 = object4;
                break;
            }
        }
        float f1 = 6.283185f / ((float)arrayList1.size());
        Placeable placeable0 = ((Measurable)object1) == null ? null : ((Measurable)object1).measure-BRTryo0(v2);
        return ((Measurable)object3) == null ? MeasureScope.layout$default(measureScope0, Constraints.getMinWidth-impl(v), Constraints.getMinHeight-impl(v), null, new jp(placeable0, arrayList1, null, v, f, f1), 4, null) : MeasureScope.layout$default(measureScope0, Constraints.getMinWidth-impl(v), Constraints.getMinHeight-impl(v), null, new jp(placeable0, arrayList1, ((Measurable)object3).measure-BRTryo0(v2), v, f, f1), 4, null);
    }
}

