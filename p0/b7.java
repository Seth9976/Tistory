package p0;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.ScaffoldState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class b7 extends Lambda implements Function2 {
    public final Function2 A;
    public final Function3 B;
    public final Function2 C;
    public final int D;
    public final boolean E;
    public final Function3 F;
    public final boolean G;
    public final Shape H;
    public final float I;
    public final long J;
    public final long K;
    public final long L;
    public final long M;
    public final long N;
    public final Function3 O;
    public final int P;
    public final int Q;
    public final int R;
    public final WindowInsets w;
    public final Modifier x;
    public final ScaffoldState y;
    public final Function2 z;

    public b7(WindowInsets windowInsets0, Modifier modifier0, ScaffoldState scaffoldState0, Function2 function20, Function2 function21, Function3 function30, Function2 function22, int v, boolean z, Function3 function31, boolean z1, Shape shape0, float f, long v1, long v2, long v3, long v4, long v5, Function3 function32, int v6, int v7, int v8) {
        this.w = windowInsets0;
        this.x = modifier0;
        this.y = scaffoldState0;
        this.z = function20;
        this.A = function21;
        this.B = function30;
        this.C = function22;
        this.D = v;
        this.E = z;
        this.F = function31;
        this.G = z1;
        this.H = shape0;
        this.I = f;
        this.J = v1;
        this.K = v2;
        this.L = v3;
        this.M = v4;
        this.N = v5;
        this.O = function32;
        this.P = v6;
        this.Q = v7;
        this.R = v8;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        ScaffoldKt.Scaffold-u4IkXBM(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, ((Composer)object0), (this.P | 1) & -920350135 | ((0x24924924 & (this.P | 1)) >> 1 | 306783378 & (this.P | 1)) | (306783378 & (this.P | 1)) << 1 & (0x24924924 & (this.P | 1)), this.Q & -920350135 | ((0x24924924 & this.Q) >> 1 | 306783378 & this.Q) | (306783378 & this.Q) << 1 & (0x24924924 & this.Q), this.R);
        return Unit.INSTANCE;
    }
}

