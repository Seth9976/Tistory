package androidx.paging;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.sync.Mutex;
import qd.a;
import s4.s0;
import s4.t0;
import s4.v0;

public final class m0 extends SuspendLambda implements Function2 {
    public Object o;
    public Object p;
    public Mutex q;
    public int r;
    public Object s;
    public final PageFetcherSnapshot t;

    public m0(PageFetcherSnapshot pageFetcherSnapshot0, Continuation continuation0) {
        this.t = pageFetcherSnapshot0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new m0(this.t, continuation0);
        continuation1.s = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((m0)this.create(((SimpleProducerScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        PagingState pagingState1;
        Mutex mutex3;
        SimpleProducerScope simpleProducerScope3;
        Holder pageFetcherSnapshotState$Holder2;
        SimpleProducerScope simpleProducerScope1;
        Mutex mutex1;
        Holder pageFetcherSnapshotState$Holder1;
        PagingState pagingState0;
        RemoteMediatorConnection remoteMediatorConnection0;
        SimpleProducerScope simpleProducerScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        PageFetcherSnapshot pageFetcherSnapshot0 = this.t;
        switch(this.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                simpleProducerScope0 = (SimpleProducerScope)this.s;
                if(!pageFetcherSnapshot0.i.compareAndSet(false, true)) {
                    throw new IllegalStateException("Attempt to collect twice from pageEventFlow, which is an illegal operation. Did you forget to call Flow<PagingData<*>>.cachedIn(coroutineScope)?");
                }
                BuildersKt.launch$default(simpleProducerScope0, null, null, new s0(pageFetcherSnapshot0, simpleProducerScope0, null), 3, null);
                Channel channel0 = ChannelKt.Channel$default(0, null, null, 6, null);
                BuildersKt.launch$default(simpleProducerScope0, null, null, new t0(pageFetcherSnapshot0, null, channel0), 3, null);
                BuildersKt.launch$default(simpleProducerScope0, null, null, new v0(pageFetcherSnapshot0, null, channel0), 3, null);
                remoteMediatorConnection0 = pageFetcherSnapshot0.getRemoteMediatorConnection();
                if(remoteMediatorConnection0 != null) {
                    pagingState0 = pageFetcherSnapshot0.f;
                    if(pagingState0 == null) {
                        Holder pageFetcherSnapshotState$Holder0 = pageFetcherSnapshot0.k;
                        Mutex mutex0 = pageFetcherSnapshotState$Holder0.a;
                        this.s = simpleProducerScope0;
                        this.o = remoteMediatorConnection0;
                        this.p = pageFetcherSnapshotState$Holder0;
                        this.q = mutex0;
                        this.r = 1;
                        if(mutex0.lock(null, this) == object1) {
                            return object1;
                        }
                        pageFetcherSnapshotState$Holder1 = pageFetcherSnapshotState$Holder0;
                        mutex1 = mutex0;
                        simpleProducerScope1 = simpleProducerScope0;
                        goto label_34;
                    }
                    goto label_41;
                }
                goto label_42;
            }
            case 1: {
                mutex1 = this.q;
                pageFetcherSnapshotState$Holder1 = (Holder)this.p;
                remoteMediatorConnection0 = (RemoteMediatorConnection)this.o;
                simpleProducerScope1 = (SimpleProducerScope)this.s;
                ResultKt.throwOnFailure(object0);
            label_34:
                try {
                    pagingState1 = pageFetcherSnapshotState$Holder1.b.currentPagingState$paging_common_release(null);
                }
                finally {
                    mutex1.unlock(null);
                }
                pagingState0 = pagingState1;
                simpleProducerScope0 = simpleProducerScope1;
            label_41:
                remoteMediatorConnection0.requestRefreshIfAllowed(pagingState0);
            label_42:
                this.s = simpleProducerScope0;
                this.o = null;
                this.p = null;
                this.q = null;
                this.r = 2;
                if(pageFetcherSnapshot0.a(this) == object1) {
                    return object1;
                }
                goto label_52;
            }
            case 2: {
                SimpleProducerScope simpleProducerScope2 = (SimpleProducerScope)this.s;
                ResultKt.throwOnFailure(object0);
                simpleProducerScope0 = simpleProducerScope2;
            label_52:
                pageFetcherSnapshotState$Holder2 = pageFetcherSnapshot0.k;
                Mutex mutex2 = pageFetcherSnapshotState$Holder2.a;
                this.s = simpleProducerScope0;
                this.o = pageFetcherSnapshotState$Holder2;
                this.p = mutex2;
                this.r = 3;
                if(mutex2.lock(null, this) == object1) {
                    return object1;
                }
                simpleProducerScope3 = simpleProducerScope0;
                mutex3 = mutex2;
                break;
            }
            case 3: {
                mutex3 = (Mutex)this.p;
                pageFetcherSnapshotState$Holder2 = (Holder)this.o;
                simpleProducerScope3 = (SimpleProducerScope)this.s;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            LoadState loadState0 = pageFetcherSnapshotState$Holder2.b.getSourceLoadStates$paging_common_release().get(LoadType.REFRESH);
        }
        finally {
            mutex3.unlock(null);
        }
        if(!(loadState0 instanceof Error)) {
            PageFetcherSnapshot.access$startConsumingHints(pageFetcherSnapshot0, simpleProducerScope3);
        }
        return Unit.INSTANCE;
    }
}

