package p0;

import androidx.compose.material.SnackbarKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class f9 extends Lambda implements Function2 {
    public final long A;
    public final long B;
    public final float C;
    public final Function2 D;
    public final int E;
    public final int F;
    public final Modifier w;
    public final Function2 x;
    public final boolean y;
    public final Shape z;

    public f9(Modifier modifier0, Function2 function20, boolean z, Shape shape0, long v, long v1, float f, Function2 function21, int v2, int v3) {
        this.w = modifier0;
        this.x = function20;
        this.y = z;
        this.z = shape0;
        this.A = v;
        this.B = v1;
        this.C = f;
        this.D = function21;
        this.E = v2;
        this.F = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SnackbarKt.Snackbar-7zSek6w(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
        return Unit.INSTANCE;
    }
}

