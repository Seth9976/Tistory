package androidx.paging;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002J\b\u0010\u0004\u001A\u00020\u0005H&J$\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00020\b2\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH&J\u001C\u0010\u000B\u001A\u00020\u00052\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH&J\u001C\u0010\f\u001A\u00020\u00052\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Landroidx/paging/RemoteMediatorConnection;", "Key", "", "Value", "allowRefresh", "", "requestLoad", "loadType", "Landroidx/paging/LoadType;", "pagingState", "Landroidx/paging/PagingState;", "requestRefreshIfAllowed", "retryFailed", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface RemoteMediatorConnection {
    void allowRefresh();

    void requestLoad(@NotNull LoadType arg1, @NotNull PagingState arg2);

    void requestRefreshIfAllowed(@NotNull PagingState arg1);

    void retryFailed(@NotNull PagingState arg1);
}

