package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class d2 extends Lambda implements Function2 {
    public final g2 w;

    public d2(g2 g20) {
        this.w = g20;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        long v = ((Constraints)object1).unbox-impl();
        g2 g20 = this.w;
        int v1 = g20.g;
        if(v1 > 0 && g20.h != 0 && g20.i != 0) {
            FlowLayoutOverflowState flowLayoutOverflowState0 = g20.j;
            if(Constraints.getMaxHeight-impl(v) != 0 || flowLayoutOverflowState0.getType$foundation_layout_release() == OverflowType.Visible) {
                ContextualFlowItemIterator contextualFlowItemIterator0 = new ContextualFlowItemIterator(v1, new f2(((SubcomposeMeasureScope)object0), g20));
                flowLayoutOverflowState0.setItemCount$foundation_layout_release(v1);
                flowLayoutOverflowState0.setOverflowMeasurables-VKLhPVY$foundation_layout_release(g20, v, new f2(g20, ((SubcomposeMeasureScope)object0)));
                long v2 = OrientationIndependentConstraints.constructor-impl(v, (g20.a ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical));
                return FlowLayoutKt.breakDownItems-di9J0FM(((SubcomposeMeasureScope)object0), g20, contextualFlowItemIterator0, g20.d, g20.f, v2, g20.i, g20.h, g20.j);
            }
        }
        return MeasureScope.layout$default(((SubcomposeMeasureScope)object0), 0, 0, null, e2.w, 4, null);
    }
}

