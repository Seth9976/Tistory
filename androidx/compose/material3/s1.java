package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class s1 extends Lambda implements Function2 {
    public final float A;
    public final Shape B;
    public final long C;
    public final long D;
    public final float E;
    public final float F;
    public final Function2 G;
    public final boolean H;
    public final Function2 I;
    public final Function3 J;
    public final long K;
    public final long L;
    public final Function3 M;
    public final int N;
    public final int O;
    public final int P;
    public final Function3 w;
    public final Modifier x;
    public final BottomSheetScaffoldState y;
    public final float z;

    public s1(Function3 function30, Modifier modifier0, BottomSheetScaffoldState bottomSheetScaffoldState0, float f, float f1, Shape shape0, long v, long v1, float f2, float f3, Function2 function20, boolean z, Function2 function21, Function3 function31, long v2, long v3, Function3 function32, int v4, int v5, int v6) {
        this.w = function30;
        this.x = modifier0;
        this.y = bottomSheetScaffoldState0;
        this.z = f;
        this.A = f1;
        this.B = shape0;
        this.C = v;
        this.D = v1;
        this.E = f2;
        this.F = f3;
        this.G = function20;
        this.H = z;
        this.I = function21;
        this.J = function31;
        this.K = v2;
        this.L = v3;
        this.M = function32;
        this.N = v4;
        this.O = v5;
        this.P = v6;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BottomSheetScaffoldKt.BottomSheetScaffold-sdMYb0k(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, ((Composer)object0), (this.N | 1) & -920350135 | ((0x24924924 & (this.N | 1)) >> 1 | 306783378 & (this.N | 1)) | (306783378 & (this.N | 1)) << 1 & (0x24924924 & (this.N | 1)), this.O & -920350135 | ((0x24924924 & this.O) >> 1 | 306783378 & this.O) | (306783378 & this.O) << 1 & (0x24924924 & this.O), this.P);
        return Unit.INSTANCE;
    }
}

