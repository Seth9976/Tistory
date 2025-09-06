package kotlinx.coroutines.flow.internal;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.SendChannel.DefaultImpls;
import kotlinx.coroutines.flow.Flow;
import qd.a;

public final class m extends SuspendLambda implements Function2 {
    public int o;
    public final Flow[] p;
    public final int q;
    public final AtomicInteger r;
    public final Channel s;

    public m(Flow[] arr_flow, int v, AtomicInteger atomicInteger0, Channel channel0, Continuation continuation0) {
        this.p = arr_flow;
        this.q = v;
        this.r = atomicInteger0;
        this.s = channel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new m(this.p, this.q, this.r, this.s, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((m)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        AtomicInteger atomicInteger0 = this.r;
        Channel channel0 = this.s;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    Flow flow0 = this.p[this.q];
                    l l0 = new l(channel0, this.q);
                    this.o = 1;
                    if(flow0.collect(l0, this) == object1) {
                        return object1;
                    label_11:
                        ResultKt.throwOnFailure(object0);
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    goto label_14;
                }
            }
            case 1: {
                goto label_11;
            label_14:
                if(atomicInteger0.decrementAndGet() == 0) {
                    DefaultImpls.close$default(channel0, null, 1, null);
                }
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(atomicInteger0.decrementAndGet() == 0) {
            DefaultImpls.close$default(channel0, null, 1, null);
        }
        return Unit.INSTANCE;
    }
}

