package androidx.paging;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.sync.Mutex;
import qd.a;

public final class n0 extends SuspendLambda implements Function2 {
    public Mutex o;
    public FlowCollector p;
    public int q;
    public Object r;
    public final PageFetcherSnapshot s;

    public n0(PageFetcherSnapshot pageFetcherSnapshot0, Continuation continuation0) {
        this.s = pageFetcherSnapshot0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new n0(this.s, continuation0);
        continuation1.r = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((n0)this.create(((FlowCollector)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        LoadStates loadStates0;
        Mutex mutex1;
        Holder pageFetcherSnapshotState$Holder0;
        FlowCollector flowCollector0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                flowCollector0 = (FlowCollector)this.r;
                pageFetcherSnapshotState$Holder0 = this.s.k;
                Mutex mutex0 = pageFetcherSnapshotState$Holder0.a;
                this.r = pageFetcherSnapshotState$Holder0;
                this.o = mutex0;
                this.p = flowCollector0;
                this.q = 1;
                if(mutex0.lock(null, this) == object1) {
                    return object1;
                }
                mutex1 = mutex0;
                break;
            }
            case 1: {
                flowCollector0 = this.p;
                mutex1 = this.o;
                pageFetcherSnapshotState$Holder0 = (Holder)this.r;
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
            loadStates0 = pageFetcherSnapshotState$Holder0.b.getSourceLoadStates$paging_common_release().snapshot();
        }
        finally {
            mutex1.unlock(null);
        }
        LoadStateUpdate pageEvent$LoadStateUpdate0 = new LoadStateUpdate(loadStates0, null, 2, null);
        this.r = null;
        this.o = null;
        this.p = null;
        this.q = 2;
        return flowCollector0.emit(pageEvent$LoadStateUpdate0, this) == object1 ? object1 : Unit.INSTANCE;
    }
}

