package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class h0 extends Lambda implements Function2 {
    public final Function3 A;
    public final float B;
    public final WindowInsets C;
    public final TopAppBarColors D;
    public final TopAppBarScrollBehavior E;
    public final int F;
    public final int G;
    public final int w;
    public final Function2 x;
    public final Modifier y;
    public final Function2 z;

    public h0(Function2 function20, Modifier modifier0, Function2 function21, Function3 function30, float f, WindowInsets windowInsets0, TopAppBarColors topAppBarColors0, TopAppBarScrollBehavior topAppBarScrollBehavior0, int v, int v1, int v2) {
        this.w = v2;
        this.x = function20;
        this.y = modifier0;
        this.z = function21;
        this.A = function30;
        this.B = f;
        this.C = windowInsets0;
        this.D = topAppBarColors0;
        this.E = topAppBarScrollBehavior0;
        this.F = v;
        this.G = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            AppBarKt.TopAppBar-GHTll3U(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        AppBarKt.CenterAlignedTopAppBar-GHTll3U(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
        return Unit.INSTANCE;
    }
}

