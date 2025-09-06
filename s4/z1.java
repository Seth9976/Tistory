package s4;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.SendChannel.DefaultImpls;
import qd.a;

public final class z1 extends SuspendLambda implements Function2 {
    public int o;
    public final Channel p;
    public final Function2 q;

    public z1(Channel channel0, Function2 function20, Continuation continuation0) {
        this.p = channel0;
        this.q = function20;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new z1(this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((z1)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        Channel channel0 = this.p;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    y1 y10 = new y1(channel0, this.q, null);
                    this.o = 1;
                    if(CoroutineScopeKt.coroutineScope(y10, this) == object1) {
                        return object1;
                    label_9:
                        ResultKt.throwOnFailure(object0);
                    }
                    DefaultImpls.close$default(channel0, null, 1, null);
                    return Unit.INSTANCE;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 1: {
                goto label_9;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        channel0.close(throwable0);
        return Unit.INSTANCE;
    }
}

