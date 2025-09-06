package androidx.lifecycle;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class h extends ContinuationImpl {
    public CoroutineLiveData o;
    public LiveData p;
    public Object q;
    public final CoroutineLiveData r;
    public int s;

    public h(CoroutineLiveData coroutineLiveData0, Continuation continuation0) {
        this.r = coroutineLiveData0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.emitSource$lifecycle_livedata_release(null, this);
    }
}

