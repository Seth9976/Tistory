package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class so extends Lambda implements Function2 {
    public final Function2 A;
    public final Function2 B;
    public final Function2 C;
    public final Function2 D;
    public final boolean E;
    public final float F;
    public final Function2 G;
    public final Function2 H;
    public final PaddingValues I;
    public final int J;
    public final int K;
    public final Modifier w;
    public final Function2 x;
    public final Function2 y;
    public final Function3 z;

    public so(Modifier modifier0, Function2 function20, Function2 function21, Function3 function30, Function2 function22, Function2 function23, Function2 function24, Function2 function25, boolean z, float f, Function2 function26, Function2 function27, PaddingValues paddingValues0, int v, int v1) {
        this.w = modifier0;
        this.x = function20;
        this.y = function21;
        this.z = function30;
        this.A = function22;
        this.B = function23;
        this.C = function24;
        this.D = function25;
        this.E = z;
        this.F = f;
        this.G = function26;
        this.H = function27;
        this.I = paddingValues0;
        this.J = v;
        this.K = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        TextFieldKt.TextFieldLayout(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, ((Composer)object0), (this.J | 1) & -920350135 | ((0x24924924 & (this.J | 1)) >> 1 | 306783378 & (this.J | 1)) | (306783378 & (this.J | 1)) << 1 & (0x24924924 & (this.J | 1)), this.K & -920350135 | ((0x24924924 & this.K) >> 1 | 306783378 & this.K) | (306783378 & this.K) << 1 & (0x24924924 & this.K));
        return Unit.INSTANCE;
    }
}

