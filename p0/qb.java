package p0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambda;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class qb extends Lambda implements Function2 {
    public final jb A;
    public final boolean B;
    public final ComposableLambda C;
    public final int D;
    public final vb w;
    public final s4 x;
    public final long y;
    public final long z;

    public qb(vb vb0, s4 s40, long v, long v1, jb jb0, boolean z, ComposableLambda composableLambda0, int v2) {
        this.w = vb0;
        this.x = s40;
        this.y = v;
        this.z = v1;
        this.A = jb0;
        this.B = z;
        this.C = composableLambda0;
        this.D = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.w.a(this.x, this.y, this.z, this.A, this.B, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)));
        return Unit.INSTANCE;
    }
}

