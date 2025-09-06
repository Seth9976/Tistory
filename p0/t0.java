package p0;

import androidx.compose.material.BackdropScaffoldKt;
import androidx.compose.material.BackdropScaffoldState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class t0 extends Lambda implements Function2 {
    public final BackdropScaffoldState A;
    public final boolean B;
    public final float C;
    public final float D;
    public final boolean E;
    public final boolean F;
    public final long G;
    public final long H;
    public final Shape I;
    public final float J;
    public final long K;
    public final long L;
    public final long M;
    public final Function3 N;
    public final int O;
    public final int P;
    public final int Q;
    public final Function2 w;
    public final Function2 x;
    public final Function2 y;
    public final Modifier z;

    public t0(Function2 function20, Function2 function21, Function2 function22, Modifier modifier0, BackdropScaffoldState backdropScaffoldState0, boolean z, float f, float f1, boolean z1, boolean z2, long v, long v1, Shape shape0, float f2, long v2, long v3, long v4, Function3 function30, int v5, int v6, int v7) {
        this.w = function20;
        this.x = function21;
        this.y = function22;
        this.z = modifier0;
        this.A = backdropScaffoldState0;
        this.B = z;
        this.C = f;
        this.D = f1;
        this.E = z1;
        this.F = z2;
        this.G = v;
        this.H = v1;
        this.I = shape0;
        this.J = f2;
        this.K = v2;
        this.L = v3;
        this.M = v4;
        this.N = function30;
        this.O = v5;
        this.P = v6;
        this.Q = v7;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BackdropScaffoldKt.BackdropScaffold-BZszfkY(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, ((Composer)object0), (this.O | 1) & -920350135 | ((0x24924924 & (this.O | 1)) >> 1 | 306783378 & (this.O | 1)) | (306783378 & (this.O | 1)) << 1 & (0x24924924 & (this.O | 1)), this.P & -920350135 | ((0x24924924 & this.P) >> 1 | 306783378 & this.P) | (306783378 & this.P) << 1 & (0x24924924 & this.P), this.Q);
        return Unit.INSTANCE;
    }
}

