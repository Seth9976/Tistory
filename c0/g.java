package c0;

import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import androidx.compose.foundation.lazy.grid.LazyGridSpanKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function2 {
    public final int w;
    public static final g x;
    public static final g y;

    static {
        g.x = new g(2, 0);
        g.y = new g(2, 1);
    }

    public g(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            SaverScope saverScope0 = (SaverScope)object0;
            return CollectionsKt__CollectionsKt.listOf(new Integer[]{((LazyGridState)object1).getFirstVisibleItemIndex(), ((LazyGridState)object1).getFirstVisibleItemScrollOffset()});
        }
        LazyGridItemSpanScope lazyGridItemSpanScope0 = (LazyGridItemSpanScope)object0;
        ((Number)object1).intValue();
        return GridItemSpan.box-impl(LazyGridSpanKt.GridItemSpan(1));
    }
}

