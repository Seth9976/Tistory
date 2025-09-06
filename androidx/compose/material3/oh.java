package androidx.compose.material3;

import androidx.compose.material.DividerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class oh extends Lambda implements Function2 {
    public final float A;
    public final int B;
    public final int C;
    public final int w;
    public final Modifier x;
    public final long y;
    public final float z;

    public oh(float f, Modifier modifier0, long v, float f1, int v1, int v2, int v3) {
        this.w = v3;
        this.z = f;
        this.x = modifier0;
        this.y = v;
        this.A = f1;
        this.B = v1;
        this.C = v2;
        super(2);
    }

    public oh(Modifier modifier0, long v, float f, float f1, int v1, int v2) {
        this.w = 1;
        this.x = modifier0;
        this.y = v;
        this.z = f;
        this.A = f1;
        this.B = v1;
        this.C = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                ProgressIndicatorKt.CircularProgressIndicator-MBs18nI(this.z, this.x, this.y, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                DividerKt.Divider-oMI9zvI(this.x, this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                androidx.compose.material.ProgressIndicatorKt.CircularProgressIndicator-MBs18nI(this.z, this.x, this.y, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
                return Unit.INSTANCE;
            }
        }
    }
}

