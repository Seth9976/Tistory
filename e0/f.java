package e0;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function2 {
    public final PaddingValues A;
    public final boolean B;
    public final FlingBehavior C;
    public final boolean D;
    public final float E;
    public final float F;
    public final Function1 G;
    public final int H;
    public final int I;
    public final int J;
    public final LazyStaggeredGridState w;
    public final Orientation x;
    public final LazyGridStaggeredGridSlotsProvider y;
    public final Modifier z;

    public f(LazyStaggeredGridState lazyStaggeredGridState0, Orientation orientation0, LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider0, Modifier modifier0, PaddingValues paddingValues0, boolean z, FlingBehavior flingBehavior0, boolean z1, float f, float f1, Function1 function10, int v, int v1, int v2) {
        this.w = lazyStaggeredGridState0;
        this.x = orientation0;
        this.y = lazyGridStaggeredGridSlotsProvider0;
        this.z = modifier0;
        this.A = paddingValues0;
        this.B = z;
        this.C = flingBehavior0;
        this.D = z1;
        this.E = f;
        this.F = f1;
        this.G = function10;
        this.H = v;
        this.I = v1;
        this.J = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        LazyStaggeredGridKt.LazyStaggeredGrid-LJWHXA8(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, ((Composer)object0), (this.H | 1) & -920350135 | ((0x24924924 & (this.H | 1)) >> 1 | 306783378 & (this.H | 1)) | (306783378 & (this.H | 1)) << 1 & (0x24924924 & (this.H | 1)), this.I & -920350135 | ((0x24924924 & this.I) >> 1 | 306783378 & this.I) | (306783378 & this.I) << 1 & (0x24924924 & this.I), this.J);
        return Unit.INSTANCE;
    }
}

