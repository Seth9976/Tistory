package androidx.compose.material3;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Ref.IntRef;

public final class h implements MeasurePolicy {
    public final float a;
    public final float b;

    public h(float f, float f1) {
        this.a = f;
        this.b = f1;
    }

    public static final void a(ArrayList arrayList0, IntRef ref$IntRef0, MeasureScope measureScope0, float f, ArrayList arrayList1, ArrayList arrayList2, IntRef ref$IntRef1, ArrayList arrayList3, IntRef ref$IntRef2, IntRef ref$IntRef3) {
        if(!arrayList0.isEmpty()) {
            int v = ref$IntRef0.element;
            ref$IntRef0.element = measureScope0.roundToPx-0680j_4(f) + v;
        }
        arrayList0.add(0, CollectionsKt___CollectionsKt.toList(arrayList1));
        arrayList2.add(ref$IntRef1.element);
        arrayList3.add(ref$IntRef0.element);
        ref$IntRef0.element += ref$IntRef1.element;
        ref$IntRef2.element = Math.max(ref$IntRef2.element, ref$IntRef3.element);
        arrayList1.clear();
        ref$IntRef3.element = 0;
        ref$IntRef1.element = 0;
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        int v4;
        Placeable placeable1;
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        IntRef ref$IntRef0 = new IntRef();
        IntRef ref$IntRef1 = new IntRef();
        ArrayList arrayList3 = new ArrayList();
        IntRef ref$IntRef2 = new IntRef();
        IntRef ref$IntRef3 = new IntRef();
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; v2 = v4 + 1) {
            Placeable placeable0 = ((Measurable)list0.get(v2)).measure-BRTryo0(v);
            float f = this.a;
            if(arrayList3.isEmpty()) {
                v4 = v2;
                placeable1 = placeable0;
            }
            else {
                int v3 = ref$IntRef2.element;
                if(placeable0.getWidth() + (measureScope0.roundToPx-0680j_4(f) + v3) > Constraints.getMaxWidth-impl(v)) {
                    placeable1 = placeable0;
                    v4 = v2;
                    h.a(arrayList0, ref$IntRef1, measureScope0, this.b, arrayList3, arrayList1, ref$IntRef3, arrayList2, ref$IntRef0, ref$IntRef2);
                }
            }
            if(!arrayList3.isEmpty()) {
                int v5 = ref$IntRef2.element;
                ref$IntRef2.element = measureScope0.roundToPx-0680j_4(f) + v5;
            }
            arrayList3.add(placeable1);
            ref$IntRef2.element = placeable1.getWidth() + ref$IntRef2.element;
            ref$IntRef3.element = Math.max(ref$IntRef3.element, placeable1.getHeight());
        }
        if(!arrayList3.isEmpty()) {
            h.a(arrayList0, ref$IntRef1, measureScope0, this.b, arrayList3, arrayList1, ref$IntRef3, arrayList2, ref$IntRef0, ref$IntRef2);
        }
        int v6 = Math.max(ref$IntRef0.element, Constraints.getMinWidth-impl(v));
        return MeasureScope.layout$default(measureScope0, v6, Math.max(ref$IntRef1.element, Constraints.getMinHeight-impl(v)), null, new g(arrayList0, measureScope0, this.a, v6, arrayList2), 4, null);
    }
}

