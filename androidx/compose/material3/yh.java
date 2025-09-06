package androidx.compose.material3;

import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class yh extends Lambda implements Function2 {
    public final int A;
    public final int B;
    public final int C;
    public final int w;
    public final Modifier x;
    public final long y;
    public final long z;

    public yh(Modifier modifier0, long v, long v1, int v2, int v3, int v4, int v5) {
        this.w = v5;
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
        if(this.w != 0) {
            ((Number)object1).intValue();
            ProgressIndicatorKt.LinearProgressIndicator-2cYBFYY(this.x, this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        androidx.compose.material3.ProgressIndicatorKt.LinearProgressIndicator-2cYBFYY(this.x, this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
        return Unit.INSTANCE;
    }
}

