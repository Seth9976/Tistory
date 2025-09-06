package d0;

import a5.b;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;

public final class a0 extends Lambda implements Function1 {
    public final int w;
    public final c0 x;

    public a0(c0 c00, int v) {
        this.w = v;
        this.x = c00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            int v = ((Number)object0).intValue();
            c0 c00 = this.x;
            LazyLayoutItemProvider lazyLayoutItemProvider0 = (LazyLayoutItemProvider)c00.n.invoke();
            if(v >= 0 && v < lazyLayoutItemProvider0.getItemCount()) {
                BuildersKt.launch$default(c00.getCoroutineScope(), null, null, new b0(c00, v, null), 3, null);
                return true;
            }
            StringBuilder stringBuilder0 = b.s(v, "Can\'t scroll to index ", ", it is out of bounds [0, ");
            stringBuilder0.append(lazyLayoutItemProvider0.getItemCount());
            stringBuilder0.append(')');
            throw new IllegalArgumentException(stringBuilder0.toString().toString());
        }
        LazyLayoutItemProvider lazyLayoutItemProvider1 = (LazyLayoutItemProvider)this.x.n.invoke();
        int v1 = lazyLayoutItemProvider1.getItemCount();
        int v2;
        for(v2 = 0; true; ++v2) {
            if(v2 >= v1) {
                v2 = -1;
                break;
            }
            if(Intrinsics.areEqual(lazyLayoutItemProvider1.getKey(v2), object0)) {
                break;
            }
        }
        return v2;
    }
}

