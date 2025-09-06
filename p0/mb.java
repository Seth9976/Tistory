package p0;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.TextFieldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class mb extends Lambda implements Function2 {
    public final Function2 A;
    public final Function2 B;
    public final boolean C;
    public final float D;
    public final PaddingValues E;
    public final int F;
    public final Modifier w;
    public final Function2 x;
    public final Function2 y;
    public final Function3 z;

    public mb(Modifier modifier0, Function2 function20, Function2 function21, Function3 function30, Function2 function22, Function2 function23, boolean z, float f, PaddingValues paddingValues0, int v) {
        this.w = modifier0;
        this.x = function20;
        this.y = function21;
        this.z = function30;
        this.A = function22;
        this.B = function23;
        this.C = z;
        this.D = f;
        this.E = paddingValues0;
        this.F = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        TextFieldKt.TextFieldLayout(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)));
        return Unit.INSTANCE;
    }
}

