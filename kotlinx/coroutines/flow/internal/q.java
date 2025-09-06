package kotlinx.coroutines.flow.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class q implements FlowCollector {
    public final CoroutineContext a;
    public final Object b;
    public final ReceiveChannel c;
    public final FlowCollector d;
    public final Function3 e;

    public q(CoroutineContext coroutineContext0, Object object0, ReceiveChannel receiveChannel0, FlowCollector flowCollector0, Function3 function30) {
        this.a = coroutineContext0;
        this.b = object0;
        this.c = receiveChannel0;
        this.d = flowCollector0;
        this.e = function30;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        p p0;
        if(continuation0 instanceof p) {
            p0 = (p)continuation0;
            int v = p0.q;
            if((v & 0x80000000) == 0) {
                p0 = new p(this, continuation0);
            }
            else {
                p0.q = v ^ 0x80000000;
            }
        }
        else {
            p0 = new p(this, continuation0);
        }
        Object object1 = p0.o;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(p0.q) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                o o0 = new o(this.c, this.d, this.e, object0, null);
                p0.q = 1;
                return ChannelFlowKt.withContextUndispatched(this.a, Unit.INSTANCE, this.b, o0, p0) == object2 ? object2 : Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object1);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

