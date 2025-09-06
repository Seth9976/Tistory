package f0;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.pager.PagerState;
import kotlin.ranges.c;

public final class l implements BringIntoViewSpec {
    public final PagerState a;
    public final BringIntoViewSpec b;
    public final AnimationSpec c;

    public l(PagerState pagerState0, BringIntoViewSpec bringIntoViewSpec0) {
        this.a = pagerState0;
        this.b = bringIntoViewSpec0;
        this.c = bringIntoViewSpec0.getScrollAnimationSpec();
    }

    @Override  // androidx.compose.foundation.gestures.BringIntoViewSpec
    public final float calculateScrollDistance(float f, float f1, float f2) {
        float f3 = this.b.calculateScrollDistance(f, f1, f2);
        int v = Float.compare(f3, 0.0f);
        PagerState pagerState0 = this.a;
        if(v == 0) {
            return pagerState0.getFirstVisiblePageOffset$foundation_release() == 0 ? 0.0f : c.coerceIn((pagerState0.getLastScrolledForward() ? ((float)pagerState0.getFirstVisiblePageOffset$foundation_release()) * -1.0f + ((float)pagerState0.getPageSizeWithSpacing$foundation_release()) : ((float)pagerState0.getFirstVisiblePageOffset$foundation_release()) * -1.0f), -f2, f2);
        }
        float f4;
        for(f4 = ((float)pagerState0.getFirstVisiblePageOffset$foundation_release()) * -1.0f; f3 > 0.0f && f4 < f3; f4 += (float)pagerState0.getPageSizeWithSpacing$foundation_release()) {
        }
        float f5;
        for(f5 = f4; v < 0 && f5 > f3; f5 -= (float)pagerState0.getPageSizeWithSpacing$foundation_release()) {
        }
        return f5;
    }

    @Override  // androidx.compose.foundation.gestures.BringIntoViewSpec
    public final AnimationSpec getScrollAnimationSpec() {
        return this.c;
    }
}

