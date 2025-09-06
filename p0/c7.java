package p0;

import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.ScaffoldState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class c7 extends Lambda implements Function2 {
    public final Function3 A;
    public final Function2 B;
    public final int C;
    public final boolean D;
    public final Function3 E;
    public final boolean F;
    public final Shape G;
    public final float H;
    public final long I;
    public final long J;
    public final long K;
    public final long L;
    public final long M;
    public final Function3 N;
    public final int O;
    public final int P;
    public final int Q;
    public final Modifier w;
    public final ScaffoldState x;
    public final Function2 y;
    public final Function2 z;

    public c7(Modifier modifier0, ScaffoldState scaffoldState0, Function2 function20, Function2 function21, Function3 function30, Function2 function22, int v, boolean z, Function3 function31, boolean z1, Shape shape0, float f, long v1, long v2, long v3, long v4, long v5, Function3 function32, int v6, int v7, int v8) {
        this.w = modifier0;
        this.x = scaffoldState0;
        this.y = function20;
        this.z = function21;
        this.A = function30;
        this.B = function22;
        this.C = v;
        this.D = z;
        this.E = function31;
        this.F = z1;
        this.G = shape0;
        this.H = f;
        this.I = v1;
        this.J = v2;
        this.K = v3;
        this.L = v4;
        this.M = v5;
        this.N = function32;
        this.O = v6;
        this.P = v7;
        this.Q = v8;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        ScaffoldKt.Scaffold-27mzLpw(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, ((Composer)object0), (this.O | 1) & -920350135 | ((0x24924924 & (this.O | 1)) >> 1 | 306783378 & (this.O | 1)) | (306783378 & (this.O | 1)) << 1 & (0x24924924 & (this.O | 1)), this.P & -920350135 | ((0x24924924 & this.P) >> 1 | 306783378 & this.P) | (306783378 & this.P) << 1 & (0x24924924 & this.P), this.Q);
        return Unit.INSTANCE;
    }
}

