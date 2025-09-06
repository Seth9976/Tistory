package xf;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class x0 extends ContinuationImpl {
    public y0 o;
    public Object p;
    public Object q;
    public final y0 r;
    public int s;

    public x0(y0 y00, Continuation continuation0) {
        this.r = y00;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.emit(null, this);
    }
}

