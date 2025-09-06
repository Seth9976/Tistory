package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class hh extends Lambda implements Function2 {
    public final long A;
    public final int B;
    public final int C;
    public final int D;
    public final Function0 w;
    public final Modifier x;
    public final long y;
    public final float z;

    public hh(Function0 function00, Modifier modifier0, long v, float f, long v1, int v2, int v3, int v4) {
        this.w = function00;
        this.x = modifier0;
        this.y = v;
        this.z = f;
        this.A = v1;
        this.B = v2;
        this.C = v3;
        this.D = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        ProgressIndicatorKt.CircularProgressIndicator-DUhRLBM(this.w, this.x, this.y, this.z, this.A, this.B, ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)), this.D);
        return Unit.INSTANCE;
    }
}

