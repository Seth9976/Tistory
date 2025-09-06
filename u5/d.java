package u5;

import coil.intercept.Interceptor;
import coil.intercept.RealInterceptorChain;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class d extends ContinuationImpl {
    public RealInterceptorChain o;
    public Interceptor p;
    public Object q;
    public final RealInterceptorChain r;
    public int s;

    public d(RealInterceptorChain realInterceptorChain0, Continuation continuation0) {
        this.r = realInterceptorChain0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.proceed(null, this);
    }
}

