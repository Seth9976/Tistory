package androidx.compose.material3;

import androidx.compose.material.BadgeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class f1 extends Lambda implements Function2 {
    public final Function3 A;
    public final int B;
    public final int C;
    public final int w;
    public final Modifier x;
    public final long y;
    public final long z;

    public f1(Modifier modifier0, long v, long v1, Function3 function30, int v2, int v3, int v4) {
        this.w = v4;
        this.x = modifier0;
        this.y = v;
        this.z = v1;
        this.A = function30;
        this.B = v2;
        this.C = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            BadgeKt.Badge-eopBjH0(this.x, this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        androidx.compose.material3.BadgeKt.Badge-eopBjH0(this.x, this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
        return Unit.INSTANCE;
    }
}

