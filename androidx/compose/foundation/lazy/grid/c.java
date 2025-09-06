package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function1 {
    public final LazyGridPrefetchStrategy w;

    public c(LazyGridPrefetchStrategy lazyGridPrefetchStrategy0) {
        this.w = lazyGridPrefetchStrategy0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return new LazyGridState(((Number)((List)object0).get(0)).intValue(), ((Number)((List)object0).get(1)).intValue(), this.w);
    }
}

