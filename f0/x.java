package f0;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.pager.PagerLazyLayoutItemProvider;
import androidx.compose.foundation.pager.PagerMeasureKt;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class x extends Lambda implements Function1 {
    public final Orientation A;
    public final Horizontal B;
    public final Vertical C;
    public final boolean D;
    public final int E;
    public final LazyLayoutMeasureScope w;
    public final long x;
    public final PagerLazyLayoutItemProvider y;
    public final long z;

    public x(LazyLayoutMeasureScope lazyLayoutMeasureScope0, long v, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider0, long v1, Orientation orientation0, Horizontal alignment$Horizontal0, Vertical alignment$Vertical0, boolean z, int v2) {
        this.w = lazyLayoutMeasureScope0;
        this.x = v;
        this.y = pagerLazyLayoutItemProvider0;
        this.z = v1;
        this.A = orientation0;
        this.B = alignment$Horizontal0;
        this.C = alignment$Vertical0;
        this.D = z;
        this.E = v2;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        LayoutDirection layoutDirection0 = this.w.getLayoutDirection();
        return PagerMeasureKt.a(this.w, ((Number)object0).intValue(), this.x, this.y, this.z, this.A, this.B, this.C, layoutDirection0, this.D, this.E);
    }
}

