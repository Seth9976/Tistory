package uf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import qd.a;

public final class n0 extends SuspendLambda implements Function2 {
    public ChannelIterator o;
    public int p;
    public Object q;
    public final ReceiveChannel r;
    public final Function2 s;

    public n0(ReceiveChannel receiveChannel0, Function2 function20, Continuation continuation0) {
        this.r = receiveChannel0;
        this.s = function20;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new n0(this.r, this.s, continuation0);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((n0)this.create(((ProducerScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ProducerScope producerScope1;
        ChannelIterator channelIterator0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ProducerScope producerScope0 = (ProducerScope)this.q;
                channelIterator0 = this.r.iterator();
                producerScope1 = producerScope0;
                break;
            }
            case 1: {
                channelIterator0 = this.o;
                producerScope1 = (ProducerScope)this.q;
                ResultKt.throwOnFailure(object0);
                goto label_25;
            }
            case 2: {
                channelIterator0 = this.o;
                producerScope1 = (ProducerScope)this.q;
                ResultKt.throwOnFailure(object0);
                goto label_33;
            }
            case 3: {
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
            this.q = producerScope1;
            this.o = channelIterator0;
            this.p = 1;
            object0 = channelIterator0.hasNext(this);
            if(object0 == object1) {
                return object1;
            }
        label_25:
            if(!((Boolean)object0).booleanValue()) {
                break;
            }
            Object object2 = channelIterator0.next();
            this.q = producerScope1;
            this.o = channelIterator0;
            this.p = 2;
            object0 = this.s.invoke(object2, this);
            if(object0 == object1) {
                return object1;
            }
        label_33:
            this.q = producerScope1;
            this.o = channelIterator0;
            this.p = 3;
            if(ChannelsKt.toChannel(((ReceiveChannel)object0), producerScope1, this) != object1) {
                continue;
            }
            return object1;
        }
        return Unit.INSTANCE;
    }
}

