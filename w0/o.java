package w0;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.Job;

public final class o extends ContinuationImpl {
    public p o;
    public Object p;
    public Job q;
    public Object r;
    public final p s;
    public int t;

    public o(p p0, Continuation continuation0) {
        this.s = p0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.t |= 0x80000000;
        return this.s.emit(null, this);
    }
}

