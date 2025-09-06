package t0;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class h extends ContinuationImpl {
    public Object o;
    public final i p;
    public int q;

    public h(i i0, Continuation continuation0) {
        this.p = i0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.o = object0;
        this.q |= 0x80000000;
        return this.p.onPreFling-QWom1Mo(0L, this);
    }
}

