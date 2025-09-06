package s4;

import androidx.paging.PageFetcherSnapshot;
import androidx.paging.PageFetcherSnapshotState.Holder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

public final class o0 extends ContinuationImpl {
    public PageFetcherSnapshot o;
    public Holder p;
    public Mutex q;
    public Object r;
    public final PageFetcherSnapshot s;
    public int t;

    public o0(PageFetcherSnapshot pageFetcherSnapshot0, Continuation continuation0) {
        this.s = pageFetcherSnapshot0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.t |= 0x80000000;
        return this.s.currentPagingState(this);
    }
}

