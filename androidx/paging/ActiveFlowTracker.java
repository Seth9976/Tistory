package androidx.paging;

import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@VisibleForTesting
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001:\u0001\u000BJ\u0016\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001A\u00020\u00032\n\u0010\b\u001A\u0006\u0012\u0002\b\u00030\tH&J\u0016\u0010\n\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/paging/ActiveFlowTracker;", "", "onComplete", "", "flowType", "Landroidx/paging/ActiveFlowTracker$FlowType;", "(Landroidx/paging/ActiveFlowTracker$FlowType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onNewCachedEventFlow", "cachedPageEventFlow", "Landroidx/paging/CachedPageEventFlow;", "onStart", "FlowType", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface ActiveFlowTracker {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/ActiveFlowTracker$FlowType;", "", "PAGED_DATA_FLOW", "PAGE_EVENT_FLOW", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static enum FlowType {
        PAGED_DATA_FLOW,
        PAGE_EVENT_FLOW;

    }

    @Nullable
    Object onComplete(@NotNull FlowType arg1, @NotNull Continuation arg2);

    void onNewCachedEventFlow(@NotNull CachedPageEventFlow arg1);

    @Nullable
    Object onStart(@NotNull FlowType arg1, @NotNull Continuation arg2);
}

