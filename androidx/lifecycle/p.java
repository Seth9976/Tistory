package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel.DefaultImpls;
import kotlinx.coroutines.flow.Flow;
import qd.a;

public final class p extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final Lifecycle q;
    public final State r;
    public final Flow s;

    public p(Lifecycle lifecycle0, State lifecycle$State0, Flow flow0, Continuation continuation0) {
        this.q = lifecycle0;
        this.r = lifecycle$State0;
        this.s = flow0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new p(this.q, this.r, this.s, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((p)this.create(((ProducerScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ProducerScope producerScope1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ProducerScope producerScope0 = (ProducerScope)this.p;
                o o0 = new o(this.s, producerScope0, null);
                this.p = producerScope0;
                this.o = 1;
                if(RepeatOnLifecycleKt.repeatOnLifecycle(this.q, this.r, o0, this) == object1) {
                    return object1;
                }
                producerScope1 = producerScope0;
                break;
            }
            case 1: {
                producerScope1 = (ProducerScope)this.p;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        DefaultImpls.close$default(producerScope1, null, 1, null);
        return Unit.INSTANCE;
    }
}

