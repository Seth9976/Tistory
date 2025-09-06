package ca;

import androidx.compose.foundation.pager.PagerState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class z0 extends Lambda implements Function0 {
    public final int w;
    public final int x;
    public final PagerState y;

    public z0(int v, PagerState pagerState0, int v1) {
        this.w = v1;
        this.x = v;
        this.y = pagerState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            int v = this.y.getCurrentPage();
            return this.x == v;
        }
        int v1 = this.y.getCurrentPage();
        return this.x == v1;
    }
}

