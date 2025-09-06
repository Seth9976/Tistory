package kotlinx.coroutines.flow.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.channels.ChannelResult.Failed;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class o extends SuspendLambda implements Function2 {
    public FlowCollector o;
    public int p;
    public final ReceiveChannel q;
    public final FlowCollector r;
    public final Function3 s;
    public final Object t;

    public o(ReceiveChannel receiveChannel0, FlowCollector flowCollector0, Function3 function30, Object object0, Continuation continuation0) {
        this.q = receiveChannel0;
        this.r = flowCollector0;
        this.s = function30;
        this.t = object0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new o(this.q, this.r, this.s, this.t, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((o)this.create(((Unit)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        FlowCollector flowCollector1;
        Object object2;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.p = 1;
                object2 = this.q.receiveCatching-JP2dKIU(this);
                if(object2 == object1) {
                    return object1;
                }
                goto label_12;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                object2 = ((ChannelResult)object0).unbox-impl();
            label_12:
                FlowCollector flowCollector0 = this.r;
                if(object2 instanceof Failed) {
                    Throwable throwable0 = ChannelResult.exceptionOrNull-impl(object2);
                    if(throwable0 == null) {
                        throwable0 = new AbortFlowException(flowCollector0);
                    }
                    throw throwable0;
                }
                if(object2 == NullSurrogateKt.NULL) {
                    object2 = null;
                }
                this.o = flowCollector0;
                this.p = 2;
                object0 = this.s.invoke(this.t, object2, this);
                if(object0 == object1) {
                    return object1;
                }
                flowCollector1 = flowCollector0;
                break;
            }
            case 2: {
                flowCollector1 = this.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 3: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.o = null;
        this.p = 3;
        return flowCollector1.emit(object0, this) == object1 ? object1 : Unit.INSTANCE;
    }
}

