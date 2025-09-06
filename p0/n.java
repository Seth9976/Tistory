package p0;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.Job;

public final class n extends ContinuationImpl {
    public o o;
    public Object p;
    public Job q;
    public Object r;
    public final o s;
    public int t;

    public n(o o0, Continuation continuation0) {
        this.s = o0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.t |= 0x80000000;
        return this.s.emit(null, this);
    }
}

