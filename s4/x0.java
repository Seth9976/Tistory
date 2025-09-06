package s4;

import androidx.paging.LoadType;
import androidx.paging.PageFetcherSnapshot;
import androidx.paging.PagingLogger;
import androidx.paging.ViewportHint;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import qd.a;

public final class x0 extends SuspendLambda implements Function2 {
    public int o;
    public final PageFetcherSnapshot p;

    public x0(PageFetcherSnapshot pageFetcherSnapshot0, Continuation continuation0) {
        this.p = pageFetcherSnapshot0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new x0(this.p, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((x0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        PageFetcherSnapshot pageFetcherSnapshot0 = this.p;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Flow flow0 = FlowKt.merge(new Flow[]{pageFetcherSnapshot0.h.hintFor(LoadType.APPEND), pageFetcherSnapshot0.h.hintFor(LoadType.PREPEND)});
                w0 w00 = new w0(pageFetcherSnapshot0, null);
                this.o = 1;
                object0 = FlowKt.firstOrNull(flow0, w00, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((ViewportHint)object0) != null) {
            PagingLogger pagingLogger0 = PagingLogger.INSTANCE;
            if(pagingLogger0.isLoggable(3)) {
                pagingLogger0.log(3, "Jump triggered on PagingSource " + pageFetcherSnapshot0.getPagingSource$paging_common_release() + " by " + ((ViewportHint)object0), null);
            }
            pageFetcherSnapshot0.g.invoke();
        }
        return Unit.INSTANCE;
    }
}

