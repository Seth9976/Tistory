package xf;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class e1 extends ContinuationImpl {
    public Object o;
    public final e p;
    public int q;

    public e1(e e0, Continuation continuation0) {
        this.p = e0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.o = object0;
        this.q |= 0x80000000;
        return this.p.a(null, this);
    }
}

