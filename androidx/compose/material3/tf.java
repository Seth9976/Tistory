package androidx.compose.material3;

import androidx.compose.material.DrawerKt;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class tf extends Lambda implements Function2 {
    public final long A;
    public final int B;
    public final int w;
    public final boolean x;
    public final Function0 y;
    public final Function0 z;

    public tf(boolean z, Function0 function00, Function0 function01, long v, int v1, int v2) {
        this.w = v2;
        this.x = z;
        this.y = function00;
        this.z = function01;
        this.A = v;
        this.B = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            DrawerKt.access$Scrim-Bx497Mc(this.x, this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)));
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        NavigationDrawerKt.a(this.x, this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)));
        return Unit.INSTANCE;
    }
}

