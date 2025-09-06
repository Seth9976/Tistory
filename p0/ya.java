package p0;

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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class ya extends Lambda implements Function1 {
    public final long A;
    public final int B;
    public final Function3 C;
    public final ArrayList D;
    public final int E;
    public final ArrayList w;
    public final SubcomposeMeasureScope x;
    public final Function2 y;
    public final int z;

    public ya(ArrayList arrayList0, SubcomposeMeasureScope subcomposeMeasureScope0, Function2 function20, int v, long v1, int v2, Function3 function30, ArrayList arrayList1, int v3) {
        this.w = arrayList0;
        this.x = subcomposeMeasureScope0;
        this.y = function20;
        this.z = v;
        this.A = v1;
        this.B = v2;
        this.C = function30;
        this.D = arrayList1;
        this.E = v3;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v5;
        ArrayList arrayList0 = this.w;
        int v = arrayList0.size();
        for(int v2 = 0; v2 < v; ++v2) {
            PlacementScope.placeRelative$default(((PlacementScope)object0), ((Placeable)arrayList0.get(v2)), v2 * this.z, 0, 0.0f, 4, null);
        }
        SubcomposeMeasureScope subcomposeMeasureScope0 = this.x;
        List list0 = subcomposeMeasureScope0.subcompose(ab.b, this.y);
        int v3 = list0.size();
        for(int v4 = 0; true; ++v4) {
            v5 = this.B;
            if(v4 >= v3) {
                break;
            }
            Placeable placeable0 = ((Measurable)list0.get(v4)).measure-BRTryo0(Constraints.copy-Zbe2FdA$default(this.A, 0, 0, 0, 0, 11, null));
            PlacementScope.placeRelative$default(((PlacementScope)object0), placeable0, 0, v5 - placeable0.getHeight(), 0.0f, 4, null);
        }
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0xD9BCAD07, true, new xa(this.C, this.D));
        List list1 = subcomposeMeasureScope0.subcompose(ab.c, composableLambda0);
        int v6 = list1.size();
        for(int v1 = 0; v1 < v6; ++v1) {
            PlacementScope.placeRelative$default(((PlacementScope)object0), ((Measurable)list1.get(v1)).measure-BRTryo0(Constraints.Companion.fixed-JhjzzOo(this.E, v5)), 0, 0, 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }
}

