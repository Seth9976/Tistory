package xf;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class p2 extends ContinuationImpl {
    public Object o;
    public final q2 p;
    public int q;

    public p2(q2 q20, Continuation continuation0) {
        this.p = q20;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.o = object0;
        this.q |= 0x80000000;
        return this.p.a(0, this);
    }
}

