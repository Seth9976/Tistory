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

public final class c0 extends SuspendLambda implements Function2 {
    public ChannelIterator o;
    public Object p;
    public int q;
    public Object r;
    public final ReceiveChannel s;
    public final Function2 t;

    public c0(ReceiveChannel receiveChannel0, Function2 function20, Continuation continuation0) {
        this.s = receiveChannel0;
        this.t = function20;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new c0(this.s, this.t, continuation0);
        continuation1.r = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((c0)this.create(((ProducerScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ProducerScope producerScope0;
        ChannelIterator channelIterator0;
        ProducerScope producerScope1;
        Object object3;
        ChannelIterator channelIterator2;
        ProducerScope producerScope2;
        ProducerScope producerScope3;
        ChannelIterator channelIterator3;
        ChannelIterator channelIterator4;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        ReceiveChannel receiveChannel0 = this.s;
        switch(this.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ProducerScope producerScope4 = (ProducerScope)this.r;
                channelIterator3 = receiveChannel0.iterator();
                for(producerScope3 = producerScope4; true; producerScope3 = producerScope2) {
                    this.r = producerScope3;
                    this.o = channelIterator3;
                    this.p = null;
                    this.q = 1;
                    object0 = channelIterator3.hasNext(this);
                    if(object0 == object1) {
                        return object1;
                    }
                    producerScope1 = producerScope3;
                label_39:
                    if(!((Boolean)object0).booleanValue()) {
                        break;
                    }
                    Object object4 = channelIterator3.next();
                    this.r = producerScope1;
                    this.o = channelIterator3;
                    this.p = object4;
                    this.q = 2;
                    Object object5 = this.t.invoke(object4, this);
                    if(object5 == object1) {
                        return object1;
                    }
                    channelIterator2 = channelIterator3;
                    object3 = object4;
                    object0 = object5;
                    producerScope2 = producerScope1;
                label_52:
                    channelIterator3 = channelIterator2;
                    if(!((Boolean)object0).booleanValue()) {
                        this.r = producerScope2;
                        this.o = null;
                        this.p = null;
                        this.q = 3;
                        if(producerScope2.send(object3, this) == object1) {
                            return object1;
                        }
                        producerScope1 = producerScope2;
                        break;
                    }
                }
                channelIterator4 = receiveChannel0.iterator();
                break;
            }
            case 1: {
                channelIterator3 = this.o;
                producerScope3 = (ProducerScope)this.r;
                ResultKt.throwOnFailure(object0);
                producerScope1 = producerScope3;
                goto label_39;
            }
            case 2: {
                Object object2 = this.p;
                ChannelIterator channelIterator1 = this.o;
                producerScope2 = (ProducerScope)this.r;
                ResultKt.throwOnFailure(object0);
                channelIterator2 = channelIterator1;
                object3 = object2;
                goto label_52;
            }
            case 3: {
                producerScope1 = (ProducerScope)this.r;
                ResultKt.throwOnFailure(object0);
                channelIterator4 = receiveChannel0.iterator();
                break;
            }
            case 4: {
                channelIterator0 = this.o;
                producerScope0 = (ProducerScope)this.r;
                ResultKt.throwOnFailure(object0);
                goto label_74;
            }
            case 5: {
                channelIterator0 = this.o;
                producerScope0 = (ProducerScope)this.r;
                ResultKt.throwOnFailure(object0);
                goto label_81;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            this.r = producerScope1;
            this.o = channelIterator4;
            this.q = 4;
            Object object6 = channelIterator4.hasNext(this);
            if(object6 == object1) {
                return object1;
            }
            channelIterator0 = channelIterator4;
            object0 = object6;
            producerScope0 = producerScope1;
        label_74:
            if(!((Boolean)object0).booleanValue()) {
                break;
            }
            Object object7 = channelIterator0.next();
            this.r = producerScope0;
            this.o = channelIterator0;
            this.q = 5;
            if(producerScope0.send(object7, this) == object1) {
                return object1;
            }
        label_81:
            channelIterator4 = channelIterator0;
            producerScope1 = producerScope0;
        }
        return Unit.INSTANCE;
    }
}

