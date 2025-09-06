package androidx.compose.material3;

import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class sh extends Lambda implements Function2 {
    public final long A;
    public final int B;
    public final int C;
    public final int w;
    public final float x;
    public final Modifier y;
    public final long z;

    public sh(float f, int v, int v1, int v2, long v3, long v4, Modifier modifier0) {
        this.w = v2;
        this.x = f;
        this.y = modifier0;
        this.z = v3;
        this.A = v4;
        this.B = v;
        this.C = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            ProgressIndicatorKt.LinearProgressIndicator-eaDK9VM(this.x, this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        androidx.compose.material3.ProgressIndicatorKt.LinearProgressIndicator-eaDK9VM(this.x, this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
        return Unit.INSTANCE;
    }
}

