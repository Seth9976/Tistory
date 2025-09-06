package xf;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.SubscribedFlowCollector;
import kotlinx.coroutines.flow.internal.SafeCollector;

public final class x2 extends ContinuationImpl {
    public SubscribedFlowCollector o;
    public SafeCollector p;
    public Object q;
    public final SubscribedFlowCollector r;
    public int s;

    public x2(SubscribedFlowCollector subscribedFlowCollector0, Continuation continuation0) {
        this.r = subscribedFlowCollector0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.onSubscription(this);
    }
}

