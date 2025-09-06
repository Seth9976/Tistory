package b0;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function0 {
    public final int w;
    public final int x;
    public final int y;

    public w(int v, int v1, int v2) {
        this.w = v2;
        this.x = v;
        this.y = v1;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return new LazyListState(this.x, this.y);
            }
            case 1: {
                return new LazyGridState(this.x, this.y);
            }
            default: {
                return new LazyStaggeredGridState(this.x, this.y);
            }
        }
    }
}

