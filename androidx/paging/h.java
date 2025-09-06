package androidx.paging;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class h extends SuspendLambda implements Function3 {
    public int o;
    public final ActiveFlowTracker p;

    public h(ActiveFlowTracker activeFlowTracker0, Continuation continuation0) {
        this.p = activeFlowTracker0;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        FlowCollector flowCollector0 = (FlowCollector)object0;
        Throwable throwable0 = (Throwable)object1;
        return new h(this.p, ((Continuation)object2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ActiveFlowTracker activeFlowTracker0 = this.p;
                if(activeFlowTracker0 != null) {
                    this.o = 1;
                    if(activeFlowTracker0.onComplete(FlowType.PAGED_DATA_FLOW, this) == object1) {
                        return object1;
                    }
                }
                return Unit.INSTANCE;
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

