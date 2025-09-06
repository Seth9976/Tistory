package x0;

import androidx.compose.material3.pulltorefresh.PullToRefreshDefaults;
import androidx.compose.material3.pulltorefresh.PullToRefreshState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function2 {
    public final long A;
    public final long B;
    public final float C;
    public final int D;
    public final int E;
    public final PullToRefreshDefaults w;
    public final PullToRefreshState x;
    public final boolean y;
    public final Modifier z;

    public c(PullToRefreshDefaults pullToRefreshDefaults0, PullToRefreshState pullToRefreshState0, boolean z, Modifier modifier0, long v, long v1, float f, int v2, int v3) {
        this.w = pullToRefreshDefaults0;
        this.x = pullToRefreshState0;
        this.y = z;
        this.z = modifier0;
        this.A = v;
        this.B = v1;
        this.C = f;
        this.D = v2;
        this.E = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.w.Indicator-2poqoh4(this.x, this.y, this.z, this.A, this.B, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
        return Unit.INSTANCE;
    }
}

