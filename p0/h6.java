package p0;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class h6 extends Lambda implements Function2 {
    public final Function2 A;
    public final Function2 B;
    public final boolean C;
    public final float D;
    public final Function1 E;
    public final Function2 F;
    public final PaddingValues G;
    public final int H;
    public final int I;
    public final Modifier w;
    public final Function2 x;
    public final Function3 y;
    public final Function2 z;

    public h6(Modifier modifier0, Function2 function20, Function3 function30, Function2 function21, Function2 function22, Function2 function23, boolean z, float f, Function1 function10, Function2 function24, PaddingValues paddingValues0, int v, int v1) {
        this.w = modifier0;
        this.x = function20;
        this.y = function30;
        this.z = function21;
        this.A = function22;
        this.B = function23;
        this.C = z;
        this.D = f;
        this.E = function10;
        this.F = function24;
        this.G = paddingValues0;
        this.H = v;
        this.I = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        OutlinedTextFieldKt.OutlinedTextFieldLayout(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, ((Composer)object0), (this.H | 1) & -920350135 | ((0x24924924 & (this.H | 1)) >> 1 | 306783378 & (this.H | 1)) | (306783378 & (this.H | 1)) << 1 & (0x24924924 & (this.H | 1)), this.I & -920350135 | ((0x24924924 & this.I) >> 1 | 306783378 & this.I) | (306783378 & this.I) << 1 & (0x24924924 & this.I));
        return Unit.INSTANCE;
    }
}

