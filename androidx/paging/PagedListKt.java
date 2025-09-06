package androidx.paging;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001Aq\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004\"\b\b\u0001\u0010\u0002*\u00020\u00042\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\n2\u0010\b\u0002\u0010\f\u001A\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\r2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u0001H\u0003H\u0007¢\u0006\u0002\u0010\u000F\u001A+\u0010\u0010\u001A\b\u0012\u0004\u0012\u0002H\u00030\u0011\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\b2\b\u0010\u0012\u001A\u0004\u0018\u0001H\u0003H\u0007¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"PagedList", "Landroidx/paging/PagedList;", "Value", "Key", "", "dataSource", "Landroidx/paging/DataSource;", "config", "Landroidx/paging/PagedList$Config;", "notifyExecutor", "Ljava/util/concurrent/Executor;", "fetchExecutor", "boundaryCallback", "Landroidx/paging/PagedList$BoundaryCallback;", "initialKey", "(Landroidx/paging/DataSource;Landroidx/paging/PagedList$Config;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroidx/paging/PagedList$BoundaryCallback;Ljava/lang/Object;)Landroidx/paging/PagedList;", "toRefreshLoadParams", "Landroidx/paging/PagingSource$LoadParams;", "key", "(Landroidx/paging/PagedList$Config;Ljava/lang/Object;)Landroidx/paging/PagingSource$LoadParams;", "paging-common_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class PagedListKt {
    @Deprecated(message = "DataSource is deprecated and has been replaced by PagingSource")
    public static final PagedList PagedList(DataSource dataSource0, Config pagedList$Config0, Executor executor0, Executor executor1, BoundaryCallback pagedList$BoundaryCallback0, Object object0) {
        Intrinsics.checkNotNullParameter(dataSource0, "dataSource");
        Intrinsics.checkNotNullParameter(pagedList$Config0, "config");
        Intrinsics.checkNotNullParameter(executor0, "notifyExecutor");
        Intrinsics.checkNotNullParameter(executor1, "fetchExecutor");
        return new Builder(dataSource0, pagedList$Config0).setNotifyExecutor(executor0).setFetchExecutor(executor1).setBoundaryCallback(pagedList$BoundaryCallback0).setInitialKey(object0).build();
    }

    public static PagedList PagedList$default(DataSource dataSource0, Config pagedList$Config0, Executor executor0, Executor executor1, BoundaryCallback pagedList$BoundaryCallback0, Object object0, int v, Object object1) {
        BoundaryCallback pagedList$BoundaryCallback1 = (v & 16) == 0 ? pagedList$BoundaryCallback0 : null;
        return (v & 0x20) == 0 ? PagedListKt.PagedList(dataSource0, pagedList$Config0, executor0, executor1, pagedList$BoundaryCallback1, object0) : PagedListKt.PagedList(dataSource0, pagedList$Config0, executor0, executor1, pagedList$BoundaryCallback1, null);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public static final LoadParams toRefreshLoadParams(@NotNull Config pagedList$Config0, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(pagedList$Config0, "<this>");
        return new Refresh(object0, pagedList$Config0.initialLoadSizeHint, pagedList$Config0.enablePlaceholders);
    }
}

