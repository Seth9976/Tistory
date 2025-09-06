package androidx.lifecycle;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class g extends ContinuationImpl {
    public CoroutineLiveData o;
    public Object p;
    public final CoroutineLiveData q;
    public int r;

    public g(CoroutineLiveData coroutineLiveData0, Continuation continuation0) {
        this.q = coroutineLiveData0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.clearSource$lifecycle_livedata_release(this);
    }
}

