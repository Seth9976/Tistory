package f2;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class f extends ContinuationImpl {
    public g o;
    public Object p;
    public final g q;
    public int r;

    public f(g g0, ContinuationImpl continuationImpl0) {
        this.q = g0;
        super(continuationImpl0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.a(0.0f, this);
    }
}

