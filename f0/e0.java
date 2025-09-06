package f0;

import androidx.compose.foundation.pager.PagerState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class e0 extends Lambda implements Function0 {
    public final int w;
    public final PagerState x;

    public e0(PagerState pagerState0, int v) {
        this.w = v;
        this.x = pagerState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            PagerState pagerState0 = this.x;
            if(!pagerState0.isScrollInProgress()) {
                return pagerState0.a(pagerState0.getCurrentPage());
            }
            if(PagerState.access$getProgrammaticScrollTargetPage(pagerState0) != -1) {
                return pagerState0.a(PagerState.access$getProgrammaticScrollTargetPage(pagerState0));
            }
            if(Math.abs(pagerState0.getCurrentPageOffsetFraction()) >= Math.abs(pagerState0.getPositionThresholdFraction$foundation_release())) {
                return pagerState0.getLastScrolledForward() ? pagerState0.a(pagerState0.getFirstVisiblePage$foundation_release() + 1) : pagerState0.a(pagerState0.getFirstVisiblePage$foundation_release());
            }
            return pagerState0.a(pagerState0.getCurrentPage());
        }
        return this.x.isScrollInProgress() ? PagerState.access$getSettledPageState(this.x) : this.x.getCurrentPage();
    }
}

