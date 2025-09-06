package xf;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class q0 extends ContinuationImpl {
    public r0 o;
    public Object p;
    public final r0 q;
    public int r;

    public q0(r0 r00, Continuation continuation0) {
        this.q = r00;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.emit(null, this);
    }
}

