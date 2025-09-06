package c0;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.Map;
import kotlin.collections.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function3 {
    public final LazyLayoutMeasureScope w;
    public final long x;
    public final int y;
    public final int z;

    public j(LazyLayoutMeasureScope lazyLayoutMeasureScope0, long v, int v1, int v2) {
        this.w = lazyLayoutMeasureScope0;
        this.x = v;
        this.y = v1;
        this.z = v2;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ConstraintsKt.constrainWidth-K40F9xA(this.x, ((Number)object0).intValue() + this.y);
        int v1 = ConstraintsKt.constrainHeight-K40F9xA(this.x, ((Number)object1).intValue() + this.z);
        Map map0 = x.emptyMap();
        return this.w.layout(v, v1, map0, ((Function1)object2));
    }
}

