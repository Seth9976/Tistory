package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class b2 extends Lambda implements Function1 {
    public final FlowLayoutOverflowState w;
    public final FlowLineMeasurePolicy x;

    public b2(FlowLayoutOverflowState flowLayoutOverflowState0, FlowLineMeasurePolicy flowLineMeasurePolicy0) {
        this.w = flowLayoutOverflowState0;
        this.x = flowLineMeasurePolicy0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v1;
        int v;
        if(((Placeable)object0) == null) {
            v = 0;
            v1 = 0;
        }
        else {
            v = this.x.mainAxisSize(((Placeable)object0));
            v1 = this.x.crossAxisSize(((Placeable)object0));
        }
        IntIntPair intIntPair0 = IntIntPair.box-impl(IntIntPair.constructor-impl(v, v1));
        this.w.k = intIntPair0;
        this.w.i = (Placeable)object0;
        return Unit.INSTANCE;
    }
}

