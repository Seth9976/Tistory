package f0;

import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

public final class p extends Lambda implements Function0 {
    public final int w;
    public final PagerState x;
    public final CoroutineScope y;

    public p(PagerState pagerState0, CoroutineScope coroutineScope0, int v) {
        this.w = v;
        this.x = pagerState0;
        this.y = coroutineScope0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return Boolean.valueOf(PagerKt.access$pagerSemantics$performBackwardPaging(this.x, this.y));
            }
            case 1: {
                return Boolean.valueOf(PagerKt.access$pagerSemantics$performForwardPaging(this.x, this.y));
            }
            case 2: {
                return Boolean.valueOf(PagerKt.access$pagerSemantics$performBackwardPaging(this.x, this.y));
            }
            default: {
                return Boolean.valueOf(PagerKt.access$pagerSemantics$performForwardPaging(this.x, this.y));
            }
        }
    }
}

