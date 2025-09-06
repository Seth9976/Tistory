package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.Job;

public final class g extends ContinuationImpl {
    public h o;
    public Object p;
    public Job q;
    public Object r;
    public final h s;
    public int t;

    public g(h h0, Continuation continuation0) {
        this.s = h0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.t |= 0x80000000;
        return this.s.emit(null, this);
    }
}

