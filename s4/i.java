package s4;

import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class i extends ContinuationImpl {
    public j o;
    public IndexedValue p;
    public Object q;
    public final j r;
    public int s;

    public i(j j0, Continuation continuation0) {
        this.r = j0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.a(null, this);
    }
}

