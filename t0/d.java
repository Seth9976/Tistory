package t0;

import androidx.compose.material.pullrefresh.PullRefreshState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function0 {
    public final int w;
    public final PullRefreshState x;

    public d(PullRefreshState pullRefreshState0, int v) {
        this.w = v;
        this.x = pullRefreshState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float f = 1.0f;
        if(this.w != 0) {
            return (float)(PullRefreshState.access$getDistancePulled(this.x) * 0.5f);
        }
        if(this.x.getProgress() < 1.0f) {
            f = 0.3f;
        }
        return f;
    }
}

