package androidx.paging;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class k1 extends ContinuationImpl {
    public WrapperDataSource o;
    public Object p;
    public final WrapperDataSource q;
    public int r;

    public k1(WrapperDataSource wrapperDataSource0, Continuation continuation0) {
        this.q = wrapperDataSource0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return WrapperDataSource.a(this.q, null, this);
    }
}

