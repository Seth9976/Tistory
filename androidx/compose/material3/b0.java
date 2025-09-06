package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class b0 extends Lambda implements Function2 {
    public final long A;
    public final float B;
    public final PaddingValues C;
    public final WindowInsets D;
    public final BottomAppBarScrollBehavior E;
    public final int F;
    public final int G;
    public final Function3 w;
    public final Modifier x;
    public final Function2 y;
    public final long z;

    public b0(Function3 function30, Modifier modifier0, Function2 function20, long v, long v1, float f, PaddingValues paddingValues0, WindowInsets windowInsets0, BottomAppBarScrollBehavior bottomAppBarScrollBehavior0, int v2, int v3) {
        this.w = function30;
        this.x = modifier0;
        this.y = function20;
        this.z = v;
        this.A = v1;
        this.B = f;
        this.C = paddingValues0;
        this.D = windowInsets0;
        this.E = bottomAppBarScrollBehavior0;
        this.F = v2;
        this.G = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        AppBarKt.BottomAppBar-qhFBPw4(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
        return Unit.INSTANCE;
    }
}

