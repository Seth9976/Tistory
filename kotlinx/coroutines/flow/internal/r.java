package kotlinx.coroutines.flow.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class r extends SuspendLambda implements Function2 {
    public int o;
    public final Flow p;
    public final CoroutineContext q;
    public final Object r;
    public final ReceiveChannel s;
    public final FlowCollector t;
    public final Function3 u;

    public r(Flow flow0, CoroutineContext coroutineContext0, Object object0, ReceiveChannel receiveChannel0, FlowCollector flowCollector0, Function3 function30, Continuation continuation0) {
        this.p = flow0;
        this.q = coroutineContext0;
        this.r = object0;
        this.s = receiveChannel0;
        this.t = flowCollector0;
        this.u = function30;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new r(this.p, this.q, this.r, this.s, this.t, this.u, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((r)this.create(((Unit)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                q q0 = new q(this.q, this.r, this.s, this.t, this.u);
                this.o = 1;
                return this.p.collect(q0, this) == object1 ? object1 : Unit.INSTANCE;
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

