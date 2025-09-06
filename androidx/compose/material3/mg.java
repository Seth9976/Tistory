package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class mg extends Lambda implements Function2 {
    public final boolean A;
    public final Function2 B;
    public final boolean C;
    public final NavigationRailItemColors D;
    public final MutableInteractionSource E;
    public final int F;
    public final int G;
    public final boolean w;
    public final Function0 x;
    public final Function2 y;
    public final Modifier z;

    public mg(boolean z, Function0 function00, Function2 function20, Modifier modifier0, boolean z1, Function2 function21, boolean z2, NavigationRailItemColors navigationRailItemColors0, MutableInteractionSource mutableInteractionSource0, int v, int v1) {
        this.w = z;
        this.x = function00;
        this.y = function20;
        this.z = modifier0;
        this.A = z1;
        this.B = function21;
        this.C = z2;
        this.D = navigationRailItemColors0;
        this.E = mutableInteractionSource0;
        this.F = v;
        this.G = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        NavigationRailKt.NavigationRailItem(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
        return Unit.INSTANCE;
    }
}

