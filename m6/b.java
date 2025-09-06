package m6;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import com.google.accompanist.flowlayout.FlowCrossAxisAlignment;
import com.google.accompanist.flowlayout.FlowKt;
import com.google.accompanist.flowlayout.LayoutOrientation;
import com.google.accompanist.flowlayout.MainAxisAlignment;
import com.google.accompanist.flowlayout.OrientationIndependentConstraints;
import com.google.accompanist.flowlayout.SizeMode;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.IntRef;

public final class b implements MeasurePolicy {
    public final LayoutOrientation a;
    public final float b;
    public final SizeMode c;
    public final float d;
    public final MainAxisAlignment e;
    public final MainAxisAlignment f;
    public final FlowCrossAxisAlignment g;

    public b(LayoutOrientation layoutOrientation0, float f, SizeMode sizeMode0, float f1, MainAxisAlignment mainAxisAlignment0, MainAxisAlignment mainAxisAlignment1, FlowCrossAxisAlignment flowCrossAxisAlignment0) {
        this.a = layoutOrientation0;
        this.b = f;
        this.c = sizeMode0;
        this.d = f1;
        this.e = mainAxisAlignment0;
        this.f = mainAxisAlignment1;
        this.g = flowCrossAxisAlignment0;
    }

    public static final void a(ArrayList arrayList0, IntRef ref$IntRef0, MeasureScope measureScope0, float f, ArrayList arrayList1, ArrayList arrayList2, IntRef ref$IntRef1, ArrayList arrayList3, IntRef ref$IntRef2, IntRef ref$IntRef3) {
        if(!arrayList0.isEmpty()) {
            int v = ref$IntRef0.element;
            ref$IntRef0.element = measureScope0.roundToPx-0680j_4(f) + v;
        }
        arrayList0.add(CollectionsKt___CollectionsKt.toList(arrayList1));
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
        Placeable placeable1;
        Intrinsics.checkNotNullParameter(measureScope0, "$this$Layout");
        Intrinsics.checkNotNullParameter(list0, "measurables");
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        IntRef ref$IntRef0 = new IntRef();
        IntRef ref$IntRef1 = new IntRef();
        ArrayList arrayList3 = new ArrayList();
        IntRef ref$IntRef2 = new IntRef();
        IntRef ref$IntRef3 = new IntRef();
        LayoutOrientation layoutOrientation0 = this.a;
        OrientationIndependentConstraints orientationIndependentConstraints0 = new OrientationIndependentConstraints(v, layoutOrientation0, null);
        long v1 = layoutOrientation0 == LayoutOrientation.Horizontal ? ConstraintsKt.Constraints$default(0, orientationIndependentConstraints0.getMainAxisMax(), 0, 0, 13, null) : ConstraintsKt.Constraints$default(0, 0, 0, orientationIndependentConstraints0.getMainAxisMax(), 7, null);
        for(Object object0: list0) {
            Placeable placeable0 = ((Measurable)object0).measure-BRTryo0(v1);
            float f = this.b;
            if(arrayList3.isEmpty()) {
                placeable1 = placeable0;
            }
            else {
                int v2 = ref$IntRef2.element;
                if(FlowKt.access$Flow_F4y8cZ0$mainAxisSize(placeable0, layoutOrientation0) + (measureScope0.roundToPx-0680j_4(f) + v2) <= orientationIndependentConstraints0.getMainAxisMax()) {
                    placeable1 = placeable0;
                }
                else {
                    placeable1 = placeable0;
                    b.a(arrayList0, ref$IntRef1, measureScope0, this.d, arrayList3, arrayList1, ref$IntRef3, arrayList2, ref$IntRef0, ref$IntRef2);
                }
            }
            if(!arrayList3.isEmpty()) {
                int v3 = ref$IntRef2.element;
                ref$IntRef2.element = measureScope0.roundToPx-0680j_4(f) + v3;
            }
            arrayList3.add(placeable1);
            ref$IntRef2.element = FlowKt.access$Flow_F4y8cZ0$mainAxisSize(placeable1, layoutOrientation0) + ref$IntRef2.element;
            ref$IntRef3.element = Math.max(ref$IntRef3.element, FlowKt.access$Flow_F4y8cZ0$crossAxisSize(placeable1, layoutOrientation0));
        }
        if(!arrayList3.isEmpty()) {
            b.a(arrayList0, ref$IntRef1, measureScope0, this.d, arrayList3, arrayList1, ref$IntRef3, arrayList2, ref$IntRef0, ref$IntRef2);
        }
        int v4 = orientationIndependentConstraints0.getMainAxisMax() == 0x7FFFFFFF || this.c != SizeMode.Expand ? Math.max(ref$IntRef0.element, orientationIndependentConstraints0.getMainAxisMin()) : orientationIndependentConstraints0.getMainAxisMax();
        int v5 = Math.max(ref$IntRef1.element, orientationIndependentConstraints0.getCrossAxisMin());
        int v6 = this.a == LayoutOrientation.Horizontal ? v4 : v5;
        return this.a == LayoutOrientation.Horizontal ? MeasureScope.layout$default(measureScope0, v6, v5, null, new a(arrayList0, measureScope0, this.b, this.e, this.f, this.a, v4, this.g, arrayList1, arrayList2), 4, null) : MeasureScope.layout$default(measureScope0, v6, v4, null, new a(arrayList0, measureScope0, this.b, this.e, this.f, this.a, v4, this.g, arrayList1, arrayList2), 4, null);
    }
}

