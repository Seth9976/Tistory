package androidx.compose.foundation.layout;

import aa.d;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class f2 extends Lambda implements Function2 {
    public final int w;
    public final SubcomposeMeasureScope x;
    public final g2 y;

    public f2(g2 g20, SubcomposeMeasureScope subcomposeMeasureScope0) {
        this.w = 0;
        this.y = g20;
        this.x = subcomposeMeasureScope0;
        super(2);
    }

    public f2(SubcomposeMeasureScope subcomposeMeasureScope0, g2 g20) {
        this.w = 1;
        this.x = subcomposeMeasureScope0;
        this.y = g20;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            int v = ((Number)object0).intValue();
            ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0xF45F9C00, true, new d(this.y, v, ((FlowLineInfo)object1), 1));
            return this.x.subcompose(v, composableLambda0);
        }
        boolean z = ((Boolean)object0).booleanValue();
        int v1 = ((Number)object1).intValue();
        g2 g20 = this.y;
        Function2 function20 = (Function2)CollectionsKt___CollectionsKt.getOrNull(g20.k, !z);
        return function20 != null ? ((Measurable)CollectionsKt___CollectionsKt.getOrNull(this.x.subcompose(z + g20.g + v1, function20), 0)) : null;
    }
}

