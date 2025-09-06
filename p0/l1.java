package p0;

import androidx.compose.material.BottomNavigationKt;
import androidx.compose.material.NavigationRailKt;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class l1 extends Lambda implements Function2 {
    public final Function3 A;
    public final int B;
    public final int w;
    public final long x;
    public final long y;
    public final boolean z;

    public l1(long v, long v1, boolean z, Function3 function30, int v2, int v3) {
        this.w = v3;
        this.x = v;
        this.y = v1;
        this.z = z;
        this.A = function30;
        this.B = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            NavigationRailKt.a(this.x, this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)));
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        BottomNavigationKt.a(this.x, this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)));
        return Unit.INSTANCE;
    }
}

