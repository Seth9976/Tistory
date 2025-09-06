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

public final class b1 extends SuspendLambda implements Function2 {
    public ChannelIterator o;
    public Object p;
    public int q;
    public Object r;
    public final ReceiveChannel s;
    public final Function2 t;

    public b1(ReceiveChannel receiveChannel0, Function2 function20, Continuation continuation0) {
        this.s = receiveChannel0;
        this.t = function20;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new b1(this.s, this.t, continuation0);
        continuation1.r = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((b1)this.create(((ProducerScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ProducerScope producerScope2;
        ChannelIterator channelIterator1;
        Object object2;
        ProducerScope producerScope1;
        ChannelIterator channelIterator0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ProducerScope producerScope0 = (ProducerScope)this.r;
                channelIterator0 = this.s.iterator();
                producerScope1 = producerScope0;
                break;
            }
            case 1: {
                channelIterator0 = this.o;
                producerScope1 = (ProducerScope)this.r;
                ResultKt.throwOnFailure(object0);
                goto label_26;
            }
            case 2: {
                object2 = this.p;
                channelIterator1 = this.o;
                producerScope2 = (ProducerScope)this.r;
                ResultKt.throwOnFailure(object0);
                goto label_39;
            }
            case 3: {
                channelIterator0 = this.o;
                producerScope1 = (ProducerScope)this.r;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            this.r = producerScope1;
            this.o = channelIterator0;
            this.q = 1;
            object0 = channelIterator0.hasNext(this);
            if(object0 == object1) {
                return object1;
            }
        label_26:
            if(!((Boolean)object0).booleanValue()) {
                break;
            }
            Object object3 = channelIterator0.next();
            this.r = producerScope1;
            this.o = channelIterator0;
            this.p = object3;
            this.q = 2;
            Object object4 = this.t.invoke(object3, this);
            if(object4 == object1) {
                return object1;
            }
            object2 = object3;
            object0 = object4;
            producerScope2 = producerScope1;
            channelIterator1 = channelIterator0;
        label_39:
            if(!((Boolean)object0).booleanValue()) {
                return Unit.INSTANCE;
            }
            this.r = producerScope2;
            this.o = channelIterator1;
            this.p = null;
            this.q = 3;
            if(producerScope2.send(object2, this) == object1) {
                return object1;
            }
            channelIterator0 = channelIterator1;
            producerScope1 = producerScope2;
        }
        return Unit.INSTANCE;
    }
}

