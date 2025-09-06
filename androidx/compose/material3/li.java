package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class li extends Lambda implements Function2 {
    public final Function2 A;
    public final int B;
    public final long C;
    public final long D;
    public final WindowInsets E;
    public final Function3 F;
    public final int G;
    public final int H;
    public final Modifier w;
    public final Function2 x;
    public final Function2 y;
    public final Function2 z;

    public li(Modifier modifier0, Function2 function20, Function2 function21, Function2 function22, Function2 function23, int v, long v1, long v2, WindowInsets windowInsets0, Function3 function30, int v3, int v4) {
        this.w = modifier0;
        this.x = function20;
        this.y = function21;
        this.z = function22;
        this.A = function23;
        this.B = v;
        this.C = v1;
        this.D = v2;
        this.E = windowInsets0;
        this.F = function30;
        this.G = v3;
        this.H = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        ScaffoldKt.Scaffold-TvnljyQ(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
        return Unit.INSTANCE;
    }
}

