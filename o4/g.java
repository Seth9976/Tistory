package o4;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavHostKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function2 {
    public final String A;
    public final Function1 B;
    public final Function1 C;
    public final Function1 D;
    public final Function1 E;
    public final Function1 F;
    public final Function1 G;
    public final int H;
    public final int I;
    public final int J;
    public final NavHostController w;
    public final String x;
    public final Modifier y;
    public final Alignment z;

    public g(NavHostController navHostController0, String s, Modifier modifier0, Alignment alignment0, String s1, Function1 function10, Function1 function11, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int v, int v1, int v2) {
        this.w = navHostController0;
        this.x = s;
        this.y = modifier0;
        this.z = alignment0;
        this.A = s1;
        this.B = function10;
        this.C = function11;
        this.D = function12;
        this.E = function13;
        this.F = function14;
        this.G = function15;
        this.H = v;
        this.I = v1;
        this.J = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        NavHostKt.NavHost(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, ((Composer)object0), (this.H | 1) & -920350135 | ((0x24924924 & (this.H | 1)) >> 1 | 306783378 & (this.H | 1)) | (306783378 & (this.H | 1)) << 1 & (0x24924924 & (this.H | 1)), this.I & -920350135 | ((0x24924924 & this.I) >> 1 | 306783378 & this.I) | (306783378 & this.I) << 1 & (0x24924924 & this.I), this.J);
        return Unit.INSTANCE;
    }
}

