package p0;

import androidx.compose.material.TabPosition;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.ranges.c;
import kotlinx.coroutines.BuildersKt;

public final class ta extends Lambda implements Function1 {
    public final h7 A;
    public final int B;
    public final long C;
    public final IntRef D;
    public final IntRef E;
    public final Function3 F;
    public final int w;
    public final ArrayList x;
    public final SubcomposeMeasureScope y;
    public final Function2 z;

    public ta(int v, ArrayList arrayList0, SubcomposeMeasureScope subcomposeMeasureScope0, Function2 function20, h7 h70, int v1, long v2, IntRef ref$IntRef0, IntRef ref$IntRef1, Function3 function30) {
        this.w = v;
        this.x = arrayList0;
        this.y = subcomposeMeasureScope0;
        this.z = function20;
        this.A = h70;
        this.B = v1;
        this.C = v2;
        this.D = ref$IntRef0;
        this.E = ref$IntRef1;
        this.F = function30;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        IntRef ref$IntRef1;
        IntRef ref$IntRef0;
        SubcomposeMeasureScope subcomposeMeasureScope0;
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = this.x;
        int v = arrayList1.size();
        int v1 = this.w;
        int v2 = v1;
        for(int v3 = 0; true; ++v3) {
            subcomposeMeasureScope0 = this.y;
            if(v3 >= v) {
                break;
            }
            Object object1 = arrayList1.get(v3);
            PlacementScope.placeRelative$default(((PlacementScope)object0), ((Placeable)object1), v2, 0, 0.0f, 4, null);
            arrayList0.add(new TabPosition(subcomposeMeasureScope0.toDp-u2uoSUM(v2), subcomposeMeasureScope0.toDp-u2uoSUM(((Placeable)object1).getWidth()), null));
            v2 += ((Placeable)object1).getWidth();
        }
        List list0 = subcomposeMeasureScope0.subcompose(ab.b, this.z);
        int v4 = list0.size();
        for(int v5 = 0; true; ++v5) {
            ref$IntRef0 = this.E;
            ref$IntRef1 = this.D;
            if(v5 >= v4) {
                break;
            }
            Placeable placeable0 = ((Measurable)list0.get(v5)).measure-BRTryo0(Constraints.copy-Zbe2FdA$default(this.C, ref$IntRef1.element, ref$IntRef1.element, 0, 0, 8, null));
            PlacementScope.placeRelative$default(((PlacementScope)object0), placeable0, 0, ref$IntRef0.element - placeable0.getHeight(), 0.0f, 4, null);
        }
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0xE7736159, true, new sa(this.F, arrayList0));
        List list1 = subcomposeMeasureScope0.subcompose(ab.c, composableLambda0);
        int v6 = list1.size();
        for(int v7 = 0; v7 < v6; ++v7) {
            PlacementScope.placeRelative$default(((PlacementScope)object0), ((Measurable)list1.get(v7)).measure-BRTryo0(Constraints.Companion.fixed-JhjzzOo(ref$IntRef1.element, ref$IntRef0.element)), 0, 0, 0.0f, 4, null);
        }
        h7 h70 = this.A;
        int v8 = this.B;
        if(h70.c == null || ((int)h70.c) != v8) {
            h70.c = v8;
            TabPosition tabPosition0 = (TabPosition)CollectionsKt___CollectionsKt.getOrNull(arrayList0, v8);
            if(tabPosition0 != null) {
                int v9 = subcomposeMeasureScope0.roundToPx-0680j_4(((TabPosition)CollectionsKt___CollectionsKt.last(arrayList0)).getRight-D9Ej5fM()) + v1;
                int v10 = v9 - h70.a.getMaxValue();
                int v11 = c.coerceIn(subcomposeMeasureScope0.roundToPx-0680j_4(tabPosition0.getLeft-D9Ej5fM()) - (v10 / 2 - subcomposeMeasureScope0.roundToPx-0680j_4(tabPosition0.getWidth-D9Ej5fM()) / 2), 0, c.coerceAtLeast(v9 - v10, 0));
                if(h70.a.getValue() != v11) {
                    g7 g70 = new g7(h70, v11, null);
                    BuildersKt.launch$default(h70.b, null, null, g70, 3, null);
                }
            }
        }
        return Unit.INSTANCE;
    }
}

