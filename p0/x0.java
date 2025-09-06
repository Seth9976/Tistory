package p0;

import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import r0.a;

public final class x0 extends Lambda implements Function2 {
    public final Function2 w;
    public final Function1 x;
    public final Function4 y;

    public x0(Function2 function20, Function1 function10, Function4 function40) {
        this.w = function20;
        this.x = function10;
        this.y = function40;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        long v = ((Constraints)object1).unbox-impl();
        Measurable measurable0 = (Measurable)CollectionsKt___CollectionsKt.first(((SubcomposeMeasureScope)object0).subcompose(l0.a, this.w));
        Constraints constraints0 = Constraints.box-impl(v);
        Placeable placeable0 = measurable0.measure-BRTryo0(((Constraints)this.x.invoke(constraints0)).unbox-impl());
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0xB71FF427, true, new w0(this.y, v, ((float)placeable0.getHeight())));
        List list0 = ((SubcomposeMeasureScope)object0).subcompose(l0.b, composableLambda0);
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        for(int v3 = 0; v3 < v1; v3 = a.f(((Measurable)list0.get(v3)), v, arrayList0, v3, 1)) {
        }
        int v4 = Math.max(Constraints.getMinWidth-impl(v), placeable0.getWidth());
        int v5 = arrayList0.size();
        int v6 = Math.max(Constraints.getMinHeight-impl(v), placeable0.getHeight());
        for(int v2 = 0; v2 < v5; ++v2) {
            Placeable placeable1 = (Placeable)arrayList0.get(v2);
            v4 = Math.max(v4, placeable1.getWidth());
            v6 = Math.max(v6, placeable1.getHeight());
        }
        return MeasureScope.layout$default(((SubcomposeMeasureScope)object0), v4, v6, null, new v0(placeable0, arrayList0), 4, null);
    }
}

