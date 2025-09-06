package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class x8 extends Lambda implements Function2 {
    public final int A;
    public final int B;
    public final int w;
    public final Modifier x;
    public final float y;
    public final long z;

    public x8(Modifier modifier0, float f, long v, int v1, int v2, int v3) {
        this.w = v3;
        this.x = modifier0;
        this.y = f;
        this.z = v;
        this.A = v1;
        this.B = v2;
        super(2);
    }

    public x8(Modifier modifier0, long v, float f, int v1, int v2, int v3) {
        this.w = v3;
        this.x = modifier0;
        this.z = v;
        this.y = f;
        this.A = v1;
        this.B = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                DividerKt.Divider-9IZ8Weo(this.x, this.y, this.z, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                DividerKt.HorizontalDivider-9IZ8Weo(this.x, this.y, this.z, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object1).intValue();
                DividerKt.VerticalDivider-9IZ8Weo(this.x, this.y, this.z, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
                return Unit.INSTANCE;
            }
            case 3: {
                ((Number)object1).intValue();
                ProgressIndicatorKt.CircularProgressIndicator-aM-cp0Q(this.x, this.z, this.y, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                androidx.compose.material.ProgressIndicatorKt.CircularProgressIndicator-aM-cp0Q(this.x, this.z, this.y, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
                return Unit.INSTANCE;
            }
        }
    }
}

