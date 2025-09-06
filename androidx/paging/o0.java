package androidx.paging;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.sync.Mutex;
import qd.a;

public final class o0 extends SuspendLambda implements Function2 {
    public Holder o;
    public Mutex p;
    public PageFetcherSnapshot q;
    public int r;
    public final PageFetcherSnapshot s;

    public o0(PageFetcherSnapshot pageFetcherSnapshot0, Continuation continuation0) {
        this.s = pageFetcherSnapshot0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new o0(this.s, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((o0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Flow flow0;
        Mutex mutex1;
        Holder pageFetcherSnapshotState$Holder0;
        PageFetcherSnapshot pageFetcherSnapshot0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                pageFetcherSnapshot0 = this.s;
                pageFetcherSnapshotState$Holder0 = pageFetcherSnapshot0.k;
                Mutex mutex0 = pageFetcherSnapshotState$Holder0.a;
                this.o = pageFetcherSnapshotState$Holder0;
                this.p = mutex0;
                this.q = pageFetcherSnapshot0;
                this.r = 1;
                if(mutex0.lock(null, this) == object1) {
                    return object1;
                }
                mutex1 = mutex0;
                break;
            }
            case 1: {
                pageFetcherSnapshot0 = this.q;
                mutex1 = this.p;
                pageFetcherSnapshotState$Holder0 = this.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            flow0 = pageFetcherSnapshotState$Holder0.b.consumePrependGenerationIdAsFlow();
        }
        finally {
            mutex1.unlock(null);
        }
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = 2;
        return PageFetcherSnapshot.access$collectAsGenerationalViewportHints(pageFetcherSnapshot0, flow0, LoadType.PREPEND, this) == object1 ? object1 : Unit.INSTANCE;
    }
}

