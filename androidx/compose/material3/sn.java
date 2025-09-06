package androidx.compose.material3;

import androidx.compose.material.TabRowKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class sn extends Lambda implements Function2 {
    public final long A;
    public final float B;
    public final Function3 C;
    public final Function2 D;
    public final Function2 E;
    public final int F;
    public final int G;
    public final int w;
    public final int x;
    public final Modifier y;
    public final long z;

    public sn(int v, Modifier modifier0, long v1, long v2, float f, Function3 function30, Function2 function20, Function2 function21, int v3, int v4, int v5) {
        this.w = v5;
        this.x = v;
        this.y = modifier0;
        this.z = v1;
        this.A = v2;
        this.B = f;
        this.C = function30;
        this.D = function20;
        this.E = function21;
        this.F = v3;
        this.G = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            TabRowKt.ScrollableTabRow-sKfQg0A(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        androidx.compose.material3.TabRowKt.ScrollableTabRow-sKfQg0A(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
        return Unit.INSTANCE;
    }
}

