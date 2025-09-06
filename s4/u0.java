package s4;

import androidx.paging.PageFetcherSnapshot;
import androidx.paging.l0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class u0 extends ContinuationImpl {
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public Object s;
    public Object t;
    public Object u;
    public PageFetcherSnapshot v;
    public Object w;
    public final l0 x;
    public int y;

    public u0(l0 l00, Continuation continuation0) {
        this.x = l00;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.w = object0;
        this.y |= 0x80000000;
        return this.x.a(this);
    }
}

