package androidx.paging;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.sync.Mutex;

public final class q0 extends ContinuationImpl {
    public Holder o;
    public Function1 p;
    public Mutex q;
    public Object r;
    public final Holder s;
    public int t;

    public q0(Holder pageFetcherSnapshotState$Holder0, Continuation continuation0) {
        this.s = pageFetcherSnapshotState$Holder0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.t |= 0x80000000;
        return this.s.withLock(null, this);
    }
}

