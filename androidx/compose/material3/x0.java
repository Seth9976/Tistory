package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class x0 extends Lambda implements Function2 {
    public final Function2 A;
    public final TextStyle B;
    public final Function2 C;
    public final Function3 D;
    public final float E;
    public final float F;
    public final WindowInsets G;
    public final TopAppBarColors H;
    public final TopAppBarScrollBehavior I;
    public final int J;
    public final int K;
    public final int L;
    public final Modifier w;
    public final Function2 x;
    public final TextStyle y;
    public final float z;

    public x0(Modifier modifier0, Function2 function20, TextStyle textStyle0, float f, Function2 function21, TextStyle textStyle1, Function2 function22, Function3 function30, float f1, float f2, WindowInsets windowInsets0, TopAppBarColors topAppBarColors0, TopAppBarScrollBehavior topAppBarScrollBehavior0, int v, int v1, int v2) {
        this.w = modifier0;
        this.x = function20;
        this.y = textStyle0;
        this.z = f;
        this.A = function21;
        this.B = textStyle1;
        this.C = function22;
        this.D = function30;
        this.E = f1;
        this.F = f2;
        this.G = windowInsets0;
        this.H = topAppBarColors0;
        this.I = topAppBarScrollBehavior0;
        this.J = v;
        this.K = v1;
        this.L = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        AppBarKt.b(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.J | 1), RecomposeScopeImplKt.updateChangedFlags(this.K), this.L);
        return Unit.INSTANCE;
    }
}

