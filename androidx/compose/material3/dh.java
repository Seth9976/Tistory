package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class dh extends Lambda implements Function2 {
    public final Function2 A;
    public final Function2 B;
    public final Function2 C;
    public final Function2 D;
    public final boolean E;
    public final float F;
    public final Function1 G;
    public final Function2 H;
    public final Function2 I;
    public final PaddingValues J;
    public final int K;
    public final int L;
    public final Modifier w;
    public final Function2 x;
    public final Function3 y;
    public final Function2 z;

    public dh(Modifier modifier0, Function2 function20, Function3 function30, Function2 function21, Function2 function22, Function2 function23, Function2 function24, Function2 function25, boolean z, float f, Function1 function10, Function2 function26, Function2 function27, PaddingValues paddingValues0, int v, int v1) {
        this.w = modifier0;
        this.x = function20;
        this.y = function30;
        this.z = function21;
        this.A = function22;
        this.B = function23;
        this.C = function24;
        this.D = function25;
        this.E = z;
        this.F = f;
        this.G = function10;
        this.H = function26;
        this.I = function27;
        this.J = paddingValues0;
        this.K = v;
        this.L = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        OutlinedTextFieldKt.OutlinedTextFieldLayout(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, ((Composer)object0), (this.K | 1) & -920350135 | ((0x24924924 & (this.K | 1)) >> 1 | 306783378 & (this.K | 1)) | (306783378 & (this.K | 1)) << 1 & (0x24924924 & (this.K | 1)), RecomposeScopeImplKt.updateChangedFlags(this.L));
        return Unit.INSTANCE;
    }
}

