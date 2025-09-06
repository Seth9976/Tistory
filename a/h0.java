package a;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class h0 extends ContinuationImpl {
    public Object a;
    public int b;
    public final i0 c;

    public h0(i0 i00, Continuation continuation0) {
        this.c = i00;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.a = object0;
        this.b |= 0x80000000;
        return this.c.emit(null, this);
    }
}

