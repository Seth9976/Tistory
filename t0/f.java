package t0;

import androidx.compose.material.pullrefresh.PullRefreshIndicatorKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function2 {
    public final long A;
    public final boolean B;
    public final int C;
    public final int D;
    public final boolean w;
    public final PullRefreshState x;
    public final Modifier y;
    public final long z;

    public f(boolean z, PullRefreshState pullRefreshState0, Modifier modifier0, long v, long v1, boolean z1, int v2, int v3) {
        this.w = z;
        this.x = pullRefreshState0;
        this.y = modifier0;
        this.z = v;
        this.A = v1;
        this.B = z1;
        this.C = v2;
        this.D = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        PullRefreshIndicatorKt.PullRefreshIndicator-jB83MbM(this.w, this.x, this.y, this.z, this.A, this.B, ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)), this.D);
        return Unit.INSTANCE;
    }
}

