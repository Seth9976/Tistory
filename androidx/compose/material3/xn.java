package androidx.compose.material3;

import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class xn extends Lambda implements Function1 {
    public final si A;
    public final int B;
    public final ArrayList C;
    public final long D;
    public final int E;
    public final int F;
    public final Function3 G;
    public final int w;
    public final ArrayList x;
    public final SubcomposeMeasureScope y;
    public final Function2 z;

    public xn(int v, ArrayList arrayList0, SubcomposeMeasureScope subcomposeMeasureScope0, Function2 function20, si si0, int v1, ArrayList arrayList1, long v2, int v3, int v4, Function3 function30) {
        this.w = v;
        this.x = arrayList0;
        this.y = subcomposeMeasureScope0;
        this.z = function20;
        this.A = si0;
        this.B = v1;
        this.C = arrayList1;
        this.D = v2;
        this.E = v3;
        this.F = v4;
        this.G = function30;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v6;
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
            arrayList0.add(new TabPosition(subcomposeMeasureScope0.toDp-u2uoSUM(v2), subcomposeMeasureScope0.toDp-u2uoSUM(((Placeable)object1).getWidth()), ((Dp)this.C.get(v3)).unbox-impl(), null));
            v2 += ((Placeable)object1).getWidth();
        }
        List list0 = subcomposeMeasureScope0.subcompose(lo.b, this.z);
        int v4 = list0.size();
        for(int v5 = 0; true; ++v5) {
            v6 = this.F;
            if(v5 >= v4) {
                break;
            }
            Placeable placeable0 = ((Measurable)list0.get(v5)).measure-BRTryo0(Constraints.copy-Zbe2FdA$default(this.D, this.E, this.E, 0, 0, 8, null));
            PlacementScope.placeRelative$default(((PlacementScope)object0), placeable0, 0, v6 - placeable0.getHeight(), 0.0f, 4, null);
        }
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0x675C0184, true, new wn(this.G, arrayList0));
        List list1 = subcomposeMeasureScope0.subcompose(lo.c, composableLambda0);
        int v7 = list1.size();
        for(int v8 = 0; v8 < v7; ++v8) {
            PlacementScope.placeRelative$default(((PlacementScope)object0), ((Measurable)list1.get(v8)).measure-BRTryo0(Constraints.Companion.fixed-JhjzzOo(this.E, v6)), 0, 0, 0.0f, 4, null);
        }
        this.A.a(subcomposeMeasureScope0, v1, arrayList0, this.B);
        return Unit.INSTANCE;
    }
}

