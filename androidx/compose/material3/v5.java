package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class v5 extends Lambda implements Function0 {
    public final int w;
    public final CoroutineScope x;
    public final LazyListState y;

    public v5(LazyListState lazyListState0, CoroutineScope coroutineScope0, int v) {
        this.w = v;
        this.y = lazyListState0;
        this.x = coroutineScope0;
        super(0);
    }

    public v5(CoroutineScope coroutineScope0, LazyListState lazyListState0, int v) {
        this.w = v;
        this.x = coroutineScope0;
        this.y = lazyListState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                u5 u50 = new u5(this.y, null);
                BuildersKt.launch$default(this.x, null, null, u50, 3, null);
                return Unit.INSTANCE;
            }
            case 1: {
                w5 w50 = new w5(this.y, null);
                BuildersKt.launch$default(this.x, null, null, w50, 3, null);
                return Unit.INSTANCE;
            }
            case 2: {
                LazyListState lazyListState1 = this.y;
                if(!lazyListState1.getCanScrollForward()) {
                    return false;
                }
                o8 o80 = new o8(lazyListState1, null);
                BuildersKt.launch$default(this.x, null, null, o80, 3, null);
                return true;
            }
            default: {
                LazyListState lazyListState0 = this.y;
                if(!lazyListState0.getCanScrollBackward()) {
                    return false;
                }
                p8 p80 = new p8(lazyListState0, null);
                BuildersKt.launch$default(this.x, null, null, p80, 3, null);
                return true;
            }
        }
    }
}

