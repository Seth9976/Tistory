package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class u3 extends Lambda implements Function2 {
    public final Function2 A;
    public final Function2 B;
    public final long C;
    public final long D;
    public final float E;
    public final PaddingValues F;
    public final int G;
    public final Function2 w;
    public final TextStyle x;
    public final long y;
    public final Function2 z;

    public u3(Function2 function20, TextStyle textStyle0, long v, Function2 function21, Function2 function22, Function2 function23, long v1, long v2, float f, PaddingValues paddingValues0, int v3) {
        this.w = function20;
        this.x = textStyle0;
        this.y = v;
        this.z = function21;
        this.A = function22;
        this.B = function23;
        this.C = v1;
        this.D = v2;
        this.E = f;
        this.F = paddingValues0;
        this.G = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        ChipKt.access$ChipContent-fe0OD_I(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)));
        return Unit.INSTANCE;
    }
}

