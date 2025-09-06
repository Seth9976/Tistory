package u;

import androidx.compose.foundation.AndroidExternalSurface_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function2 {
    public final Function1 A;
    public final int B;
    public final int C;
    public final Modifier w;
    public final boolean x;
    public final long y;
    public final float[] z;

    public q(Modifier modifier0, boolean z, long v, float[] arr_f, Function1 function10, int v1, int v2) {
        this.w = modifier0;
        this.x = z;
        this.y = v;
        this.z = arr_f;
        this.A = function10;
        this.B = v1;
        this.C = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        AndroidExternalSurface_androidKt.AndroidEmbeddedExternalSurface-sv6N_fY(this.w, this.x, this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
        return Unit.INSTANCE;
    }
}

