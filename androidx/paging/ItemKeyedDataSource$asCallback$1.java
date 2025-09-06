package androidx.paging;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001D\u0010\u0005\u001A\u00020\u00042\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/paging/ItemKeyedDataSource$asCallback$1", "Landroidx/paging/ItemKeyedDataSource$LoadCallback;", "", "data", "", "onResult", "(Ljava/util/List;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ItemKeyedDataSource.asCallback.1 extends LoadCallback {
    public final CancellableContinuation a;
    public final ItemKeyedDataSource b;

    public ItemKeyedDataSource.asCallback.1(ItemKeyedDataSource itemKeyedDataSource0, CancellableContinuation cancellableContinuation0) {
        this.a = cancellableContinuation0;
        this.b = itemKeyedDataSource0;
        super();
    }

    @Override  // androidx.paging.ItemKeyedDataSource$LoadCallback
    public void onResult(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "data");
        BaseResult dataSource$BaseResult0 = new BaseResult(list0, this.b.getPrevKey$paging_common_release(list0), this.b.getNextKey$paging_common_release(list0), 0, 0, 24, null);
        this.a.resumeWith(dataSource$BaseResult0);
    }
}

