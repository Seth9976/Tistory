package xf;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class l0 extends ContinuationImpl {
    public Throwable o;
    public Object p;
    public int q;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.q |= 0x80000000;
        return o0.a(null, null, null, this);
    }
}

