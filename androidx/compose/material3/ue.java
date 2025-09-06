package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class ue extends Lambda implements Function2 {
    public final Function2 A;
    public final boolean B;
    public final Function0 C;
    public final int D;
    public final int w;
    public final Function2 x;
    public final Function2 y;
    public final Function2 z;

    public ue(Function2 function20, Function2 function21, Function2 function22, Function2 function23, boolean z, Function0 function00, int v, int v1) {
        this.w = v1;
        this.x = function20;
        this.y = function21;
        this.z = function22;
        this.A = function23;
        this.B = z;
        this.C = function00;
        this.D = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            NavigationRailKt.a(this.x, this.y, this.z, this.A, this.B, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)));
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        NavigationBarKt.a(this.x, this.y, this.z, this.A, this.B, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)));
        return Unit.INSTANCE;
    }
}

