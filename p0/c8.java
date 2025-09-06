package p0;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class c8 extends Lambda implements Function1 {
    public final float A;
    public final State B;
    public final List C;
    public final State D;
    public final State E;
    public final float w;
    public final State x;
    public final float y;
    public final float z;

    public c8(float f, State state0, float f1, float f2, float f3, State state1, List list0, State state2, State state3) {
        this.w = f;
        this.x = state0;
        this.y = f1;
        this.z = f2;
        this.A = f3;
        this.B = state1;
        this.C = list0;
        this.D = state2;
        this.E = state3;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        boolean z = ((DrawScope)object0).getLayoutDirection() == LayoutDirection.Rtl;
        float f = Offset.getY-impl(((DrawScope)object0).getCenter-F1C5BW0());
        long v = OffsetKt.Offset(this.w, f);
        float f1 = Size.getWidth-impl(((DrawScope)object0).getSize-NH-jbRc());
        float f2 = Offset.getY-impl(((DrawScope)object0).getCenter-F1C5BW0());
        long v1 = OffsetKt.Offset(f1 - this.w, f2);
        long v2 = z ? v1 : v;
        long v3 = z ? v : v1;
        DrawScope.drawLine-NGM6Ib0$default(((DrawScope)object0), ((Color)this.x.getValue()).unbox-impl(), v2, v3, this.y, 1, null, 0.0f, null, 0, 480, null);
        float f3 = Offset.getY-impl(((DrawScope)object0).getCenter-F1C5BW0());
        float f4 = Offset.getY-impl(((DrawScope)object0).getCenter-F1C5BW0());
        long v4 = ((Color)this.B.getValue()).unbox-impl();
        float f5 = this.A;
        float f6 = this.z;
        DrawScope.drawLine-NGM6Ib0$default(((DrawScope)object0), v4, OffsetKt.Offset((Offset.getX-impl(v3) - Offset.getX-impl(v2)) * this.A + Offset.getX-impl(v2), f4), OffsetKt.Offset((Offset.getX-impl(v3) - Offset.getX-impl(v2)) * this.z + Offset.getX-impl(v2), f3), this.y, 1, null, 0.0f, null, 0, 480, null);
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object1: this.C) {
            float f7 = ((Number)object1).floatValue();
            Boolean boolean0 = Boolean.valueOf(f7 > f6 || f7 < f5);
            ArrayList arrayList0 = linkedHashMap0.get(boolean0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                linkedHashMap0.put(boolean0, arrayList0);
            }
            arrayList0.add(object1);
        }
        for(Object object2: linkedHashMap0.entrySet()) {
            boolean z1 = ((Boolean)((Map.Entry)object2).getKey()).booleanValue();
            List list0 = (List)((Map.Entry)object2).getValue();
            ArrayList arrayList1 = new ArrayList(list0.size());
            int v5 = list0.size();
            for(int v6 = 0; v6 < v5; ++v6) {
                arrayList1.add(Offset.box-impl(OffsetKt.Offset(Offset.getX-impl(OffsetKt.lerp-Wko1d7g(v2, v3, ((Number)list0.get(v6)).floatValue())), Offset.getY-impl(((DrawScope)object0).getCenter-F1C5BW0()))));
            }
            DrawScope.drawPoints-F8ZwMP8$default(((DrawScope)object0), arrayList1, 0, ((Color)(z1 ? this.D : this.E).getValue()).unbox-impl(), this.y, 1, null, 0.0f, null, 0, 480, null);
        }
        return Unit.INSTANCE;
    }
}

