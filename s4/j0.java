package s4;

import androidx.paging.PageFetcher;
import androidx.paging.PagingSource;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class j0 extends ContinuationImpl {
    public PageFetcher o;
    public PagingSource p;
    public Object q;
    public final PageFetcher r;
    public int s;

    public j0(PageFetcher pageFetcher0, Continuation continuation0) {
        this.r = pageFetcher0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return PageFetcher.access$generateNewPagingSource(this.r, null, this);
    }
}

