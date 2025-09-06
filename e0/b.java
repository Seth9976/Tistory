package e0;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement.Horizontal;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function2 {
    public final boolean A;
    public final float B;
    public final Horizontal C;
    public final FlingBehavior D;
    public final boolean E;
    public final Function1 F;
    public final int G;
    public final int H;
    public final StaggeredGridCells w;
    public final Modifier x;
    public final LazyStaggeredGridState y;
    public final PaddingValues z;

    public b(StaggeredGridCells staggeredGridCells0, Modifier modifier0, LazyStaggeredGridState lazyStaggeredGridState0, PaddingValues paddingValues0, boolean z, float f, Horizontal arrangement$Horizontal0, FlingBehavior flingBehavior0, boolean z1, Function1 function10, int v, int v1) {
        this.w = staggeredGridCells0;
        this.x = modifier0;
        this.y = lazyStaggeredGridState0;
        this.z = paddingValues0;
        this.A = z;
        this.B = f;
        this.C = arrangement$Horizontal0;
        this.D = flingBehavior0;
        this.E = z1;
        this.F = function10;
        this.G = v;
        this.H = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        LazyStaggeredGridDslKt.LazyVerticalStaggeredGrid-zadm560(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
        return Unit.INSTANCE;
    }
}

