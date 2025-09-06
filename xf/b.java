package xf;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.ProducerScope;

public final class b extends ContinuationImpl {
    public ProducerScope o;
    public Object p;
    public final c q;
    public int r;

    public b(c c0, Continuation continuation0) {
        this.q = c0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.collectTo(null, this);
    }
}

