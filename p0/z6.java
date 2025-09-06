package p0;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class z6 extends Lambda implements Function2 {
    public final Function3 A;
    public final Function2 B;
    public final Function2 C;
    public final WindowInsets D;
    public final Function2 E;
    public final int F;
    public final int w;
    public final boolean x;
    public final int y;
    public final Function2 z;

    public z6(boolean z, int v, Function2 function20, Function3 function30, Function2 function21, Function2 function22, WindowInsets windowInsets0, Function2 function23, int v1, int v2) {
        this.w = v2;
        this.x = z;
        this.y = v;
        this.z = function20;
        this.A = function30;
        this.B = function21;
        this.C = function22;
        this.D = windowInsets0;
        this.E = function23;
        this.F = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                ScaffoldKt.a(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)));
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                ScaffoldKt.access$ScaffoldLayout-i1QSOvI(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)));
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                ScaffoldKt.b(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)));
                return Unit.INSTANCE;
            }
        }
    }
}

