package p0;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.IntRef;
import r0.a;

public final class ua extends Lambda implements Function2 {
    public final int A;
    public final Function3 B;
    public final float w;
    public final Function2 x;
    public final Function2 y;
    public final h7 z;

    public ua(float f, Function2 function20, Function2 function21, h7 h70, int v, Function3 function30) {
        this.w = f;
        this.x = function20;
        this.y = function21;
        this.z = h70;
        this.A = v;
        this.B = function30;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        long v = ((Constraints)object1).unbox-impl();
        int v1 = ((SubcomposeMeasureScope)object0).roundToPx-0680j_4(90.0f);
        int v2 = ((SubcomposeMeasureScope)object0).roundToPx-0680j_4(this.w);
        long v4 = Constraints.copy-Zbe2FdA$default(v, v1, 0, 0, 0, 14, null);
        List list0 = ((SubcomposeMeasureScope)object0).subcompose(ab.a, this.x);
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v5 = list0.size();
        for(int v6 = 0; v6 < v5; v6 = a.f(((Measurable)list0.get(v6)), v4, arrayList0, v6, 1)) {
        }
        IntRef ref$IntRef0 = new IntRef();
        ref$IntRef0.element = v2 * 2;
        IntRef ref$IntRef1 = new IntRef();
        int v7 = arrayList0.size();
        for(int v3 = 0; v3 < v7; ++v3) {
            Placeable placeable0 = (Placeable)arrayList0.get(v3);
            ref$IntRef0.element = placeable0.getWidth() + ref$IntRef0.element;
            ref$IntRef1.element = Math.max(ref$IntRef1.element, placeable0.getHeight());
        }
        return MeasureScope.layout$default(((SubcomposeMeasureScope)object0), ref$IntRef0.element, ref$IntRef1.element, null, new ta(v2, arrayList0, ((SubcomposeMeasureScope)object0), this.y, this.z, this.A, v, ref$IntRef0, ref$IntRef1, this.B), 4, null);
    }
}

