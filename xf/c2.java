package xf;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class c2 extends ContinuationImpl {
    public d2 o;
    public ObjectRef p;
    public Object q;
    public final d2 r;
    public int s;

    public c2(d2 d20, Continuation continuation0) {
        this.r = d20;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.emit(null, this);
    }
}

