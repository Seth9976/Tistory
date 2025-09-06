package androidx.paging;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004B\u0005¢\u0006\u0002\u0010\u0005J*\u0010\u0006\u001A\u00020\u00072\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\t2\u0012\u0010\n\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000BH\u0016J*\u0010\f\u001A\u00020\u00072\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\t2\u0012\u0010\n\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000BH\u0016J*\u0010\r\u001A\u00020\u00072\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u000E2\u0012\u0010\n\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000FH\u0016¨\u0006\u0010"}, d2 = {"Landroidx/paging/InitialDataSource;", "K", "", "V", "Landroidx/paging/PageKeyedDataSource;", "()V", "loadAfter", "", "params", "Landroidx/paging/PageKeyedDataSource$LoadParams;", "callback", "Landroidx/paging/PageKeyedDataSource$LoadCallback;", "loadBefore", "loadInitial", "Landroidx/paging/PageKeyedDataSource$LoadInitialParams;", "Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class InitialDataSource extends PageKeyedDataSource {
    @Override  // androidx.paging.PageKeyedDataSource
    public void loadAfter(@NotNull LoadParams pageKeyedDataSource$LoadParams0, @NotNull LoadCallback pageKeyedDataSource$LoadCallback0) {
        Intrinsics.checkNotNullParameter(pageKeyedDataSource$LoadParams0, "params");
        Intrinsics.checkNotNullParameter(pageKeyedDataSource$LoadCallback0, "callback");
        pageKeyedDataSource$LoadCallback0.onResult(CollectionsKt__CollectionsKt.emptyList(), null);
    }

    @Override  // androidx.paging.PageKeyedDataSource
    public void loadBefore(@NotNull LoadParams pageKeyedDataSource$LoadParams0, @NotNull LoadCallback pageKeyedDataSource$LoadCallback0) {
        Intrinsics.checkNotNullParameter(pageKeyedDataSource$LoadParams0, "params");
        Intrinsics.checkNotNullParameter(pageKeyedDataSource$LoadCallback0, "callback");
        pageKeyedDataSource$LoadCallback0.onResult(CollectionsKt__CollectionsKt.emptyList(), null);
    }

    @Override  // androidx.paging.PageKeyedDataSource
    public void loadInitial(@NotNull LoadInitialParams pageKeyedDataSource$LoadInitialParams0, @NotNull LoadInitialCallback pageKeyedDataSource$LoadInitialCallback0) {
        Intrinsics.checkNotNullParameter(pageKeyedDataSource$LoadInitialParams0, "params");
        Intrinsics.checkNotNullParameter(pageKeyedDataSource$LoadInitialCallback0, "callback");
        pageKeyedDataSource$LoadInitialCallback0.onResult(CollectionsKt__CollectionsKt.emptyList(), 0, 0, null, null);
    }
}

