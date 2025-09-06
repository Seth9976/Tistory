package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class ca extends Lambda implements Function2 {
    public final int A;
    public final Function2 B;
    public final int C;
    public final int D;
    public final Modifier w;
    public final long x;
    public final long y;
    public final WindowInsets z;

    public ca(Modifier modifier0, long v, long v1, WindowInsets windowInsets0, int v2, Function2 function20, int v3, int v4) {
        this.w = modifier0;
        this.x = v;
        this.y = v1;
        this.z = windowInsets0;
        this.A = v2;
        this.B = function20;
        this.C = v3;
        this.D = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        ExpressiveNavigationBarKt.ExpressiveNavigationBar-NiJtXQ4(this.w, this.x, this.y, this.z, this.A, this.B, ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)), this.D);
        return Unit.INSTANCE;
    }
}

