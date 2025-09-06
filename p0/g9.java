package p0;

import androidx.compose.material.SnackbarData;
import androidx.compose.material.SnackbarKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g9 extends Lambda implements Function2 {
    public final long A;
    public final long B;
    public final long C;
    public final float D;
    public final int E;
    public final int F;
    public final SnackbarData w;
    public final Modifier x;
    public final boolean y;
    public final Shape z;

    public g9(SnackbarData snackbarData0, Modifier modifier0, boolean z, Shape shape0, long v, long v1, long v2, float f, int v3, int v4) {
        this.w = snackbarData0;
        this.x = modifier0;
        this.y = z;
        this.z = shape0;
        this.A = v;
        this.B = v1;
        this.C = v2;
        this.D = f;
        this.E = v3;
        this.F = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SnackbarKt.Snackbar-sPrSdHI(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
        return Unit.INSTANCE;
    }
}

