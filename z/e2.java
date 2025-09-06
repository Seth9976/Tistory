package z;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class e2 extends ContinuationImpl {
    public long o;
    public Object p;
    public final f2 q;
    public int r;

    public e2(f2 f20, Continuation continuation0) {
        this.q = f20;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.onPostFling-RZ2iAVY(0L, 0L, this);
    }
}

