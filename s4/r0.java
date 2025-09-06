package s4;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class r0 extends ContinuationImpl {
    public Object o;
    public final k0 p;
    public int q;

    public r0(k0 k00, Continuation continuation0) {
        this.p = k00;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.o = object0;
        this.q |= 0x80000000;
        return this.p.a(null, this);
    }
}

