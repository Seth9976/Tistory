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

public final class s0 extends SuspendLambda implements Function2 {
    public Function2 o;
    public ReceiveChannel p;
    public ChannelIterator q;
    public ProducerScope r;
    public int s;
    public Object t;
    public final ReceiveChannel u;
    public final Function2 v;

    public s0(ReceiveChannel receiveChannel0, Function2 function20, Continuation continuation0) {
        this.u = receiveChannel0;
        this.v = function20;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new s0(this.u, this.v, continuation0);
        continuation1.t = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((s0)this.create(((ProducerScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ProducerScope producerScope3;
        Function2 function21;
        ReceiveChannel receiveChannel1;
        ChannelIterator channelIterator1;
        ProducerScope producerScope2;
        ProducerScope producerScope1;
        Function2 function20;
        ChannelIterator channelIterator0;
        ReceiveChannel receiveChannel0;
        ProducerScope producerScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
    alab1:
        switch(this.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                producerScope0 = (ProducerScope)this.t;
                receiveChannel0 = this.u;
                channelIterator0 = receiveChannel0.iterator();
                function20 = this.v;
                goto label_28;
            }
            case 1: {
                channelIterator0 = this.q;
                receiveChannel0 = this.p;
                function20 = this.o;
                producerScope1 = (ProducerScope)this.t;
                ResultKt.throwOnFailure(object0);
                goto label_38;
            }
            case 2: {
                producerScope2 = this.r;
                channelIterator1 = this.q;
                receiveChannel1 = this.p;
                function21 = this.o;
                producerScope3 = (ProducerScope)this.t;
                try {
                    ResultKt.throwOnFailure(object0);
                    goto label_54;
                }
                catch(Throwable throwable0) {
                    receiveChannel0 = receiveChannel1;
                    throw throwable0;
                }
            }
            case 3: {
                channelIterator0 = this.q;
                receiveChannel0 = this.p;
                function20 = this.o;
                ProducerScope producerScope4 = (ProducerScope)this.t;
                ResultKt.throwOnFailure(object0);
                producerScope0 = producerScope4;
                while(true) {
                label_28:
                    this.t = producerScope0;
                    this.o = function20;
                    this.p = receiveChannel0;
                    this.q = channelIterator0;
                    this.s = 1;
                    Object object2 = channelIterator0.hasNext(this);
                    if(object2 == object1) {
                        return object1;
                    }
                    producerScope1 = producerScope0;
                    object0 = object2;
                label_38:
                    if(!((Boolean)object0).booleanValue()) {
                        ChannelsKt.cancelConsumed(receiveChannel0, null);
                        return Unit.INSTANCE;
                    }
                    Object object3 = channelIterator0.next();
                    this.t = producerScope1;
                    this.o = function20;
                    this.p = receiveChannel0;
                    this.q = channelIterator0;
                    this.r = producerScope1;
                    this.s = 2;
                    object0 = function20.invoke(object3, this);
                    if(object0 == object1) {
                        break alab1;
                    }
                    goto label_49;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return object1;
    label_49:
        producerScope3 = producerScope1;
        function21 = function20;
        receiveChannel1 = receiveChannel0;
        channelIterator1 = channelIterator0;
        producerScope2 = producerScope3;
        try {
        label_54:
            this.t = producerScope3;
            this.o = function21;
            this.p = receiveChannel1;
            this.q = channelIterator1;
            this.r = null;
            this.s = 3;
            if(producerScope2.send(object0, this) == object1) {
                return object1;
            }
        }
        catch(Throwable throwable0) {
            receiveChannel0 = receiveChannel1;
            throw throwable0;
        }
        try {
            channelIterator0 = channelIterator1;
            receiveChannel0 = receiveChannel1;
            function20 = function21;
            producerScope0 = producerScope3;
            goto label_28;
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            ChannelsKt.cancelConsumed(receiveChannel0, throwable0);
            throw throwable1;
        }
        ChannelsKt.cancelConsumed(receiveChannel0, null);
        return Unit.INSTANCE;
    }
}

