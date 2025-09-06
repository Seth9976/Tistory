package s4;

import androidx.paging.SimpleProducerScopeImpl;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.Job;

public final class c2 extends ContinuationImpl {
    public Function0 o;
    public Job p;
    public Object q;
    public final SimpleProducerScopeImpl r;
    public int s;

    public c2(SimpleProducerScopeImpl simpleProducerScopeImpl0, Continuation continuation0) {
        this.r = simpleProducerScopeImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.awaitClose(null, this);
    }
}

