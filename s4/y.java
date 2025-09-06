package s4;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class y extends ContinuationImpl {
    public z o;
    public ObjectRef p;
    public Object q;
    public final z r;
    public int s;

    public y(z z0, Continuation continuation0) {
        this.r = z0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.emit(null, this);
    }
}

