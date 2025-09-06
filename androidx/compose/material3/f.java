package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function2 {
    public final Function2 A;
    public final Shape B;
    public final long C;
    public final float D;
    public final long E;
    public final long F;
    public final long G;
    public final long H;
    public final int I;
    public final int J;
    public final int K;
    public final Function2 w;
    public final Modifier x;
    public final Function2 y;
    public final Function2 z;

    public f(Function2 function20, Modifier modifier0, Function2 function21, Function2 function22, Function2 function23, Shape shape0, long v, float f, long v1, long v2, long v3, long v4, int v5, int v6, int v7) {
        this.w = function20;
        this.x = modifier0;
        this.y = function21;
        this.z = function22;
        this.A = function23;
        this.B = shape0;
        this.C = v;
        this.D = f;
        this.E = v1;
        this.F = v2;
        this.G = v3;
        this.H = v4;
        this.I = v5;
        this.J = v6;
        this.K = v7;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        AlertDialogKt.AlertDialogContent-4hvqGtA(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, ((Composer)object0), (this.I | 1) & -920350135 | ((0x24924924 & (this.I | 1)) >> 1 | 306783378 & (this.I | 1)) | (306783378 & (this.I | 1)) << 1 & (0x24924924 & (this.I | 1)), this.J & -920350135 | ((0x24924924 & this.J) >> 1 | 306783378 & this.J) | (306783378 & this.J) << 1 & (0x24924924 & this.J), this.K);
        return Unit.INSTANCE;
    }
}

