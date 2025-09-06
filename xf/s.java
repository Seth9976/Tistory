package xf;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class s extends ContinuationImpl {
    public t o;
    public Object p;
    public final t q;
    public int r;

    public s(t t0, Continuation continuation0) {
        this.q = t0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.emit(null, this);
    }
}

