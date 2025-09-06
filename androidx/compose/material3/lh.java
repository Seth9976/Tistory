package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class lh extends Lambda implements Function2 {
    public final long A;
    public final int B;
    public final int C;
    public final int D;
    public final int w;
    public final float x;
    public final Modifier y;
    public final long z;

    public lh(float f, int v, int v1, int v2, long v3, long v4, Modifier modifier0) {
        this.w = 2;
        this.y = modifier0;
        this.z = v3;
        this.A = v4;
        this.B = v;
        this.x = f;
        this.C = v1;
        this.D = v2;
        super(2);
    }

    public lh(float f, Modifier modifier0, long v, long v1, int v2, int v3, int v4, int v5) {
        this.w = v5;
        this.x = f;
        this.y = modifier0;
        this.z = v;
        this.A = v1;
        this.B = v2;
        this.C = v3;
        this.D = v4;
        super(2);
    }

    public lh(Modifier modifier0, long v, float f, long v1, int v2, int v3, int v4, int v5) {
        this.w = v5;
        this.y = modifier0;
        this.z = v;
        this.x = f;
        this.A = v1;
        this.B = v2;
        this.C = v3;
        this.D = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                ProgressIndicatorKt.CircularProgressIndicator-LxG7B9w(this.y, this.z, this.x, this.A, this.B, ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)), this.D);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                ProgressIndicatorKt.LinearProgressIndicator-_5eSR-E(this.x, this.y, this.z, this.A, this.B, ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)), this.D);
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object1).intValue();
                ProgressIndicatorKt.LinearProgressIndicator-rIrjwxo(this.y, this.z, this.A, this.B, this.x, ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)), this.D);
                return Unit.INSTANCE;
            }
            case 3: {
                ((Number)object1).intValue();
                androidx.compose.material.ProgressIndicatorKt.CircularProgressIndicator-LxG7B9w(this.y, this.z, this.x, this.A, this.B, ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)), this.D);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                androidx.compose.material.ProgressIndicatorKt.LinearProgressIndicator-_5eSR-E(this.x, this.y, this.z, this.A, this.B, ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)), this.D);
                return Unit.INSTANCE;
            }
        }
    }
}

