package xf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ChannelResult.Closed;
import kotlinx.coroutines.channels.ChannelResult.Failed;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class f0 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final FlowCollector q;

    public f0(FlowCollector flowCollector0, Continuation continuation0) {
        this.q = flowCollector0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new f0(this.q, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((f0)this.create(ChannelResult.box-impl(((ChannelResult)object0).unbox-impl()), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object2;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                object2 = ((ChannelResult)this.p).unbox-impl();
                if(!(object2 instanceof Failed)) {
                    this.p = object2;
                    this.o = 1;
                    if(this.q.emit(object2, this) == object1) {
                        return object1;
                    }
                }
                break;
            }
            case 1: {
                Object object3 = this.p;
                ResultKt.throwOnFailure(object0);
                object2 = object3;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return object2 instanceof Closed ? Boxing.boxBoolean(false) : Boxing.boxBoolean(true);
    }
}

