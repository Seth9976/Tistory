package androidx.compose.material3;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;

public final class tn extends Lambda implements Function1 {
    public final ArrayList A;
    public final si B;
    public final MeasureScope C;
    public final int D;
    public final ArrayList E;
    public final int F;
    public final int G;
    public final FloatRef w;
    public final float x;
    public final ArrayList y;
    public final ArrayList z;

    public tn(FloatRef ref$FloatRef0, float f, ArrayList arrayList0, ArrayList arrayList1, ArrayList arrayList2, si si0, MeasureScope measureScope0, int v, ArrayList arrayList3, int v1, int v2) {
        this.w = ref$FloatRef0;
        this.x = f;
        this.y = arrayList0;
        this.z = arrayList1;
        this.A = arrayList2;
        this.B = si0;
        this.C = measureScope0;
        this.D = v;
        this.E = arrayList3;
        this.F = v1;
        this.G = v2;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v7;
        int v4;
        MeasureScope measureScope0;
        ArrayList arrayList1;
        FloatRef ref$FloatRef0 = this.w;
        ref$FloatRef0.element = this.x;
        ArrayList arrayList0 = this.y;
        int v = arrayList0.size();
        for(int v1 = 0; true; ++v1) {
            arrayList1 = this.E;
            measureScope0 = this.C;
            if(v1 >= v) {
                break;
            }
            PlacementScope.placeRelative$default(((PlacementScope)object0), ((Placeable)arrayList0.get(v1)), measureScope0.roundToPx-0680j_4(ref$FloatRef0.element), 0, 0.0f, 4, null);
            float f = ref$FloatRef0.element;
            ref$FloatRef0.element = Dp.constructor-impl(((TabPosition)arrayList1.get(v1)).getWidth-D9Ej5fM() + f);
        }
        ArrayList arrayList2 = this.z;
        int v2 = arrayList2.size();
        for(int v3 = 0; true; ++v3) {
            v4 = this.G;
            if(v3 >= v2) {
                break;
            }
            Object object1 = arrayList2.get(v3);
            PlacementScope.placeRelative$default(((PlacementScope)object0), ((Placeable)object1), 0, v4 - ((Placeable)object1).getHeight(), 0.0f, 4, null);
        }
        ArrayList arrayList3 = this.A;
        int v5 = arrayList3.size();
        for(int v6 = 0; true; ++v6) {
            v7 = this.F;
            if(v6 >= v5) {
                break;
            }
            Placeable placeable0 = (Placeable)arrayList3.get(v6);
            PlacementScope.placeRelative$default(((PlacementScope)object0), placeable0, Math.max(0, (measureScope0.roundToPx-0680j_4(((TabPosition)arrayList1.get(v7)).getWidth-D9Ej5fM()) - placeable0.getWidth()) / 2), v4 - placeable0.getHeight(), 0.0f, 4, null);
        }
        this.B.a(measureScope0, this.D, arrayList1, v7);
        return Unit.INSTANCE;
    }
}

