package p0;

import androidx.compose.material.BottomNavigationKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class e1 extends Lambda implements Function2 {
    public final Function3 A;
    public final int B;
    public final int C;
    public final Modifier w;
    public final long x;
    public final long y;
    public final float z;

    public e1(Modifier modifier0, long v, long v1, float f, Function3 function30, int v2, int v3) {
        this.w = modifier0;
        this.x = v;
        this.y = v1;
        this.z = f;
        this.A = function30;
        this.B = v2;
        this.C = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BottomNavigationKt.BottomNavigation-PEIptTM(this.w, this.x, this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
        return Unit.INSTANCE;
    }
}

