package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class da extends Lambda implements Function2 {
    public final boolean A;
    public final Function2 B;
    public final Function2 C;
    public final int D;
    public final NavigationItemColors E;
    public final MutableInteractionSource F;
    public final int G;
    public final int H;
    public final boolean w;
    public final Function0 x;
    public final Function2 y;
    public final Modifier z;

    public da(boolean z, Function0 function00, Function2 function20, Modifier modifier0, boolean z1, Function2 function21, Function2 function22, int v, NavigationItemColors navigationItemColors0, MutableInteractionSource mutableInteractionSource0, int v1, int v2) {
        this.w = z;
        this.x = function00;
        this.y = function20;
        this.z = modifier0;
        this.A = z1;
        this.B = function21;
        this.C = function22;
        this.D = v;
        this.E = navigationItemColors0;
        this.F = mutableInteractionSource0;
        this.G = v1;
        this.H = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        ExpressiveNavigationBarKt.ExpressiveNavigationBarItem-pli-t6k(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
        return Unit.INSTANCE;
    }
}

