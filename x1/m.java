package x1;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.Job;

public final class m extends ContinuationImpl {
    public Job o;
    public Object p;
    public final p q;
    public int r;

    public m(p p0, Continuation continuation0) {
        this.q = p0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.withTimeout(0L, null, this);
    }
}

