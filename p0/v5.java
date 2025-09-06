package p0;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material.NavigationRailKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class v5 extends Lambda implements Function2 {
    public final boolean A;
    public final Function2 B;
    public final boolean C;
    public final MutableInteractionSource D;
    public final long E;
    public final long F;
    public final int G;
    public final int H;
    public final boolean w;
    public final Function0 x;
    public final Function2 y;
    public final Modifier z;

    public v5(boolean z, Function0 function00, Function2 function20, Modifier modifier0, boolean z1, Function2 function21, boolean z2, MutableInteractionSource mutableInteractionSource0, long v, long v1, int v2, int v3) {
        this.w = z;
        this.x = function00;
        this.y = function20;
        this.z = modifier0;
        this.A = z1;
        this.B = function21;
        this.C = z2;
        this.D = mutableInteractionSource0;
        this.E = v;
        this.F = v1;
        this.G = v2;
        this.H = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        NavigationRailKt.NavigationRailItem-0S3VyRs(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
        return Unit.INSTANCE;
    }
}

