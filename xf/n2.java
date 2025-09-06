package xf;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowSlot;

public final class n2 extends ContinuationImpl {
    public SharedFlowImpl o;
    public FlowCollector p;
    public SharedFlowSlot q;
    public Job r;
    public Object s;
    public final SharedFlowImpl t;
    public int u;

    public n2(SharedFlowImpl sharedFlowImpl0, Continuation continuation0) {
        this.t = sharedFlowImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.s = object0;
        this.u |= 0x80000000;
        return SharedFlowImpl.c(this.t, null, this);
    }
}

