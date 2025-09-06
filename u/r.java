package u;

import androidx.compose.foundation.AndroidExternalSurface_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class r extends Lambda implements Function2 {
    public final boolean A;
    public final Function1 B;
    public final int C;
    public final int D;
    public final Modifier w;
    public final boolean x;
    public final long y;
    public final int z;

    public r(Modifier modifier0, boolean z, long v, int v1, boolean z1, Function1 function10, int v2, int v3) {
        this.w = modifier0;
        this.x = z;
        this.y = v;
        this.z = v1;
        this.A = z1;
        this.B = function10;
        this.C = v2;
        this.D = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        AndroidExternalSurface_androidKt.AndroidExternalSurface-58FFMhA(this.w, this.x, this.y, this.z, this.A, this.B, ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)), this.D);
        return Unit.INSTANCE;
    }
}

