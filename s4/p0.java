package s4;

import androidx.paging.PageFetcherSnapshot;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

public final class p0 extends ContinuationImpl {
    public Object o;
    public Object p;
    public Object q;
    public Mutex r;
    public Object s;
    public final PageFetcherSnapshot t;
    public int u;

    public p0(PageFetcherSnapshot pageFetcherSnapshot0, Continuation continuation0) {
        this.t = pageFetcherSnapshot0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.s = object0;
        this.u |= 0x80000000;
        return this.t.a(this);
    }
}

