package p0;

import androidx.compose.material.BottomSheetScaffoldKt;
import androidx.compose.material.BottomSheetScaffoldState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class w1 extends Lambda implements Function2 {
    public final Function3 A;
    public final Function2 B;
    public final int C;
    public final boolean D;
    public final Shape E;
    public final float F;
    public final long G;
    public final long H;
    public final float I;
    public final long J;
    public final long K;
    public final Function3 L;
    public final int M;
    public final int N;
    public final int O;
    public final Function3 w;
    public final Modifier x;
    public final BottomSheetScaffoldState y;
    public final Function2 z;

    public w1(Function3 function30, Modifier modifier0, BottomSheetScaffoldState bottomSheetScaffoldState0, Function2 function20, Function3 function31, Function2 function21, int v, boolean z, Shape shape0, float f, long v1, long v2, float f1, long v3, long v4, Function3 function32, int v5, int v6, int v7) {
        this.w = function30;
        this.x = modifier0;
        this.y = bottomSheetScaffoldState0;
        this.z = function20;
        this.A = function31;
        this.B = function21;
        this.C = v;
        this.D = z;
        this.E = shape0;
        this.F = f;
        this.G = v1;
        this.H = v2;
        this.I = f1;
        this.J = v3;
        this.K = v4;
        this.L = function32;
        this.M = v5;
        this.N = v6;
        this.O = v7;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BottomSheetScaffoldKt.BottomSheetScaffold-HnlDQGw(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, ((Composer)object0), (this.M | 1) & -920350135 | ((0x24924924 & (this.M | 1)) >> 1 | 306783378 & (this.M | 1)) | (306783378 & (this.M | 1)) << 1 & (0x24924924 & (this.M | 1)), this.N & -920350135 | ((0x24924924 & this.N) >> 1 | 306783378 & this.N) | (306783378 & this.N) << 1 & (0x24924924 & this.N), this.O);
        return Unit.INSTANCE;
    }
}

