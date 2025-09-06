package androidx.compose.material3.carousel;

import androidx.compose.foundation.gestures.snapping.SnapPosition;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zd.c;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0010\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0000\u001A \u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00052\u0006\u0010\t\u001A\u00020\u0005H\u0000¨\u0006\n"}, d2 = {"KeylineSnapPosition", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "pageSize", "Landroidx/compose/material3/carousel/CarouselPageSize;", "getSnapPositionOffset", "", "strategy", "Landroidx/compose/material3/carousel/Strategy;", "itemIndex", "itemCount", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class KeylineSnapPositionKt {
    @NotNull
    public static final SnapPosition KeylineSnapPosition(@NotNull CarouselPageSize carouselPageSize0) {
        return (/* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, int v, int v1) -> {
            if(!this.a.getStrategy().isValid()) {
                return 0;
            }
            int v2 = this.a.getStrategy().getDefaultKeylines().getLastFocalIndex() - this.a.getStrategy().getDefaultKeylines().getFirstFocalIndex();
            int v3 = this.a.getStrategy().getStartKeylineSteps().size() + v2;
            int v4 = this.a.getStrategy().getEndKeylineSteps().size() + v2;
            int v5 = c.roundToInt(this.a.getStrategy().getDefaultKeylines().getFirstFocal().getUnadjustedOffset() - this.a.getStrategy().getItemMainAxisSize() / 2.0f);
            if(v < v3) {
                v5 = c.roundToInt(((KeylineList)this.a.getStrategy().getStartKeylineSteps().get(Math.min(this.a.getStrategy().getStartKeylineSteps().size() - 1, Math.max(0, v3 - 1 - v)))).getFirstFocal().getUnadjustedOffset() - this.a.getStrategy().getItemMainAxisSize() / 2.0f);
            }
            return v1 <= v2 + 1 || v < v1 - v4 ? v5 : c.roundToInt(((KeylineList)this.a.getStrategy().getEndKeylineSteps().get(Math.min(this.a.getStrategy().getEndKeylineSteps().size() - 1, Math.max(0, v - v1 + v4)))).getFirstFocal().getUnadjustedOffset() - this.a.getStrategy().getItemMainAxisSize() / 2.0f);
        };

        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J8\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"androidx/compose/material3/carousel/KeylineSnapPositionKt$KeylineSnapPosition$1", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "position", "", "layoutSize", "itemSize", "beforeContentPadding", "afterContentPadding", "itemIndex", "itemCount", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public final class androidx.compose.material3.carousel.KeylineSnapPositionKt.KeylineSnapPosition.1 implements SnapPosition {
            public final CarouselPageSize a;

            public androidx.compose.material3.carousel.KeylineSnapPositionKt.KeylineSnapPosition.1(CarouselPageSize carouselPageSize0) {
                this.a = carouselPageSize0;
            }

            @Override  // androidx.compose.foundation.gestures.snapping.SnapPosition
            public int position(int v, int v1, int v2, int v3, int v4, int v5) {
                return KeylineSnapPositionKt.getSnapPositionOffset(this.a.getStrategy(), v4, v5);
            }
        }

    }

    // 检测为 Lambda 实现
    public static final int getSnapPositionOffset(@NotNull Strategy strategy0, int v, int v1) [...]
}

