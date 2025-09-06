package p6;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import com.google.accompanist.swiperefresh.SwipeRefreshIndicatorKt;
import com.google.accompanist.swiperefresh.SwipeRefreshState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function2 {
    public final boolean A;
    public final boolean B;
    public final long C;
    public final long D;
    public final Shape E;
    public final float F;
    public final boolean G;
    public final float H;
    public final int I;
    public final int J;
    public final int K;
    public final SwipeRefreshState w;
    public final float x;
    public final Modifier y;
    public final boolean z;

    public g(SwipeRefreshState swipeRefreshState0, float f, Modifier modifier0, boolean z, boolean z1, boolean z2, long v, long v1, Shape shape0, float f1, boolean z3, float f2, int v2, int v3, int v4) {
        this.w = swipeRefreshState0;
        this.x = f;
        this.y = modifier0;
        this.z = z;
        this.A = z1;
        this.B = z2;
        this.C = v;
        this.D = v1;
        this.E = shape0;
        this.F = f1;
        this.G = z3;
        this.H = f2;
        this.I = v2;
        this.J = v3;
        this.K = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SwipeRefreshIndicatorKt.SwipeRefreshIndicator-_UAkqwU(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, ((Composer)object0), (this.I | 1) & -920350135 | ((0x24924924 & (this.I | 1)) >> 1 | 306783378 & (this.I | 1)) | (306783378 & (this.I | 1)) << 1 & (0x24924924 & (this.I | 1)), this.J & -920350135 | ((0x24924924 & this.J) >> 1 | 306783378 & this.J) | (306783378 & this.J) << 1 & (0x24924924 & this.J), this.K);
        return Unit.INSTANCE;
    }
}

