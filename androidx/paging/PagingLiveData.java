package androidx.paging;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A4\u0010\t\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u00020\u0001\"\b\b\u0000\u0010\n*\u00020\u0005*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u00020\u00012\u0006\u0010\u000B\u001A\u00020\f\u001A4\u0010\t\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u00020\u0001\"\b\b\u0000\u0010\n*\u00020\u0005*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u00020\u00012\u0006\u0010\r\u001A\u00020\u000E\u001A4\u0010\t\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u00020\u0001\"\b\b\u0000\u0010\n*\u00020\u0005*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u00020\u00012\u0006\u0010\u000F\u001A\u00020\u0010\"A\u0010\u0000\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005\"\b\b\u0001\u0010\u0003*\u00020\u0005*\u000E\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00030\u00068F¢\u0006\u0006\u001A\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"liveData", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagingData;", "Value", "Key", "", "Landroidx/paging/Pager;", "getLiveData", "(Landroidx/paging/Pager;)Landroidx/lifecycle/LiveData;", "cachedIn", "T", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "viewModel", "Landroidx/lifecycle/ViewModel;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "paging-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "PagingLiveData")
public final class PagingLiveData {
    @NotNull
    public static final LiveData cachedIn(@NotNull LiveData liveData0, @NotNull Lifecycle lifecycle0) {
        Intrinsics.checkNotNullParameter(liveData0, "<this>");
        Intrinsics.checkNotNullParameter(lifecycle0, "lifecycle");
        return FlowLiveDataConversions.asLiveData$default(CachedPagingDataKt.cachedIn(FlowLiveDataConversions.asFlow(liveData0), LifecycleKt.getCoroutineScope(lifecycle0)), null, 0L, 3, null);
    }

    @NotNull
    public static final LiveData cachedIn(@NotNull LiveData liveData0, @NotNull ViewModel viewModel0) {
        Intrinsics.checkNotNullParameter(liveData0, "<this>");
        Intrinsics.checkNotNullParameter(viewModel0, "viewModel");
        return FlowLiveDataConversions.asLiveData$default(CachedPagingDataKt.cachedIn(FlowLiveDataConversions.asFlow(liveData0), ViewModelKt.getViewModelScope(viewModel0)), null, 0L, 3, null);
    }

    @NotNull
    public static final LiveData cachedIn(@NotNull LiveData liveData0, @NotNull CoroutineScope coroutineScope0) {
        Intrinsics.checkNotNullParameter(liveData0, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope0, "scope");
        return FlowLiveDataConversions.asLiveData$default(CachedPagingDataKt.cachedIn(FlowLiveDataConversions.asFlow(liveData0), coroutineScope0), null, 0L, 3, null);
    }

    @NotNull
    public static final LiveData getLiveData(@NotNull Pager pager0) {
        Intrinsics.checkNotNullParameter(pager0, "<this>");
        return FlowLiveDataConversions.asLiveData$default(pager0.getFlow(), null, 0L, 3, null);
    }
}

