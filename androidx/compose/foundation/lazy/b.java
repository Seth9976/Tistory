package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public final LazyListPrefetchStrategy w;

    public b(LazyListPrefetchStrategy lazyListPrefetchStrategy0) {
        this.w = lazyListPrefetchStrategy0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return new LazyListState(((Number)((List)object0).get(0)).intValue(), ((Number)((List)object0).get(1)).intValue(), this.w);
    }
}

