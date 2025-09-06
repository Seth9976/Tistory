package xf;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;

public final class u2 extends ContinuationImpl {
    public v2 o;
    public FlowCollector p;
    public w2 q;
    public Job r;
    public Object s;
    public Object t;
    public final v2 u;
    public int v;

    public u2(v2 v20, Continuation continuation0) {
        this.u = v20;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.t = object0;
        this.v |= 0x80000000;
        return this.u.collect(null, this);
    }
}

