package androidx.compose.material3;

import androidx.compose.material.TabKt;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class jn extends Lambda implements Function2 {
    public final Function2 A;
    public final int B;
    public final int w;
    public final long x;
    public final long y;
    public final boolean z;

    public jn(long v, long v1, boolean z, Function2 function20, int v2, int v3) {
        this.w = v3;
        this.x = v;
        this.y = v1;
        this.z = z;
        this.A = function20;
        this.B = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            TabKt.a(this.x, this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)));
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        androidx.compose.material3.TabKt.a(this.x, this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)));
        return Unit.INSTANCE;
    }
}

