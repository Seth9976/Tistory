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

@Deprecated(message = "PagedList is deprecated and has been replaced by PagingData")
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B%\b\u0017\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tB%\b\u0017\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\b\u0010\fB+\b\u0017\u0012\u0018\u0010\u000F\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000E0\r\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\u0010B+\b\u0017\u0012\u0018\u0010\u000F\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000E0\r\u0012\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\b\u0010\u0011J!\u0010\u0014\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0013\u001A\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0016\u001A\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001B\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u000E\u0010\u001A\u001A\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0019¢\u0006\u0004\b\u001B\u0010\u001CJ!\u0010\u001F\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001E\u001A\u00020\u001D¢\u0006\u0004\b\u001F\u0010 J\u0019\u0010#\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"0!¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Landroidx/paging/LivePagedListBuilder;", "", "Key", "Value", "Landroidx/paging/DataSource$Factory;", "dataSourceFactory", "Landroidx/paging/PagedList$Config;", "config", "<init>", "(Landroidx/paging/DataSource$Factory;Landroidx/paging/PagedList$Config;)V", "", "pageSize", "(Landroidx/paging/DataSource$Factory;I)V", "Lkotlin/Function0;", "Landroidx/paging/PagingSource;", "pagingSourceFactory", "(Lkotlin/jvm/functions/Function0;Landroidx/paging/PagedList$Config;)V", "(Lkotlin/jvm/functions/Function0;I)V", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "setCoroutineScope", "(Lkotlinx/coroutines/CoroutineScope;)Landroidx/paging/LivePagedListBuilder;", "key", "setInitialLoadKey", "(Ljava/lang/Object;)Landroidx/paging/LivePagedListBuilder;", "Landroidx/paging/PagedList$BoundaryCallback;", "boundaryCallback", "setBoundaryCallback", "(Landroidx/paging/PagedList$BoundaryCallback;)Landroidx/paging/LivePagedListBuilder;", "Ljava/util/concurrent/Executor;", "fetchExecutor", "setFetchExecutor", "(Ljava/util/concurrent/Executor;)Landroidx/paging/LivePagedListBuilder;", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "build", "()Landroidx/lifecycle/LiveData;", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LivePagedListBuilder {
    public final Function0 a;
    public final Factory b;
    public final Config c;
    public CoroutineScope d;
    public Object e;
    public BoundaryCallback f;
    public CoroutineDispatcher g;

    @Deprecated(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @ReplaceWith(expression = "Pager(\n                PagingConfig(pageSize),\n                initialLoadKey,\n                dataSourceFactory.asPagingSourceFactory(Dispatchers.IO)\n            ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData", "kotlinx.coroutines.Dispatchers"}))
    public LivePagedListBuilder(@NotNull Factory dataSource$Factory0, int v) {
        Intrinsics.checkNotNullParameter(dataSource$Factory0, "dataSourceFactory");
        this(dataSource$Factory0, new Builder().setPageSize(v).build());
    }

    @Deprecated(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @ReplaceWith(expression = "Pager(\n                PagingConfig(\n                    config.pageSize,\n                    config.prefetchDistance,\n                    config.enablePlaceholders,\n                    config.initialLoadSizeHint,\n                    config.maxSize\n                ),\n                initialLoadKey,\n                dataSourceFactory.asPagingSourceFactory(Dispatchers.IO)\n            ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData", "kotlinx.coroutines.Dispatchers"}))
    public LivePagedListBuilder(@NotNull Factory dataSource$Factory0, @NotNull Config pagedList$Config0) {
        Intrinsics.checkNotNullParameter(dataSource$Factory0, "dataSourceFactory");
        Intrinsics.checkNotNullParameter(pagedList$Config0, "config");
        super();
        this.d = GlobalScope.INSTANCE;
        Executor executor0 = ArchTaskExecutor.getIOThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executor0, "getIOThreadExecutor()");
        this.g = ExecutorsKt.from(executor0);
        this.a = null;
        this.b = dataSource$Factory0;
        this.c = pagedList$Config0;
    }

    @Deprecated(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @ReplaceWith(expression = "Pager(\n                PagingConfig(pageSize),\n                initialLoadKey,\n                this\n            ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData"}))
    public LivePagedListBuilder(@NotNull Function0 function00, int v) {
        Intrinsics.checkNotNullParameter(function00, "pagingSourceFactory");
        this(function00, new Builder().setPageSize(v).build());
    }

    @Deprecated(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @ReplaceWith(expression = "Pager(\n                PagingConfig(\n                    config.pageSize,\n                    config.prefetchDistance,\n                    config.enablePlaceholders,\n                    config.initialLoadSizeHint,\n                    config.maxSize\n                ),\n                initialLoadKey,\n                this\n            ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData"}))
    public LivePagedListBuilder(@NotNull Function0 function00, @NotNull Config pagedList$Config0) {
        Intrinsics.checkNotNullParameter(function00, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(pagedList$Config0, "config");
        super();
        this.d = GlobalScope.INSTANCE;
        Executor executor0 = ArchTaskExecutor.getIOThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executor0, "getIOThreadExecutor()");
        this.g = ExecutorsKt.from(executor0);
        this.a = function00;
        this.b = null;
        this.c = pagedList$Config0;
    }

    @NotNull
    public final LiveData build() {
        Function0 function00 = this.a;
        if(function00 == null) {
            function00 = this.b == null ? null : this.b.asPagingSourceFactory(this.g);
        }
        if(function00 == null) {
            throw new IllegalStateException("LivePagedList cannot be built without a PagingSourceFactory or DataSource.Factory");
        }
        CoroutineScope coroutineScope0 = this.d;
        Object object0 = this.e;
        BoundaryCallback pagedList$BoundaryCallback0 = this.f;
        Executor executor0 = ArchTaskExecutor.getMainThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executor0, "getMainThreadExecutor()");
        CoroutineDispatcher coroutineDispatcher0 = ExecutorsKt.from(executor0);
        return new LivePagedList(coroutineScope0, object0, this.c, pagedList$BoundaryCallback0, function00, coroutineDispatcher0, this.g);
    }

    @NotNull
    public final LivePagedListBuilder setBoundaryCallback(@Nullable BoundaryCallback pagedList$BoundaryCallback0) {
        this.f = pagedList$BoundaryCallback0;
        return this;
    }

    @NotNull
    public final LivePagedListBuilder setCoroutineScope(@NotNull CoroutineScope coroutineScope0) {
        Intrinsics.checkNotNullParameter(coroutineScope0, "coroutineScope");
        this.d = coroutineScope0;
        return this;
    }

    @NotNull
    public final LivePagedListBuilder setFetchExecutor(@NotNull Executor executor0) {
        Intrinsics.checkNotNullParameter(executor0, "fetchExecutor");
        this.g = ExecutorsKt.from(executor0);
        return this;
    }

    @NotNull
    public final LivePagedListBuilder setInitialLoadKey(@Nullable Object object0) {
        this.e = object0;
        return this;
    }
}

