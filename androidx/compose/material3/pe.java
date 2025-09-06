package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class pe extends Lambda implements Function2 {
    public final Modifier A;
    public final boolean B;
    public final Function2 C;
    public final boolean D;
    public final NavigationBarItemColors E;
    public final MutableInteractionSource F;
    public final int G;
    public final int H;
    public final RowScope w;
    public final boolean x;
    public final Function0 y;
    public final Function2 z;

    public pe(RowScope rowScope0, boolean z, Function0 function00, Function2 function20, Modifier modifier0, boolean z1, Function2 function21, boolean z2, NavigationBarItemColors navigationBarItemColors0, MutableInteractionSource mutableInteractionSource0, int v, int v1) {
        this.w = rowScope0;
        this.x = z;
        this.y = function00;
        this.z = function20;
        this.A = modifier0;
        this.B = z1;
        this.C = function21;
        this.D = z2;
        this.E = navigationBarItemColors0;
        this.F = mutableInteractionSource0;
        this.G = v;
        this.H = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        NavigationBarKt.NavigationBarItem(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
        return Unit.INSTANCE;
    }
}

