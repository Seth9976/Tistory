package a;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class g extends ContinuationImpl {
    public Object a;
    public int b;
    public final h c;

    public g(h h0, Continuation continuation0) {
        this.c = h0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.a = object0;
        this.b |= 0x80000000;
        return this.c.emit(null, this);
    }
}

