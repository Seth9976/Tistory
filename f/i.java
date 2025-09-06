package f;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class i extends ContinuationImpl {
    public l a;
    public Object b;
    public final l c;
    public int d;

    public i(l l0, Continuation continuation0) {
        this.c = l0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.b = object0;
        this.d |= 0x80000000;
        return this.c.a(null, this);
    }
}

