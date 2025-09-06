package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class gm extends Lambda implements Function2 {
    public final Shape A;
    public final long B;
    public final long C;
    public final long D;
    public final long E;
    public final Function2 F;
    public final int G;
    public final int H;
    public final Modifier w;
    public final Function2 x;
    public final Function2 y;
    public final boolean z;

    public gm(Modifier modifier0, Function2 function20, Function2 function21, boolean z, Shape shape0, long v, long v1, long v2, long v3, Function2 function22, int v4, int v5) {
        this.w = modifier0;
        this.x = function20;
        this.y = function21;
        this.z = z;
        this.A = shape0;
        this.B = v;
        this.C = v1;
        this.D = v2;
        this.E = v3;
        this.F = function22;
        this.G = v4;
        this.H = v5;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SnackbarKt.Snackbar-eQBnUkQ(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
        return Unit.INSTANCE;
    }
}

