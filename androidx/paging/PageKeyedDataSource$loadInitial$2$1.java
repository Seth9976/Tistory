package androidx.paging;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001JA\u0010\n\u001A\u00020\t2\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\b\u0010\u0007\u001A\u0004\u0018\u00018\u00002\b\u0010\b\u001A\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000BJ1\u0010\n\u001A\u00020\t2\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0010\u0007\u001A\u0004\u0018\u00018\u00002\b\u0010\b\u001A\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"androidx/paging/PageKeyedDataSource$loadInitial$2$1", "Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;", "", "data", "", "position", "totalCount", "previousPageKey", "nextPageKey", "", "onResult", "(Ljava/util/List;IILjava/lang/Object;Ljava/lang/Object;)V", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PageKeyedDataSource.loadInitial.2.1 extends LoadInitialCallback {
    public final CancellableContinuationImpl a;

    public PageKeyedDataSource.loadInitial.2.1(CancellableContinuationImpl cancellableContinuationImpl0) {
        this.a = cancellableContinuationImpl0;
        super();
    }

    @Override  // androidx.paging.PageKeyedDataSource$LoadInitialCallback
    public void onResult(@NotNull List list0, int v, int v1, @Nullable Object object0, @Nullable Object object1) {
        Intrinsics.checkNotNullParameter(list0, "data");
        BaseResult dataSource$BaseResult0 = new BaseResult(list0, object0, object1, v, v1 - list0.size() - v);
        this.a.resumeWith(dataSource$BaseResult0);
    }

    @Override  // androidx.paging.PageKeyedDataSource$LoadInitialCallback
    public void onResult(@NotNull List list0, @Nullable Object object0, @Nullable Object object1) {
        Intrinsics.checkNotNullParameter(list0, "data");
        BaseResult dataSource$BaseResult0 = new BaseResult(list0, object0, object1, 0, 0, 24, null);
        this.a.resumeWith(dataSource$BaseResult0);
    }
}

