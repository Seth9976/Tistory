package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class ln extends Lambda implements Function2 {
    public final long A;
    public final int B;
    public final int C;
    public final int w;
    public final TabRowDefaults x;
    public final Modifier y;
    public final float z;

    public ln(TabRowDefaults tabRowDefaults0, Modifier modifier0, float f, long v, int v1, int v2, int v3) {
        this.w = v3;
        this.x = tabRowDefaults0;
        this.y = modifier0;
        this.z = f;
        this.A = v;
        this.B = v1;
        this.C = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            this.x.SecondaryIndicator-9IZ8Weo(this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        this.x.Indicator-9IZ8Weo(this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
        return Unit.INSTANCE;
    }
}

