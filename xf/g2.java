package xf;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class g2 extends ContinuationImpl {
    public Object o;
    public final h2 p;
    public int q;

    public g2(h2 h20, Continuation continuation0) {
        this.p = h20;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.o = object0;
        this.q |= 0x80000000;
        return this.p.emit(null, this);
    }
}

