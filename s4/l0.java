package s4;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class l0 extends ContinuationImpl {
    public Object o;
    public int p;
    public final androidx.paging.PageFetcher.injectRemoteEvents.1.invokeSuspend..inlined.combineWithoutBatching.1.2.1 q;

    public l0(androidx.paging.PageFetcher.injectRemoteEvents.1.invokeSuspend..inlined.combineWithoutBatching.1.2.1 pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$10, Continuation continuation0) {
        this.q = pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$10;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.o = object0;
        this.p |= 0x80000000;
        return this.q.emit(null, this);
    }
}

