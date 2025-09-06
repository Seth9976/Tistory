package u1;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.vector.VectorComposeKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function2 {
    public final float A;
    public final Brush B;
    public final float C;
    public final float D;
    public final int E;
    public final int F;
    public final float G;
    public final float H;
    public final float I;
    public final float J;
    public final int K;
    public final int L;
    public final int M;
    public final List w;
    public final int x;
    public final String y;
    public final Brush z;

    public e(List list0, int v, String s, Brush brush0, float f, Brush brush1, float f1, float f2, int v1, int v2, float f3, float f4, float f5, float f6, int v3, int v4, int v5) {
        this.w = list0;
        this.x = v;
        this.y = s;
        this.z = brush0;
        this.A = f;
        this.B = brush1;
        this.C = f1;
        this.D = f2;
        this.E = v1;
        this.F = v2;
        this.G = f3;
        this.H = f4;
        this.I = f5;
        this.J = f6;
        this.K = v3;
        this.L = v4;
        this.M = v5;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        VectorComposeKt.Path-9cdaXJ4(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, ((Composer)object0), (this.K | 1) & -920350135 | ((0x24924924 & (this.K | 1)) >> 1 | 306783378 & (this.K | 1)) | (306783378 & (this.K | 1)) << 1 & (0x24924924 & (this.K | 1)), this.L & -920350135 | ((0x24924924 & this.L) >> 1 | 306783378 & this.L) | (306783378 & this.L) << 1 & (0x24924924 & this.L), this.M);
        return Unit.INSTANCE;
    }
}

