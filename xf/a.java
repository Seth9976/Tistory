package xf;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.internal.SafeCollector;

public final class a extends ContinuationImpl {
    public SafeCollector o;
    public Object p;
    public final AbstractFlow q;
    public int r;

    public a(AbstractFlow abstractFlow0, Continuation continuation0) {
        this.q = abstractFlow0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.collect(null, this);
    }
}

