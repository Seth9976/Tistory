package m6;

import androidx.compose.foundation.layout.Arrangement.Vertical;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.accompanist.flowlayout.FlowCrossAxisAlignment;
import com.google.accompanist.flowlayout.FlowKt.Flow.1.measure.1.WhenMappings;
import com.google.accompanist.flowlayout.FlowKt;
import com.google.accompanist.flowlayout.LayoutOrientation;
import com.google.accompanist.flowlayout.MainAxisAlignment;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public final MainAxisAlignment A;
    public final LayoutOrientation B;
    public final int C;
    public final FlowCrossAxisAlignment D;
    public final ArrayList E;
    public final ArrayList F;
    public final ArrayList w;
    public final MeasureScope x;
    public final float y;
    public final MainAxisAlignment z;

    public a(ArrayList arrayList0, MeasureScope measureScope0, float f, MainAxisAlignment mainAxisAlignment0, MainAxisAlignment mainAxisAlignment1, LayoutOrientation layoutOrientation0, int v, FlowCrossAxisAlignment flowCrossAxisAlignment0, ArrayList arrayList1, ArrayList arrayList2) {
        this.w = arrayList0;
        this.x = measureScope0;
        this.y = f;
        this.z = mainAxisAlignment0;
        this.A = mainAxisAlignment1;
        this.B = layoutOrientation0;
        this.C = v;
        this.D = flowCrossAxisAlignment0;
        this.E = arrayList1;
        this.F = arrayList2;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v6;
        LayoutOrientation layoutOrientation0;
        MeasureScope measureScope0;
        Intrinsics.checkNotNullParameter(((PlacementScope)object0), "$this$layout");
        ArrayList arrayList0 = this.w;
        int v = 0;
        for(Object object1: arrayList0) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            List list0 = (List)object1;
            int v1 = list0.size();
            int[] arr_v = new int[v1];
            for(int v2 = 0; true; ++v2) {
                measureScope0 = this.x;
                layoutOrientation0 = this.B;
                if(v2 >= v1) {
                    break;
                }
                arr_v[v2] = FlowKt.access$Flow_F4y8cZ0$mainAxisSize(((Placeable)list0.get(v2)), layoutOrientation0) + (v2 >= CollectionsKt__CollectionsKt.getLastIndex(list0) ? 0 : measureScope0.roundToPx-0680j_4(this.y));
            }
            Vertical arrangement$Vertical0 = v >= CollectionsKt__CollectionsKt.getLastIndex(arrayList0) ? this.A.getArrangement$flowlayout_release() : this.z.getArrangement$flowlayout_release();
            int[] arr_v1 = new int[v1];
            for(int v3 = 0; v3 < v1; ++v3) {
                arr_v1[v3] = 0;
            }
            arrangement$Vertical0.arrange(measureScope0, this.C, arr_v, arr_v1);
            int v4 = 0;
            for(Object object2: list0) {
                if(v4 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                int v5 = FlowKt.Flow.1.measure.1.WhenMappings.$EnumSwitchMapping$0[this.D.ordinal()];
                if(v5 == 1) {
                    v6 = 0;
                }
                else {
                    ArrayList arrayList1 = this.E;
                    switch(v5) {
                        case 2: {
                            v6 = ((Number)arrayList1.get(v)).intValue() - FlowKt.access$Flow_F4y8cZ0$crossAxisSize(((Placeable)object2), layoutOrientation0);
                            break;
                        }
                        case 3: {
                            long v7 = IntSizeKt.IntSize(0, ((Number)arrayList1.get(v)).intValue() - FlowKt.access$Flow_F4y8cZ0$crossAxisSize(((Placeable)object2), layoutOrientation0));
                            v6 = IntOffset.getY-impl(Alignment.Companion.getCenter().align-KFBX0sM(0L, v7, LayoutDirection.Ltr));
                            break;
                        }
                        default: {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                ArrayList arrayList2 = this.F;
                if(layoutOrientation0 == LayoutOrientation.Horizontal) {
                    PlacementScope.place$default(((PlacementScope)object0), ((Placeable)object2), arr_v1[v4], ((Number)arrayList2.get(v)).intValue() + v6, 0.0f, 4, null);
                }
                else {
                    PlacementScope.place$default(((PlacementScope)object0), ((Placeable)object2), v6 + ((Number)arrayList2.get(v)).intValue(), arr_v1[v4], 0.0f, 4, null);
                }
                ++v4;
            }
            ++v;
        }
        return Unit.INSTANCE;
    }
}

