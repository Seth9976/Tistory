package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class go extends Lambda implements Function2 {
    public final Function3 A;
    public final Function2 B;
    public final Function2 C;
    public final int D;
    public final int w;
    public final Modifier x;
    public final long y;
    public final long z;

    public go(Modifier modifier0, long v, long v1, Function3 function30, Function2 function20, Function2 function21, int v2, int v3) {
        this.w = v3;
        this.x = modifier0;
        this.y = v;
        this.z = v1;
        this.A = function30;
        this.B = function20;
        this.C = function21;
        this.D = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            TabRowKt.d(this.x, this.y, this.z, this.A, this.B, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)));
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        TabRowKt.c(this.x, this.y, this.z, this.A, this.B, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)));
        return Unit.INSTANCE;
    }
}

