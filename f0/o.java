package f0;

import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.pager.PageSize;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function2 {
    public final int A;
    public final float B;
    public final Horizontal C;
    public final TargetedFlingBehavior D;
    public final boolean E;
    public final boolean F;
    public final Function1 G;
    public final NestedScrollConnection H;
    public final SnapPosition I;
    public final Function4 J;
    public final int K;
    public final int L;
    public final int M;
    public final PagerState w;
    public final Modifier x;
    public final PaddingValues y;
    public final PageSize z;

    public o(PagerState pagerState0, Modifier modifier0, PaddingValues paddingValues0, PageSize pageSize0, int v, float f, Horizontal alignment$Horizontal0, TargetedFlingBehavior targetedFlingBehavior0, boolean z, boolean z1, Function1 function10, NestedScrollConnection nestedScrollConnection0, SnapPosition snapPosition0, Function4 function40, int v1, int v2, int v3) {
        this.w = pagerState0;
        this.x = modifier0;
        this.y = paddingValues0;
        this.z = pageSize0;
        this.A = v;
        this.B = f;
        this.C = alignment$Horizontal0;
        this.D = targetedFlingBehavior0;
        this.E = z;
        this.F = z1;
        this.G = function10;
        this.H = nestedScrollConnection0;
        this.I = snapPosition0;
        this.J = function40;
        this.K = v1;
        this.L = v2;
        this.M = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        PagerKt.VerticalPager-oI3XNZo(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, ((Composer)object0), (this.K | 1) & -920350135 | ((0x24924924 & (this.K | 1)) >> 1 | 306783378 & (this.K | 1)) | (306783378 & (this.K | 1)) << 1 & (0x24924924 & (this.K | 1)), this.L & -920350135 | ((0x24924924 & this.L) >> 1 | 306783378 & this.L) | (306783378 & this.L) << 1 & (0x24924924 & this.L), this.M);
        return Unit.INSTANCE;
    }
}

