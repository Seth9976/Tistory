package b0;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement.Vertical;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function2 {
    public final boolean A;
    public final FlingBehavior B;
    public final boolean C;
    public final int D;
    public final Horizontal E;
    public final Vertical F;
    public final androidx.compose.ui.Alignment.Vertical G;
    public final androidx.compose.foundation.layout.Arrangement.Horizontal H;
    public final Function1 I;
    public final int J;
    public final int K;
    public final int L;
    public final Modifier w;
    public final LazyListState x;
    public final PaddingValues y;
    public final boolean z;

    public i(Modifier modifier0, LazyListState lazyListState0, PaddingValues paddingValues0, boolean z, boolean z1, FlingBehavior flingBehavior0, boolean z2, int v, Horizontal alignment$Horizontal0, Vertical arrangement$Vertical0, androidx.compose.ui.Alignment.Vertical alignment$Vertical0, androidx.compose.foundation.layout.Arrangement.Horizontal arrangement$Horizontal0, Function1 function10, int v1, int v2, int v3) {
        this.w = modifier0;
        this.x = lazyListState0;
        this.y = paddingValues0;
        this.z = z;
        this.A = z1;
        this.B = flingBehavior0;
        this.C = z2;
        this.D = v;
        this.E = alignment$Horizontal0;
        this.F = arrangement$Vertical0;
        this.G = alignment$Vertical0;
        this.H = arrangement$Horizontal0;
        this.I = function10;
        this.J = v1;
        this.K = v2;
        this.L = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        LazyListKt.LazyList(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, ((Composer)object0), (this.J | 1) & -920350135 | ((0x24924924 & (this.J | 1)) >> 1 | 306783378 & (this.J | 1)) | (306783378 & (this.J | 1)) << 1 & (0x24924924 & (this.J | 1)), this.K & -920350135 | ((0x24924924 & this.K) >> 1 | 306783378 & this.K) | (306783378 & this.K) << 1 & (0x24924924 & this.K), this.L);
        return Unit.INSTANCE;
    }
}

