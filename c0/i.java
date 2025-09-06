package c0;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement.Horizontal;
import androidx.compose.foundation.layout.Arrangement.Vertical;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.LazyGridKt;
import androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function2 {
    public final boolean A;
    public final boolean B;
    public final FlingBehavior C;
    public final boolean D;
    public final Vertical E;
    public final Horizontal F;
    public final Function1 G;
    public final int H;
    public final int I;
    public final int J;
    public final Modifier w;
    public final LazyGridState x;
    public final LazyGridSlotsProvider y;
    public final PaddingValues z;

    public i(Modifier modifier0, LazyGridState lazyGridState0, LazyGridSlotsProvider lazyGridSlotsProvider0, PaddingValues paddingValues0, boolean z, boolean z1, FlingBehavior flingBehavior0, boolean z2, Vertical arrangement$Vertical0, Horizontal arrangement$Horizontal0, Function1 function10, int v, int v1, int v2) {
        this.w = modifier0;
        this.x = lazyGridState0;
        this.y = lazyGridSlotsProvider0;
        this.z = paddingValues0;
        this.A = z;
        this.B = z1;
        this.C = flingBehavior0;
        this.D = z2;
        this.E = arrangement$Vertical0;
        this.F = arrangement$Horizontal0;
        this.G = function10;
        this.H = v;
        this.I = v1;
        this.J = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        LazyGridKt.LazyGrid(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, ((Composer)object0), (this.H | 1) & -920350135 | ((0x24924924 & (this.H | 1)) >> 1 | 306783378 & (this.H | 1)) | (306783378 & (this.H | 1)) << 1 & (0x24924924 & (this.H | 1)), this.I & -920350135 | ((0x24924924 & this.I) >> 1 | 306783378 & this.I) | (306783378 & this.I) << 1 & (0x24924924 & this.I), this.J);
        return Unit.INSTANCE;
    }
}

