package xf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import qd.a;

public final class z extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final long q;
    public final long r;

    public z(long v, long v1, Continuation continuation0) {
        this.q = v;
        this.r = v1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new z(this.q, this.r, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((z)this.create(((ProducerScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ProducerScope producerScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                producerScope0 = (ProducerScope)this.p;
                this.p = producerScope0;
                this.o = 1;
                if(DelayKt.delay(this.q, this) != object1) {
                    goto label_18;
                }
                return object1;
            }
            case 2: {
                producerScope0 = (ProducerScope)this.p;
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 1: 
            case 3: {
                producerScope0 = (ProducerScope)this.p;
                ResultKt.throwOnFailure(object0);
                goto label_18;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            this.p = producerScope0;
            this.o = 3;
            if(DelayKt.delay(this.r, this) == object1) {
                return object1;
            }
        label_18:
            SendChannel sendChannel0 = producerScope0.getChannel();
            this.p = producerScope0;
            this.o = 2;
        }
        while(sendChannel0.send(Unit.INSTANCE, this) != object1);
        return object1;
    }
}

