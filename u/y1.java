package u;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class y1 extends ContinuationImpl {
    public b2 o;
    public Object p;
    public final b2 q;
    public int r;

    public y1(b2 b20, ContinuationImpl continuationImpl0) {
        this.q = b20;
        super(continuationImpl0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return b2.c(this.q, this);
    }
}

