package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.DialogProperties;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function2 {
    public final Function2 A;
    public final Function2 B;
    public final Function2 C;
    public final Shape D;
    public final long E;
    public final long F;
    public final long G;
    public final long H;
    public final float I;
    public final DialogProperties J;
    public final int K;
    public final int L;
    public final Function0 w;
    public final Function2 x;
    public final Modifier y;
    public final Function2 z;

    public l(Function0 function00, Function2 function20, Modifier modifier0, Function2 function21, Function2 function22, Function2 function23, Function2 function24, Shape shape0, long v, long v1, long v2, long v3, float f, DialogProperties dialogProperties0, int v4, int v5) {
        this.w = function00;
        this.x = function20;
        this.y = modifier0;
        this.z = function21;
        this.A = function22;
        this.B = function23;
        this.C = function24;
        this.D = shape0;
        this.E = v;
        this.F = v1;
        this.G = v2;
        this.H = v3;
        this.I = f;
        this.J = dialogProperties0;
        this.K = v4;
        this.L = v5;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        AlertDialogKt.AlertDialogImpl-wrnwzgE(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, ((Composer)object0), (this.K | 1) & -920350135 | ((0x24924924 & (this.K | 1)) >> 1 | 306783378 & (this.K | 1)) | (306783378 & (this.K | 1)) << 1 & (0x24924924 & (this.K | 1)), this.L & -920350135 | ((0x24924924 & this.L) >> 1 | 306783378 & this.L) | (306783378 & this.L) << 1 & (0x24924924 & this.L));
        return Unit.INSTANCE;
    }
}

