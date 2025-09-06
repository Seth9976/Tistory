package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class jh extends Lambda implements Function2 {
    public final long A;
    public final int B;
    public final float C;
    public final int D;
    public final int E;
    public final Function0 w;
    public final Modifier x;
    public final long y;
    public final float z;

    public jh(Function0 function00, Modifier modifier0, long v, float f, long v1, int v2, float f1, int v3, int v4) {
        this.w = function00;
        this.x = modifier0;
        this.y = v;
        this.z = f;
        this.A = v1;
        this.B = v2;
        this.C = f1;
        this.D = v3;
        this.E = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        ProgressIndicatorKt.CircularProgressIndicator-IyT6zlY(this.w, this.x, this.y, this.z, this.A, this.B, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
        return Unit.INSTANCE;
    }
}

