package t0;

import androidx.compose.material.pullrefresh.PullRefreshState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;

public final class l extends Lambda implements Function0 {
    public final PullRefreshState w;
    public final boolean x;
    public final FloatRef y;
    public final FloatRef z;

    public l(PullRefreshState pullRefreshState0, boolean z, FloatRef ref$FloatRef0, FloatRef ref$FloatRef1) {
        this.w = pullRefreshState0;
        this.x = z;
        this.y = ref$FloatRef0;
        this.z = ref$FloatRef1;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.w.setRefreshing$material_release(this.x);
        this.w.setThreshold$material_release(this.y.element);
        this.w.setRefreshingOffset$material_release(this.z.element);
        return Unit.INSTANCE;
    }
}

