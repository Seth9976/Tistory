package uf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import qd.a;

public final class g extends SuspendLambda implements Function2 {
    public ChannelIterator o;
    public int p;
    public Object q;
    public final ReceiveChannel r;

    public g(ReceiveChannel receiveChannel0, Continuation continuation0) {
        this.r = receiveChannel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new g(this.r, continuation0);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((g)this.create(((ProducerScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ProducerScope producerScope1;
        ChannelIterator channelIterator0;
        ProducerScope producerScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                producerScope0 = (ProducerScope)this.q;
                channelIterator0 = this.r.iterator();
                goto label_15;
            }
            case 1: {
                channelIterator0 = this.o;
                producerScope1 = (ProducerScope)this.q;
                ResultKt.throwOnFailure(object0);
                goto label_23;
            }
            case 2: {
                channelIterator0 = this.o;
                producerScope1 = (ProducerScope)this.q;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            producerScope0 = producerScope1;
        label_15:
            this.q = producerScope0;
            this.o = channelIterator0;
            this.p = 1;
            Object object2 = channelIterator0.hasNext(this);
            if(object2 == object1) {
                return object1;
            }
            producerScope1 = producerScope0;
            object0 = object2;
        label_23:
            if(!((Boolean)object0).booleanValue()) {
                break;
            }
            Object object3 = channelIterator0.next();
            this.q = producerScope1;
            this.o = channelIterator0;
            this.p = 2;
            if(producerScope1.send(object3, this) != object1) {
                continue;
            }
            return object1;
        }
        return Unit.INSTANCE;
    }
}

