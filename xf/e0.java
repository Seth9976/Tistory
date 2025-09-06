package xf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.selects.SelectImplementation;
import qd.a;

public final class e0 extends SuspendLambda implements Function3 {
    public ObjectRef o;
    public ReceiveChannel p;
    public int q;
    public Object r;
    public Object s;
    public final long t;
    public final Flow u;

    public e0(long v, Flow flow0, Continuation continuation0) {
        this.t = v;
        this.u = flow0;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        e0 e00 = new e0(this.t, this.u, ((Continuation)object2));
        e00.r = (CoroutineScope)object0;
        e00.s = (FlowCollector)object1;
        return e00.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ReceiveChannel receiveChannel1;
        ObjectRef ref$ObjectRef0;
        ReceiveChannel receiveChannel0;
        FlowCollector flowCollector0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineScope coroutineScope0 = (CoroutineScope)this.r;
                flowCollector0 = (FlowCollector)this.s;
                receiveChannel0 = ProduceKt.produce$default(coroutineScope0, null, -1, new d0(this.u, null), 1, null);
                ref$ObjectRef0 = new ObjectRef();
                receiveChannel1 = FlowKt.fixedPeriodTicker$default(coroutineScope0, this.t, 0L, 2, null);
                break;
            }
            case 1: {
                receiveChannel1 = this.p;
                ref$ObjectRef0 = this.o;
                receiveChannel0 = (ReceiveChannel)this.s;
                flowCollector0 = (FlowCollector)this.r;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(ref$ObjectRef0.element != NullSurrogateKt.DONE) {
            SelectImplementation selectImplementation0 = new SelectImplementation(this.getContext());
            selectImplementation0.invoke(receiveChannel0.getOnReceiveCatching(), new a0(ref$ObjectRef0, receiveChannel1, null));
            selectImplementation0.invoke(receiveChannel1.getOnReceive(), new b0(null, ref$ObjectRef0, flowCollector0));
            this.r = flowCollector0;
            this.s = receiveChannel0;
            this.o = ref$ObjectRef0;
            this.p = receiveChannel1;
            this.q = 1;
            if(selectImplementation0.doSelect(this) == object1) {
                return object1;
            }
            if(false) {
                break;
            }
        }
        return Unit.INSTANCE;
    }
}

