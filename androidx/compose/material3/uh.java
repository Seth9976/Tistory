package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class uh extends Lambda implements Function2 {
    public final int A;
    public final int B;
    public final int C;
    public final Function0 w;
    public final Modifier x;
    public final long y;
    public final long z;

    public uh(Function0 function00, Modifier modifier0, long v, long v1, int v2, int v3, int v4) {
        this.w = function00;
        this.x = modifier0;
        this.y = v;
        this.z = v1;
        this.A = v2;
        this.B = v3;
        this.C = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        ProgressIndicatorKt.LinearProgressIndicator-_5eSR-E(this.w, this.x, this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
        return Unit.INSTANCE;
    }
}

