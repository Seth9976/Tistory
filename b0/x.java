package b0;

import androidx.compose.foundation.lazy.LazyListPrefetchStrategy;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class x extends Lambda implements Function0 {
    public final int w;
    public final int x;
    public final int y;
    public final Object z;

    public x(int v, int v1, int v2, Object object0) {
        this.w = v2;
        this.x = v;
        this.y = v1;
        this.z = object0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w != 0 ? new LazyGridState(this.x, this.y, ((LazyGridPrefetchStrategy)this.z)) : new LazyListState(this.x, this.y, ((LazyListPrefetchStrategy)this.z));
    }
}

