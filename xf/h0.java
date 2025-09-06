package xf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.selects.OnTimeoutKt;
import kotlinx.coroutines.selects.SelectImplementation;
import qd.a;

public final class h0 extends SuspendLambda implements Function3 {
    public long o;
    public int p;
    public Object q;
    public Object r;
    public final long s;
    public final Flow t;

    public h0(long v, Flow flow0, Continuation continuation0) {
        this.s = v;
        this.t = flow0;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        h0 h00 = new h0(this.s, this.t, ((Continuation)object2));
        h00.q = (CoroutineScope)object0;
        h00.r = (FlowCollector)object1;
        return h00.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ReceiveChannel receiveChannel0;
        FlowCollector flowCollector1;
        long v1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineScope coroutineScope0 = (CoroutineScope)this.q;
                FlowCollector flowCollector0 = (FlowCollector)this.r;
                long v = this.s;
                if(Duration.compareTo-LRDsOJo(v, 0L) <= 0) {
                    throw new TimeoutCancellationException("Timed out immediately");
                }
                v1 = v;
                flowCollector1 = flowCollector0;
                receiveChannel0 = FlowKt.produceIn(FlowKt.buffer$default(this.t, 0, null, 2, null), coroutineScope0);
                goto label_19;
            }
            case 1: {
                v1 = this.o;
                receiveChannel0 = (ReceiveChannel)this.r;
                flowCollector1 = (FlowCollector)this.q;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            if(!((Boolean)object0).booleanValue()) {
                return Unit.INSTANCE;
            }
        label_19:
            SelectImplementation selectImplementation0 = new SelectImplementation(this.getContext());
            selectImplementation0.invoke(receiveChannel0.getOnReceiveCatching(), new f0(flowCollector1, null));
            OnTimeoutKt.onTimeout-8Mi8wO0(selectImplementation0, v1, new g0(v1, null));
            this.q = flowCollector1;
            this.r = receiveChannel0;
            this.o = v1;
            this.p = 1;
            object0 = selectImplementation0.doSelect(this);
        }
        while(object0 != object1);
        return object1;
    }
}

