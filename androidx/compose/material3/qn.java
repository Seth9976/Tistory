package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class qn extends Lambda implements Function2 {
    public final long A;
    public final Function3 B;
    public final Function2 C;
    public final Function2 D;
    public final int E;
    public final int F;
    public final int w;
    public final int x;
    public final Modifier y;
    public final long z;

    public qn(int v, Modifier modifier0, long v1, long v2, Function3 function30, Function2 function20, Function2 function21, int v3, int v4, int v5) {
        this.w = v5;
        this.x = v;
        this.y = modifier0;
        this.z = v1;
        this.A = v2;
        this.B = function30;
        this.C = function20;
        this.D = function21;
        this.E = v3;
        this.F = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                TabRowKt.PrimaryTabRow-pAZo6Ak(this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                TabRowKt.SecondaryTabRow-pAZo6Ak(this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object1).intValue();
                TabRowKt.TabRow-pAZo6Ak(this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                androidx.compose.material.TabRowKt.TabRow-pAZo6Ak(this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
                return Unit.INSTANCE;
            }
        }
    }
}

