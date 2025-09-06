package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material.TabKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class fn extends Lambda implements Function2 {
    public final boolean A;
    public final MutableInteractionSource B;
    public final long C;
    public final long D;
    public final Function3 E;
    public final int F;
    public final int G;
    public final int w;
    public final boolean x;
    public final Function0 y;
    public final Modifier z;

    public fn(boolean z, Function0 function00, Modifier modifier0, boolean z1, long v, long v1, MutableInteractionSource mutableInteractionSource0, Function3 function30, int v2, int v3) {
        this.w = 0;
        this.x = z;
        this.y = function00;
        this.z = modifier0;
        this.A = z1;
        this.C = v;
        this.D = v1;
        this.B = mutableInteractionSource0;
        this.E = function30;
        this.F = v2;
        this.G = v3;
        super(2);
    }

    public fn(boolean z, Function0 function00, Modifier modifier0, boolean z1, MutableInteractionSource mutableInteractionSource0, long v, long v1, Function3 function30, int v2, int v3) {
        this.w = 1;
        this.x = z;
        this.y = function00;
        this.z = modifier0;
        this.A = z1;
        this.B = mutableInteractionSource0;
        this.C = v;
        this.D = v1;
        this.E = function30;
        this.F = v2;
        this.G = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            TabKt.Tab-EVJuX4I(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        androidx.compose.material3.TabKt.Tab-bogVsAg(this.x, this.y, this.z, this.A, this.C, this.D, this.B, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
        return Unit.INSTANCE;
    }
}

