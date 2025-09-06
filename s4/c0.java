package s4;

import androidx.paging.ChannelFlowCollector;
import androidx.paging.SimpleProducerScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import qd.a;

public final class c0 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final Flow q;
    public final Function3 r;

    public c0(Flow flow0, Function3 function30, Continuation continuation0) {
        this.q = flow0;
        this.r = function30;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new c0(this.q, this.r, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((c0)this.create(((SimpleProducerScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ChannelFlowCollector channelFlowCollector0 = new ChannelFlowCollector(((SimpleProducerScope)this.p));
                b0 b00 = new b0(this.r, channelFlowCollector0, null);
                this.o = 1;
                return FlowKt.collectLatest(this.q, b00, this) == object1 ? object1 : Unit.INSTANCE;
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

