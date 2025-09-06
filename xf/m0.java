package xf;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class m0 extends ContinuationImpl {
    public Object o;
    public final n0 p;
    public int q;

    public m0(n0 n00, Continuation continuation0) {
        this.p = n00;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.o = object0;
        this.q |= 0x80000000;
        return this.p.emit(null, this);
    }
}

