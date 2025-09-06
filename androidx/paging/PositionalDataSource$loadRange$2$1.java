package androidx.paging;

import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001D\u0010\u0005\u001A\u00020\u00042\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/paging/PositionalDataSource$loadRange$2$1", "Landroidx/paging/PositionalDataSource$LoadRangeCallback;", "", "data", "", "onResult", "(Ljava/util/List;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PositionalDataSource.loadRange.2.1 extends LoadRangeCallback {
    public final LoadRangeParams a;
    public final PositionalDataSource b;
    public final CancellableContinuationImpl c;

    public PositionalDataSource.loadRange.2.1(LoadRangeParams positionalDataSource$LoadRangeParams0, PositionalDataSource positionalDataSource0, CancellableContinuationImpl cancellableContinuationImpl0) {
        this.a = positionalDataSource$LoadRangeParams0;
        this.b = positionalDataSource0;
        this.c = cancellableContinuationImpl0;
        super();
    }

    @Override  // androidx.paging.PositionalDataSource$LoadRangeCallback
    public void onResult(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "data");
        LoadRangeParams positionalDataSource$LoadRangeParams0 = this.a;
        Integer integer0 = positionalDataSource$LoadRangeParams0.startPosition == 0 ? null : positionalDataSource$LoadRangeParams0.startPosition;
        CancellableContinuationImpl cancellableContinuationImpl0 = this.c;
        if(this.b.isInvalid()) {
            cancellableContinuationImpl0.resumeWith(Result.constructor-impl(BaseResult.Companion.empty$paging_common_release()));
            return;
        }
        cancellableContinuationImpl0.resumeWith(Result.constructor-impl(new BaseResult(list0, integer0, ((int)(list0.size() + positionalDataSource$LoadRangeParams0.startPosition)), 0, 0, 24, null)));
    }
}

