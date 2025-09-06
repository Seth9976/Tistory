package androidx.compose.material3;

import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class nh extends Lambda implements Function2 {
    public final float A;
    public final long B;
    public final int C;
    public final int D;
    public final int E;
    public final int w;
    public final float x;
    public final Modifier y;
    public final long z;

    public nh(float f, Modifier modifier0, long v, float f1, long v1, int v2, int v3, int v4, int v5) {
        this.w = v5;
        this.x = f;
        this.y = modifier0;
        this.z = v;
        this.A = f1;
        this.B = v1;
        this.C = v2;
        this.D = v3;
        this.E = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            ProgressIndicatorKt.CircularProgressIndicator-DUhRLBM(this.x, this.y, this.z, this.A, this.B, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        androidx.compose.material3.ProgressIndicatorKt.CircularProgressIndicator-DUhRLBM(this.x, this.y, this.z, this.A, this.B, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
        return Unit.INSTANCE;
    }
}

