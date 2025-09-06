package androidx.paging;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Executor;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A}\u0010\u0000\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005\"\b\b\u0001\u0010\u0003*\u00020\u0005*\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00030\u00070\u00062\u0006\u0010\b\u001A\u00020\t2\n\b\u0002\u0010\n\u001A\u0004\u0018\u0001H\u00042\u0010\b\u0002\u0010\u000B\u001A\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\f2\b\b\u0002\u0010\r\u001A\u00020\u000E2\b\b\u0002\u0010\u000F\u001A\u00020\u0010H\u0007\u00A2\u0006\u0002\u0010\u0011\u001A}\u0010\u0000\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005\"\b\b\u0001\u0010\u0003*\u00020\u0005*\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00030\u00070\u00062\u0006\u0010\u0012\u001A\u00020\u00132\n\b\u0002\u0010\n\u001A\u0004\u0018\u0001H\u00042\u0010\b\u0002\u0010\u000B\u001A\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\f2\b\b\u0002\u0010\r\u001A\u00020\u000E2\b\b\u0002\u0010\u000F\u001A\u00020\u0010H\u0007\u00A2\u0006\u0002\u0010\u0014\u001Am\u0010\u0000\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005\"\b\b\u0001\u0010\u0003*\u00020\u0005*\u000E\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00030\u00152\u0006\u0010\b\u001A\u00020\t2\n\b\u0002\u0010\n\u001A\u0004\u0018\u0001H\u00042\u0010\b\u0002\u0010\u000B\u001A\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\f2\b\b\u0002\u0010\u0016\u001A\u00020\u0017H\u0007\u00A2\u0006\u0002\u0010\u0018\u001Am\u0010\u0000\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005\"\b\b\u0001\u0010\u0003*\u00020\u0005*\u000E\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00030\u00152\u0006\u0010\u0012\u001A\u00020\u00132\n\b\u0002\u0010\n\u001A\u0004\u0018\u0001H\u00042\u0010\b\u0002\u0010\u000B\u001A\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\f2\b\b\u0002\u0010\u0016\u001A\u00020\u0017H\u0007\u00A2\u0006\u0002\u0010\u0019\u00A8\u0006\u001A"}, d2 = {"toLiveData", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "Value", "Key", "", "Lkotlin/Function0;", "Landroidx/paging/PagingSource;", "config", "Landroidx/paging/PagedList$Config;", "initialLoadKey", "boundaryCallback", "Landroidx/paging/PagedList$BoundaryCallback;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "fetchDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlin/jvm/functions/Function0;Landroidx/paging/PagedList$Config;Ljava/lang/Object;Landroidx/paging/PagedList$BoundaryCallback;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineDispatcher;)Landroidx/lifecycle/LiveData;", "pageSize", "", "(Lkotlin/jvm/functions/Function0;ILjava/lang/Object;Landroidx/paging/PagedList$BoundaryCallback;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineDispatcher;)Landroidx/lifecycle/LiveData;", "Landroidx/paging/DataSource$Factory;", "fetchExecutor", "Ljava/util/concurrent/Executor;", "(Landroidx/paging/DataSource$Factory;Landroidx/paging/PagedList$Config;Ljava/lang/Object;Landroidx/paging/PagedList$BoundaryCallback;Ljava/util/concurrent/Executor;)Landroidx/lifecycle/LiveData;", "(Landroidx/paging/DataSource$Factory;ILjava/lang/Object;Landroidx/paging/PagedList$BoundaryCallback;Ljava/util/concurrent/Executor;)Landroidx/lifecycle/LiveData;", "paging-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class LivePagedListKt {
    @Deprecated(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @ReplaceWith(expression = "Pager(\n            PagingConfig(pageSize),\n            initialLoadKey,\n            this.asPagingSourceFactory(fetchExecutor.asCoroutineDispatcher())\n        ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData", "kotlinx.coroutines.asCoroutineDispatcher"}))
    @NotNull
    public static final LiveData toLiveData(@NotNull Factory dataSource$Factory0, int v, @Nullable Object object0, @Nullable BoundaryCallback pagedList$BoundaryCallback0, @NotNull Executor executor0) {
        Intrinsics.checkNotNullParameter(dataSource$Factory0, "<this>");
        Intrinsics.checkNotNullParameter(executor0, "fetchExecutor");
        return new LivePagedListBuilder(dataSource$Factory0, PagedListConfigKt.Config$default(v, 0, false, 0, 0, 30, null)).setInitialLoadKey(object0).setBoundaryCallback(pagedList$BoundaryCallback0).setFetchExecutor(executor0).build();
    }

    @Deprecated(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @ReplaceWith(expression = "Pager(\n            PagingConfig(\n                config.pageSize,\n                config.prefetchDistance,\n                config.enablePlaceholders,\n                config.initialLoadSizeHint,\n                config.maxSize\n            ),\n            initialLoadKey,\n            this.asPagingSourceFactory(fetchExecutor.asCoroutineDispatcher())\n        ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData", "kotlinx.coroutines.asCoroutineDispatcher"}))
    @NotNull
    public static final LiveData toLiveData(@NotNull Factory dataSource$Factory0, @NotNull Config pagedList$Config0, @Nullable Object object0, @Nullable BoundaryCallback pagedList$BoundaryCallback0, @NotNull Executor executor0) {
        Intrinsics.checkNotNullParameter(dataSource$Factory0, "<this>");
        Intrinsics.checkNotNullParameter(pagedList$Config0, "config");
        Intrinsics.checkNotNullParameter(executor0, "fetchExecutor");
        return new LivePagedListBuilder(dataSource$Factory0, pagedList$Config0).setInitialLoadKey(object0).setBoundaryCallback(pagedList$BoundaryCallback0).setFetchExecutor(executor0).build();
    }

    @Deprecated(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @ReplaceWith(expression = "Pager(\n            PagingConfig(pageSize),\n            initialLoadKey,\n            this\n        ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData"}))
    @NotNull
    public static final LiveData toLiveData(@NotNull Function0 function00, int v, @Nullable Object object0, @Nullable BoundaryCallback pagedList$BoundaryCallback0, @NotNull CoroutineScope coroutineScope0, @NotNull CoroutineDispatcher coroutineDispatcher0) {
        Intrinsics.checkNotNullParameter(function00, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope0, "coroutineScope");
        Intrinsics.checkNotNullParameter(coroutineDispatcher0, "fetchDispatcher");
        Config pagedList$Config0 = new Builder().setPageSize(v).build();
        Executor executor0 = ArchTaskExecutor.getMainThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executor0, "getMainThreadExecutor()");
        return new LivePagedList(coroutineScope0, object0, pagedList$Config0, pagedList$BoundaryCallback0, function00, ExecutorsKt.from(executor0), coroutineDispatcher0);
    }

    @Deprecated(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @ReplaceWith(expression = "Pager(\n            PagingConfig(\n                config.pageSize,\n                config.prefetchDistance,\n                config.enablePlaceholders,\n                config.initialLoadSizeHint,\n                config.maxSize\n            ),\n            initialLoadKey,\n            this\n        ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData"}))
    @NotNull
    public static final LiveData toLiveData(@NotNull Function0 function00, @NotNull Config pagedList$Config0, @Nullable Object object0, @Nullable BoundaryCallback pagedList$BoundaryCallback0, @NotNull CoroutineScope coroutineScope0, @NotNull CoroutineDispatcher coroutineDispatcher0) {
        Intrinsics.checkNotNullParameter(function00, "<this>");
        Intrinsics.checkNotNullParameter(pagedList$Config0, "config");
        Intrinsics.checkNotNullParameter(coroutineScope0, "coroutineScope");
        Intrinsics.checkNotNullParameter(coroutineDispatcher0, "fetchDispatcher");
        Executor executor0 = ArchTaskExecutor.getMainThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executor0, "getMainThreadExecutor()");
        return new LivePagedList(coroutineScope0, object0, pagedList$Config0, pagedList$BoundaryCallback0, function00, ExecutorsKt.from(executor0), coroutineDispatcher0);
    }

    public static LiveData toLiveData$default(Factory dataSource$Factory0, int v, Object object0, BoundaryCallback pagedList$BoundaryCallback0, Executor executor0, int v1, Object object1) {
        if((v1 & 2) != 0) {
            object0 = null;
        }
        if((v1 & 4) != 0) {
            pagedList$BoundaryCallback0 = null;
        }
        if((v1 & 8) != 0) {
            executor0 = ArchTaskExecutor.getIOThreadExecutor();
            Intrinsics.checkNotNullExpressionValue(executor0, "getIOThreadExecutor()");
        }
        return LivePagedListKt.toLiveData(dataSource$Factory0, v, object0, pagedList$BoundaryCallback0, executor0);
    }

    public static LiveData toLiveData$default(Factory dataSource$Factory0, Config pagedList$Config0, Object object0, BoundaryCallback pagedList$BoundaryCallback0, Executor executor0, int v, Object object1) {
        if((v & 2) != 0) {
            object0 = null;
        }
        if((v & 4) != 0) {
            pagedList$BoundaryCallback0 = null;
        }
        if((v & 8) != 0) {
            executor0 = ArchTaskExecutor.getIOThreadExecutor();
            Intrinsics.checkNotNullExpressionValue(executor0, "getIOThreadExecutor()");
        }
        return LivePagedListKt.toLiveData(dataSource$Factory0, pagedList$Config0, object0, pagedList$BoundaryCallback0, executor0);
    }

    public static LiveData toLiveData$default(Function0 function00, int v, Object object0, BoundaryCallback pagedList$BoundaryCallback0, CoroutineScope coroutineScope0, CoroutineDispatcher coroutineDispatcher0, int v1, Object object1) {
        if((v1 & 8) != 0) {
            coroutineScope0 = GlobalScope.INSTANCE;
        }
        if((v1 & 16) != 0) {
            Executor executor0 = ArchTaskExecutor.getIOThreadExecutor();
            Intrinsics.checkNotNullExpressionValue(executor0, "getIOThreadExecutor()");
            coroutineDispatcher0 = ExecutorsKt.from(executor0);
        }
        return LivePagedListKt.toLiveData(function00, v, ((v1 & 2) == 0 ? object0 : null), ((v1 & 4) == 0 ? pagedList$BoundaryCallback0 : null), coroutineScope0, coroutineDispatcher0);
    }

    public static LiveData toLiveData$default(Function0 function00, Config pagedList$Config0, Object object0, BoundaryCallback pagedList$BoundaryCallback0, CoroutineScope coroutineScope0, CoroutineDispatcher coroutineDispatcher0, int v, Object object1) {
        if((v & 8) != 0) {
            coroutineScope0 = GlobalScope.INSTANCE;
        }
        if((v & 16) != 0) {
            Executor executor0 = ArchTaskExecutor.getIOThreadExecutor();
            Intrinsics.checkNotNullExpressionValue(executor0, "getIOThreadExecutor()");
            coroutineDispatcher0 = ExecutorsKt.from(executor0);
        }
        return LivePagedListKt.toLiveData(function00, pagedList$Config0, ((v & 2) == 0 ? object0 : null), ((v & 4) == 0 ? pagedList$BoundaryCallback0 : null), coroutineScope0, coroutineDispatcher0);
    }
}

