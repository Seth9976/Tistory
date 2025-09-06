package o6;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import com.google.accompanist.pager.PagerState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.c;

public final class e extends Lambda implements Function0 {
    public final int w;
    public final PagerState x;

    public e(PagerState pagerState0, int v) {
        this.w = v;
        this.x = pagerState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return Boolean.valueOf(this.x.isScrollInProgress());
            }
            case 1: {
                LazyListItemInfo lazyListItemInfo0 = this.x.getMostVisiblePageLayoutInfo$pager_release();
                return lazyListItemInfo0 != null ? lazyListItemInfo0.getIndex() : null;
            }
            case 2: {
                PagerState pagerState0 = this.x;
                LazyListItemInfo lazyListItemInfo1 = pagerState0.a();
                if(lazyListItemInfo1 != null) {
                    int v = lazyListItemInfo1.getOffset();
                    int v1 = lazyListItemInfo1.getSize();
                    return c.coerceIn(((float)(-v)) / ((float)(pagerState0.getItemSpacing$pager_release() + v1)), -0.5f, 0.5f);
                }
                return 0.0f;
            }
            default: {
                return this.x.getLazyListState$pager_release().getLayoutInfo().getTotalItemsCount();
            }
        }
    }
}

