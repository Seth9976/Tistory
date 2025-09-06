package y0;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;

public final class c0 extends ContinuationImpl {
    public Function0 o;
    public Object p;
    public final d0 q;
    public int r;

    public c0(d0 d00, Continuation continuation0) {
        this.q = d00;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.awaitDispose(null, this);
    }
}

