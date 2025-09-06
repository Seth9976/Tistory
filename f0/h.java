package f0;

import androidx.compose.foundation.pager.PagerState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function0 {
    public final PagerState w;

    public h(PagerState pagerState0) {
        this.w = pagerState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w.getPageCount();
    }
}

