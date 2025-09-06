package xf;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class v0 extends ContinuationImpl {
    public Object o;
    public final w0 p;
    public int q;

    public v0(w0 w00, Continuation continuation0) {
        this.p = w00;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.o = object0;
        this.q |= 0x80000000;
        return this.p.emit(null, this);
    }
}

