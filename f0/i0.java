package f0;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class i0 extends ContinuationImpl {
    public Object o;
    public final j0 p;
    public int q;

    public i0(j0 j00, Continuation continuation0) {
        this.p = j00;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.o = object0;
        this.q |= 0x80000000;
        return this.p.performFling(null, 0.0f, this);
    }
}

