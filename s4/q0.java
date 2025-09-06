package s4;

import androidx.paging.PageFetcherSnapshot;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

public final class q0 extends ContinuationImpl {
    public int A;
    public Object B;
    public final PageFetcherSnapshot C;
    public int D;
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public Object s;
    public Object t;
    public Object u;
    public Object v;
    public Object w;
    public Object x;
    public Mutex y;
    public int z;

    public q0(PageFetcherSnapshot pageFetcherSnapshot0, Continuation continuation0) {
        this.C = pageFetcherSnapshot0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.B = object0;
        this.D |= 0x80000000;
        return PageFetcherSnapshot.access$doLoad(this.C, null, null, this);
    }
}

