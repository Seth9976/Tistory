package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class x1 extends Lambda implements Function3 {
    public final int w;
    public final int[] x;

    public x1(int v, int[] arr_v) {
        this.w = v;
        this.x = arr_v;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        if(this.w != 0) {
            IntrinsicMeasurable intrinsicMeasurable0 = (IntrinsicMeasurable)object0;
            ((Number)object2).intValue();
            return (int)this.x[((Number)object1).intValue()];
        }
        IntrinsicMeasurable intrinsicMeasurable1 = (IntrinsicMeasurable)object0;
        ((Number)object2).intValue();
        return (int)this.x[((Number)object1).intValue()];
    }
}

