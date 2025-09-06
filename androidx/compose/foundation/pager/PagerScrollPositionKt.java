package androidx.compose.foundation.pager;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zd.c;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001A\u0013\u0010\u0002\u001A\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0005\u001A\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0007\u001A\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "", "currentAbsoluteScrollOffset", "(Landroidx/compose/foundation/pager/PagerState;)J", "", "NearestItemsSlidingWindowSize", "I", "NearestItemsExtraItemCount", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class PagerScrollPositionKt {
    public static final int NearestItemsExtraItemCount = 100;
    public static final int NearestItemsSlidingWindowSize = 30;

    public static final long currentAbsoluteScrollOffset(@NotNull PagerState pagerState0) {
        long v = ((long)pagerState0.getCurrentPage()) * ((long)pagerState0.getPageSizeWithSpacing$foundation_release());
        return c.roundToLong(pagerState0.getCurrentPageOffsetFraction() * ((float)pagerState0.getPageSizeWithSpacing$foundation_release())) + v;
    }
}

