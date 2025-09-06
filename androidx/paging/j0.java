package androidx.paging;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import qd.a;

public final class j0 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final RemoteMediator q;
    public final PageFetcher r;

    public j0(RemoteMediator remoteMediator0, PageFetcher pageFetcher0, Continuation continuation0) {
        this.q = remoteMediator0;
        this.r = pageFetcher0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new j0(this.q, this.r, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((j0)this.create(((SimpleProducerScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                SimpleProducerScope simpleProducerScope0 = (SimpleProducerScope)this.p;
                RemoteMediatorAccessor remoteMediatorAccessor0 = this.q == null ? null : RemoteMediatorAccessorKt.RemoteMediatorAccessor(simpleProducerScope0, this.q);
                Flow flow0 = FlowExtKt.simpleTransformLatest(FlowKt.filterNotNull(FlowExtKt.simpleScan(FlowKt.onStart(this.r.d.getFlow(), new h0(remoteMediatorAccessor0, null)), null, new i0(null, this.r, remoteMediatorAccessor0))), new PageFetcher.flow.1.invokeSuspend..inlined.simpleMapLatest.1(null, this.r, remoteMediatorAccessor0));
                s4.i0 i00 = new s4.i0(simpleProducerScope0);
                this.o = 1;
                return flow0.collect(i00, this) == object1 ? object1 : Unit.INSTANCE;
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

