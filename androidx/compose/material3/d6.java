package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class d6 extends Lambda implements Function2 {
    public final float A;
    public final Function2 B;
    public final int C;
    public final Modifier w;
    public final Function2 x;
    public final long y;
    public final long z;

    public d6(Modifier modifier0, Function2 function20, long v, long v1, float f, Function2 function21, int v2) {
        this.w = modifier0;
        this.x = function20;
        this.y = v;
        this.z = v1;
        this.A = f;
        this.B = function21;
        this.C = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        DatePickerKt.DatePickerHeader-pc5RIQQ(this.w, this.x, this.y, this.z, this.A, this.B, ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)));
        return Unit.INSTANCE;
    }
}

