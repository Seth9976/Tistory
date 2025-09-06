package x1;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class o extends ContinuationImpl {
    public Object o;
    public final p p;
    public int q;

    public o(p p0, Continuation continuation0) {
        this.p = p0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.o = object0;
        this.q |= 0x80000000;
        return this.p.withTimeoutOrNull(0L, null, this);
    }
}

