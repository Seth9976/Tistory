package e;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class r extends ContinuationImpl {
    public u a;
    public Object b;
    public final u c;
    public int d;

    public r(u u0, Continuation continuation0) {
        this.c = u0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.b = object0;
        this.d |= 0x80000000;
        return this.c.a(null, this);
    }
}

