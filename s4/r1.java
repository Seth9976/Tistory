package s4;

import androidx.paging.f1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class r1 extends ContinuationImpl {
    public f1 o;
    public Object p;
    public final f1 q;
    public int r;

    public r1(f1 f10, Continuation continuation0) {
        this.q = f10;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.initialize(this);
    }
}

