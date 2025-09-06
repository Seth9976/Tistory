package xf;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class s1 extends ContinuationImpl {
    public ObjectRef o;
    public Object p;
    public final t1 q;
    public int r;

    public s1(t1 t10, Continuation continuation0) {
        this.q = t10;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.emit(null, this);
    }
}

