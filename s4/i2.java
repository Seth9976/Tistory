package s4;

import androidx.paging.SingleRunner;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class i2 extends ContinuationImpl {
    public SingleRunner o;
    public Object p;
    public final SingleRunner q;
    public int r;

    public i2(SingleRunner singleRunner0, Continuation continuation0) {
        this.q = singleRunner0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.runInIsolation(0, null, this);
    }
}

