package androidx.paging;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import qd.a;

public final class k0 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final RemoteMediatorAccessor q;
    public final PageFetcherSnapshot r;
    public final MutableLoadStateCollection s;

    public k0(RemoteMediatorAccessor remoteMediatorAccessor0, PageFetcherSnapshot pageFetcherSnapshot0, MutableLoadStateCollection mutableLoadStateCollection0, Continuation continuation0) {
        this.q = remoteMediatorAccessor0;
        this.r = pageFetcherSnapshot0;
        this.s = mutableLoadStateCollection0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new k0(this.q, this.r, this.s, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((k0)this.create(((SimpleProducerScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                SimpleProducerScope simpleProducerScope0 = (SimpleProducerScope)this.p;
                Flow flow0 = SimpleChannelFlowKt.simpleChannelFlow(new PageFetcher.injectRemoteEvents.1.invokeSuspend..inlined.combineWithoutBatching.1(this.q.getState(), this.r.getPageEventFlow(), null, this.s));
                s4.k0 k00 = new s4.k0(simpleProducerScope0, 0);
                this.o = 1;
                return flow0.collect(k00, this) == object1 ? object1 : Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

