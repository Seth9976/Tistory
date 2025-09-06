package f0;

import androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function3 {
    public final PagerState w;
    public final LayoutDirection x;
    public final float y;

    public m(PagerState pagerState0, LayoutDirection layoutDirection0, float f) {
        this.w = pagerState0;
        this.x = layoutDirection0;
        this.y = f;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        return PagerSnapLayoutInfoProviderKt.calculateFinalSnappingBound(this.w, this.x, this.y, ((Number)object0).floatValue(), ((Number)object1).floatValue(), ((Number)object2).floatValue());
    }
}

