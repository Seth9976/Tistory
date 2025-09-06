package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class jg extends Lambda implements Function2 {
    public final WindowInsets A;
    public final Function3 B;
    public final int C;
    public final int D;
    public final Modifier w;
    public final long x;
    public final long y;
    public final Function3 z;

    public jg(Modifier modifier0, long v, long v1, Function3 function30, WindowInsets windowInsets0, Function3 function31, int v2, int v3) {
        this.w = modifier0;
        this.x = v;
        this.y = v1;
        this.z = function30;
        this.A = windowInsets0;
        this.B = function31;
        this.C = v2;
        this.D = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        NavigationRailKt.NavigationRail-qi6gXK8(this.w, this.x, this.y, this.z, this.A, this.B, ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)), this.D);
        return Unit.INSTANCE;
    }
}

