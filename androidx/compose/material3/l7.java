package androidx.compose.material3;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class l7 extends Lambda implements Function0 {
    public final int w;
    public final LazyGridState x;
    public final CoroutineScope y;

    public l7(LazyGridState lazyGridState0, CoroutineScope coroutineScope0, int v) {
        this.w = v;
        this.x = lazyGridState0;
        this.y = coroutineScope0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            LazyGridState lazyGridState0 = this.x;
            if(!lazyGridState0.getCanScrollBackward()) {
                return false;
            }
            m7 m70 = new m7(lazyGridState0, null);
            BuildersKt.launch$default(this.y, null, null, m70, 3, null);
            return true;
        }
        LazyGridState lazyGridState1 = this.x;
        if(!lazyGridState1.getCanScrollForward()) {
            return false;
        }
        k7 k70 = new k7(lazyGridState1, null);
        BuildersKt.launch$default(this.y, null, null, k70, 3, null);
        return true;
    }
}

