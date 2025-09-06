package s4;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class v extends ContinuationImpl {
    public w o;
    public ObjectRef p;
    public Object q;
    public final w r;
    public int s;

    public v(w w0, Continuation continuation0) {
        this.r = w0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.emit(null, this);
    }
}

