package xf;

import androidx.lifecycle.n;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class w extends ContinuationImpl {
    public Object o;
    public final n p;
    public int q;

    public w(n n0, Continuation continuation0) {
        this.p = n0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.o = object0;
        this.q |= 0x80000000;
        return this.p.emit(null, this);
    }
}

