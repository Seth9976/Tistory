package xf;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class e2 extends ContinuationImpl {
    public f2 o;
    public ObjectRef p;
    public Object q;
    public final f2 r;
    public int s;

    public e2(f2 f20, Continuation continuation0) {
        this.r = f20;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.emit(null, this);
    }
}

