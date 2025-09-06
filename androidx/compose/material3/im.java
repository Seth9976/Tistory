package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class im extends Lambda implements Function2 {
    public final long A;
    public final long B;
    public final long C;
    public final long D;
    public final long E;
    public final int F;
    public final int G;
    public final SnackbarData w;
    public final Modifier x;
    public final boolean y;
    public final Shape z;

    public im(SnackbarData snackbarData0, Modifier modifier0, boolean z, Shape shape0, long v, long v1, long v2, long v3, long v4, int v5, int v6) {
        this.w = snackbarData0;
        this.x = modifier0;
        this.y = z;
        this.z = shape0;
        this.A = v;
        this.B = v1;
        this.C = v2;
        this.D = v3;
        this.E = v4;
        this.F = v5;
        this.G = v6;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SnackbarKt.Snackbar-sDKtq54(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
        return Unit.INSTANCE;
    }
}

