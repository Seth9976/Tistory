package com.kakao.kandinsky.designsystem.common;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.pager.PagerState;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\b\n\u0018\u00002\u00020\u0001J\u001F\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001A\u0010\t\u001A\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u000E\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\r\u0010\f¨\u0006\u000F"}, d2 = {"com/kakao/kandinsky/designsystem/common/ItemSliderKt$Pager$snapLayoutInfoProvider$1$1", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "", "velocity", "decayOffset", "calculateApproachOffset", "(FF)F", "calculateSnapOffset", "(F)F", "flingThreshold", "F", "getFlingThreshold", "()F", "getPageSizeWithSpacing", "pageSizeWithSpacing", "designsystem_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ItemSliderKt.Pager.snapLayoutInfoProvider.1.1 implements SnapLayoutInfoProvider {
    public final PagerState a;
    public final DecayAnimationSpec b;

    public ItemSliderKt.Pager.snapLayoutInfoProvider.1.1(PagerState pagerState0, DecayAnimationSpec decayAnimationSpec0) {
        this.a = pagerState0;
        this.b = decayAnimationSpec0;
    }

    @Override  // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
    public float calculateApproachOffset(float f, float f1) {
        float f2 = DecayAnimationSpecKt.calculateTargetValue(this.b, 0.0f, f);
        if(Math.abs(f2 / this.getPageSizeWithSpacing()) < 0.5f) {
            return 0.0f;
        }
        float f3 = (float)this.a.getCurrentPage();
        float f4 = this.a.getCurrentPageOffsetFraction();
        float f5 = this.getPageSizeWithSpacing() * (f4 + f3);
        float f6 = (float)this.a.getPageCount();
        float f7 = this.getPageSizeWithSpacing() * f6 - f5;
        if(f2 >= f7) {
            return f7;
        }
        return f2 <= -f5 ? -f5 : f2 - (f5 + f2) % this.getPageSizeWithSpacing();
    }

    @Override  // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
    public float calculateSnapOffset(float f) {
        float f1 = this.a.getCurrentPageOffsetFraction();
        return this.getPageSizeWithSpacing() * -f1;
    }

    public final float getFlingThreshold() {
        return 0.5f;
    }

    public final float getPageSizeWithSpacing() {
        int v = this.a.getLayoutInfo().getPageSize();
        return (float)(this.a.getLayoutInfo().getPageSpacing() + v);
    }
}

