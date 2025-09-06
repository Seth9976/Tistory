package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class ok extends Lambda implements Function1 {
    public final long A;
    public final long w;
    public final SliderPositions x;
    public final long y;
    public final long z;

    public ok(long v, SliderPositions sliderPositions0, long v1, long v2, long v3) {
        this.w = v;
        this.x = sliderPositions0;
        this.y = v1;
        this.z = v2;
        this.A = v3;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        boolean z = ((DrawScope)object0).getLayoutDirection() == LayoutDirection.Rtl;
        long v = OffsetKt.Offset(0.0f, Offset.getY-impl(((DrawScope)object0).getCenter-F1C5BW0()));
        long v1 = OffsetKt.Offset(Size.getWidth-impl(((DrawScope)object0).getSize-NH-jbRc()), Offset.getY-impl(((DrawScope)object0).getCenter-F1C5BW0()));
        long v2 = z ? v1 : v;
        long v3 = z ? v : v1;
        float f = ((DrawScope)object0).toPx-0680j_4(0.0f);
        float f1 = ((DrawScope)object0).toPx-0680j_4(0.0f);
        DrawScope.drawLine-NGM6Ib0$default(((DrawScope)object0), this.w, v2, v3, f1, 1, null, 0.0f, null, 0, 480, null);
        long v4 = OffsetKt.Offset(((Number)this.x.getActiveRange().getEndInclusive()).floatValue() * (Offset.getX-impl(v3) - Offset.getX-impl(v2)) + Offset.getX-impl(v2), Offset.getY-impl(((DrawScope)object0).getCenter-F1C5BW0()));
        long v5 = OffsetKt.Offset(((Number)this.x.getActiveRange().getStart()).floatValue() * (Offset.getX-impl(v3) - Offset.getX-impl(v2)) + Offset.getX-impl(v2), Offset.getY-impl(((DrawScope)object0).getCenter-F1C5BW0()));
        SliderPositions sliderPositions0 = this.x;
        DrawScope.drawLine-NGM6Ib0$default(((DrawScope)object0), this.y, v5, v4, f1, 1, null, 0.0f, null, 0, 480, null);
        float[] arr_f = sliderPositions0.getTickFractions();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(int v6 = 0; v6 < arr_f.length; ++v6) {
            float f2 = arr_f[v6];
            Boolean boolean0 = Boolean.valueOf(f2 > ((Number)sliderPositions0.getActiveRange().getEndInclusive()).floatValue() || f2 < ((Number)sliderPositions0.getActiveRange().getStart()).floatValue());
            ArrayList arrayList0 = linkedHashMap0.get(boolean0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                linkedHashMap0.put(boolean0, arrayList0);
            }
            arrayList0.add(f2);
        }
        for(Object object1: linkedHashMap0.entrySet()) {
            boolean z1 = ((Boolean)((Map.Entry)object1).getKey()).booleanValue();
            List list0 = (List)((Map.Entry)object1).getValue();
            ArrayList arrayList1 = new ArrayList(list0.size());
            int v7 = list0.size();
            for(int v8 = 0; v8 < v7; ++v8) {
                arrayList1.add(Offset.box-impl(OffsetKt.Offset(Offset.getX-impl(OffsetKt.lerp-Wko1d7g(v2, v3, ((Number)list0.get(v8)).floatValue())), Offset.getY-impl(((DrawScope)object0).getCenter-F1C5BW0()))));
            }
            DrawScope.drawPoints-F8ZwMP8$default(((DrawScope)object0), arrayList1, 0, (z1 ? this.z : this.A), f, 1, null, 0.0f, null, 0, 480, null);
        }
        return Unit.INSTANCE;
    }
}

