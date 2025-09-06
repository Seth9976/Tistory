package o6;

import com.google.accompanist.pager.PagerScope;
import com.google.accompanist.pager.PagerState;
import kotlin.jvm.internal.Intrinsics;

public final class r implements PagerScope {
    public final PagerState a;

    public r(PagerState pagerState0) {
        Intrinsics.checkNotNullParameter(pagerState0, "state");
        super();
        this.a = pagerState0;
    }

    @Override  // com.google.accompanist.pager.PagerScope
    public final int getCurrentPage() {
        return this.a.getCurrentPage();
    }

    @Override  // com.google.accompanist.pager.PagerScope
    public final float getCurrentPageOffset() {
        return this.a.getCurrentPageOffset();
    }
}

