package xf;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class y2 extends ContinuationImpl {
    public Object o;
    public final z2 p;
    public int q;

    public y2(z2 z20, Continuation continuation0) {
        this.p = z20;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.o = object0;
        this.q |= 0x80000000;
        return this.p.collect(null, this);
    }
}

