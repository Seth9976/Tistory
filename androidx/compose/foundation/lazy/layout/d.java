package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableObjectIntMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function1 {
    public final int w;
    public final int x;
    public final MutableObjectIntMap y;
    public final NearestRangeKeyIndexMap z;

    public d(int v, int v1, MutableObjectIntMap mutableObjectIntMap0, NearestRangeKeyIndexMap nearestRangeKeyIndexMap0) {
        this.w = v;
        this.x = v1;
        this.y = mutableObjectIntMap0;
        this.z = nearestRangeKeyIndexMap0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Object object2;
        Function1 function10 = ((Interval)((androidx.compose.foundation.lazy.layout.IntervalList.Interval)object0).getValue()).getKey();
        int v = Math.max(this.w, ((androidx.compose.foundation.lazy.layout.IntervalList.Interval)object0).getStartIndex());
        int v1 = Math.min(this.x, ((androidx.compose.foundation.lazy.layout.IntervalList.Interval)object0).getSize() + ((androidx.compose.foundation.lazy.layout.IntervalList.Interval)object0).getStartIndex() - 1);
        if(v <= v1) {
            while(true) {
                if(function10 == null) {
                    object2 = Lazy_androidKt.getDefaultLazyLayoutKey(v);
                }
                else {
                    Object object1 = function10.invoke(((int)(v - ((androidx.compose.foundation.lazy.layout.IntervalList.Interval)object0).getStartIndex())));
                    if(object1 != null) {
                        object2 = object1;
                    }
                }
                this.y.set(object2, v);
                this.z.b[v - this.z.c] = object2;
                if(v == v1) {
                    break;
                }
                ++v;
            }
        }
        return Unit.INSTANCE;
    }
}

