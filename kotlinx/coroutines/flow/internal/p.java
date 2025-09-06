package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class p extends ContinuationImpl {
    public Object o;
    public final q p;
    public int q;

    public p(q q0, Continuation continuation0) {
        this.p = q0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.o = object0;
        this.q |= 0x80000000;
        return this.p.emit(null, this);
    }
}

