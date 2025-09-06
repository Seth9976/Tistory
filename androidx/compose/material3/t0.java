package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement.Horizontal;
import androidx.compose.foundation.layout.Arrangement.Vertical;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class t0 extends Lambda implements Function2 {
    public final long A;
    public final Function2 B;
    public final TextStyle C;
    public final float D;
    public final Vertical E;
    public final Horizontal F;
    public final int G;
    public final boolean H;
    public final Function2 I;
    public final Function2 J;
    public final int K;
    public final int L;
    public final Modifier w;
    public final ScrolledOffset x;
    public final long y;
    public final long z;

    public t0(Modifier modifier0, ScrolledOffset scrolledOffset0, long v, long v1, long v2, Function2 function20, TextStyle textStyle0, float f, Vertical arrangement$Vertical0, Horizontal arrangement$Horizontal0, int v3, boolean z, Function2 function21, Function2 function22, int v4, int v5) {
        this.w = modifier0;
        this.x = scrolledOffset0;
        this.y = v;
        this.z = v1;
        this.A = v2;
        this.B = function20;
        this.C = textStyle0;
        this.D = f;
        this.E = arrangement$Vertical0;
        this.F = arrangement$Horizontal0;
        this.G = v3;
        this.H = z;
        this.I = function21;
        this.J = function22;
        this.K = v4;
        this.L = v5;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        AppBarKt.access$TopAppBarLayout-kXwM9vE(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, ((Composer)object0), (this.K | 1) & -920350135 | ((0x24924924 & (this.K | 1)) >> 1 | 306783378 & (this.K | 1)) | (306783378 & (this.K | 1)) << 1 & (0x24924924 & (this.K | 1)), this.L & -920350135 | ((0x24924924 & this.L) >> 1 | 306783378 & this.L) | (306783378 & this.L) << 1 & (0x24924924 & this.L));
        return Unit.INSTANCE;
    }
}

