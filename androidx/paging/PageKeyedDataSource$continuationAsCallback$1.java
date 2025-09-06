package androidx.paging;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\'\u0010\u0006\u001A\u00020\u00052\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0010\u0004\u001A\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/paging/PageKeyedDataSource$continuationAsCallback$1", "Landroidx/paging/PageKeyedDataSource$LoadCallback;", "", "data", "adjacentPageKey", "", "onResult", "(Ljava/util/List;Ljava/lang/Object;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PageKeyedDataSource.continuationAsCallback.1 extends LoadCallback {
    public final CancellableContinuation a;
    public final boolean b;

    public PageKeyedDataSource.continuationAsCallback.1(CancellableContinuation cancellableContinuation0, boolean z) {
        this.a = cancellableContinuation0;
        this.b = z;
        super();
    }

    @Override  // androidx.paging.PageKeyedDataSource$LoadCallback
    public void onResult(@NotNull List list0, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(list0, "data");
        BaseResult dataSource$BaseResult0 = new BaseResult(list0, (this.b ? null : object0), (this.b ? object0 : null), 0, 0, 24, null);
        this.a.resumeWith(dataSource$BaseResult0);
    }
}

