package f0;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.pager.LazyLayoutPagerKt;
import androidx.compose.foundation.pager.PageSize;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function2 {
    public final Orientation A;
    public final TargetedFlingBehavior B;
    public final boolean C;
    public final int D;
    public final float E;
    public final PageSize F;
    public final NestedScrollConnection G;
    public final Function1 H;
    public final Horizontal I;
    public final Vertical J;
    public final SnapPosition K;
    public final Function4 L;
    public final int M;
    public final int N;
    public final int O;
    public final Modifier w;
    public final PagerState x;
    public final PaddingValues y;
    public final boolean z;

    public f(Modifier modifier0, PagerState pagerState0, PaddingValues paddingValues0, boolean z, Orientation orientation0, TargetedFlingBehavior targetedFlingBehavior0, boolean z1, int v, float f, PageSize pageSize0, NestedScrollConnection nestedScrollConnection0, Function1 function10, Horizontal alignment$Horizontal0, Vertical alignment$Vertical0, SnapPosition snapPosition0, Function4 function40, int v1, int v2, int v3) {
        this.w = modifier0;
        this.x = pagerState0;
        this.y = paddingValues0;
        this.z = z;
        this.A = orientation0;
        this.B = targetedFlingBehavior0;
        this.C = z1;
        this.D = v;
        this.E = f;
        this.F = pageSize0;
        this.G = nestedScrollConnection0;
        this.H = function10;
        this.I = alignment$Horizontal0;
        this.J = alignment$Vertical0;
        this.K = snapPosition0;
        this.L = function40;
        this.M = v1;
        this.N = v2;
        this.O = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        LazyLayoutPagerKt.Pager-uYRUAWA(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, ((Composer)object0), (this.M | 1) & -920350135 | ((0x24924924 & (this.M | 1)) >> 1 | 306783378 & (this.M | 1)) | (306783378 & (this.M | 1)) << 1 & (0x24924924 & (this.M | 1)), this.N & -920350135 | ((0x24924924 & this.N) >> 1 | 306783378 & this.N) | (306783378 & this.N) << 1 & (0x24924924 & this.N), this.O);
        return Unit.INSTANCE;
    }
}

