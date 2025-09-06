package s4;

import androidx.paging.ActiveFlowTracker;
import androidx.paging.CachedPageEventFlow;
import androidx.paging.PagingData;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

public final class e0 {
    public final CoroutineScope a;
    public final PagingData b;
    public final ActiveFlowTracker c;
    public final CachedPageEventFlow d;

    public e0(CoroutineScope coroutineScope0, PagingData pagingData0, ActiveFlowTracker activeFlowTracker0) {
        Intrinsics.checkNotNullParameter(coroutineScope0, "scope");
        Intrinsics.checkNotNullParameter(pagingData0, "parent");
        super();
        this.a = coroutineScope0;
        this.b = pagingData0;
        this.c = activeFlowTracker0;
        CachedPageEventFlow cachedPageEventFlow0 = new CachedPageEventFlow(pagingData0.getFlow$paging_common_release(), coroutineScope0);
        if(activeFlowTracker0 != null) {
            activeFlowTracker0.onNewCachedEventFlow(cachedPageEventFlow0);
        }
        this.d = cachedPageEventFlow0;
    }
}

