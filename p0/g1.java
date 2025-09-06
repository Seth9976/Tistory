package p0;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.BottomNavigationKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g1 extends Lambda implements Function2 {
    public final Modifier A;
    public final boolean B;
    public final Function2 C;
    public final boolean D;
    public final MutableInteractionSource E;
    public final long F;
    public final long G;
    public final int H;
    public final int I;
    public final int J;
    public final RowScope w;
    public final boolean x;
    public final Function0 y;
    public final Function2 z;

    public g1(RowScope rowScope0, boolean z, Function0 function00, Function2 function20, Modifier modifier0, boolean z1, Function2 function21, boolean z2, MutableInteractionSource mutableInteractionSource0, long v, long v1, int v2, int v3, int v4) {
        this.w = rowScope0;
        this.x = z;
        this.y = function00;
        this.z = function20;
        this.A = modifier0;
        this.B = z1;
        this.C = function21;
        this.D = z2;
        this.E = mutableInteractionSource0;
        this.F = v;
        this.G = v1;
        this.H = v2;
        this.I = v3;
        this.J = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BottomNavigationKt.BottomNavigationItem-jY6E1Zs(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, ((Composer)object0), (this.H | 1) & -920350135 | ((0x24924924 & (this.H | 1)) >> 1 | 306783378 & (this.H | 1)) | (306783378 & (this.H | 1)) << 1 & (0x24924924 & (this.H | 1)), this.I & -920350135 | ((0x24924924 & this.I) >> 1 | 306783378 & this.I) | (306783378 & this.I) << 1 & (0x24924924 & this.I), this.J);
        return Unit.INSTANCE;
    }
}

