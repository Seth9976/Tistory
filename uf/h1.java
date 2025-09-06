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

public final class h1 extends SuspendLambda implements Function2 {
    public ChannelIterator o;
    public Function2 p;
    public ReceiveChannel q;
    public ChannelIterator r;
    public Object s;
    public int t;
    public Object u;
    public final ReceiveChannel v;
    public final ReceiveChannel w;
    public final Function2 x;

    public h1(ReceiveChannel receiveChannel0, ReceiveChannel receiveChannel1, Function2 function20, Continuation continuation0) {
        this.v = receiveChannel0;
        this.w = receiveChannel1;
        this.x = function20;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new h1(this.v, this.w, this.x, continuation0);
        continuation1.u = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((h1)this.create(((ProducerScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object5;
        Object object4;
        Object object3;
        ProducerScope producerScope2;
        ChannelIterator channelIterator4;
        Function2 function21;
        ReceiveChannel receiveChannel1;
        Function2 function20;
        ChannelIterator channelIterator2;
        ChannelIterator channelIterator1;
        ProducerScope producerScope1;
        ReceiveChannel receiveChannel0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ProducerScope producerScope0 = (ProducerScope)this.u;
                ChannelIterator channelIterator0 = this.v.iterator();
                receiveChannel0 = this.w;
                try {
                    producerScope1 = producerScope0;
                    channelIterator1 = channelIterator0;
                    channelIterator2 = receiveChannel0.iterator();
                    function20 = this.x;
                    goto label_35;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 1: {
                channelIterator2 = this.r;
                receiveChannel0 = this.q;
                function20 = this.p;
                channelIterator1 = this.o;
                producerScope1 = (ProducerScope)this.u;
                try {
                    ResultKt.throwOnFailure(object0);
                    goto label_45;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 2: {
                Object object2 = this.s;
                ChannelIterator channelIterator3 = this.r;
                receiveChannel1 = this.q;
                function21 = this.p;
                channelIterator4 = this.o;
                producerScope2 = (ProducerScope)this.u;
                try {
                    ResultKt.throwOnFailure(object0);
                    object3 = object2;
                    channelIterator2 = channelIterator3;
                    goto label_66;
                }
                catch(Throwable throwable0) {
                    goto label_83;
                }
            }
            case 3: {
                channelIterator2 = this.r;
                receiveChannel0 = this.q;
                function20 = this.p;
                channelIterator1 = this.o;
                producerScope1 = (ProducerScope)this.u;
                try {
                    ResultKt.throwOnFailure(object0);
                    while(true) {
                    label_35:
                        this.u = producerScope1;
                        this.o = channelIterator1;
                        this.p = function20;
                        this.q = receiveChannel0;
                        this.r = channelIterator2;
                        this.s = null;
                        this.t = 1;
                        object0 = channelIterator2.hasNext(this);
                        if(object0 == object1) {
                            return object1;
                        }
                    label_45:
                        if(!((Boolean)object0).booleanValue()) {
                            goto label_88;
                        }
                        object4 = channelIterator2.next();
                        this.u = producerScope1;
                        this.o = channelIterator1;
                        this.p = function20;
                        this.q = receiveChannel0;
                        this.r = channelIterator2;
                        this.s = object4;
                        this.t = 2;
                        object5 = channelIterator1.hasNext(this);
                        goto label_58;
                    }
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        throw throwable0;
    label_58:
        if(object5 == object1) {
            return object1;
        }
        object3 = object4;
        object0 = object5;
        producerScope2 = producerScope1;
        channelIterator4 = channelIterator1;
        function21 = function20;
        receiveChannel1 = receiveChannel0;
        try {
        label_66:
            if(((Boolean)object0).booleanValue()) {
                Object object6 = function21.invoke(object3, channelIterator4.next());
                this.u = producerScope2;
                this.o = channelIterator4;
                this.p = function21;
                this.q = receiveChannel1;
                this.r = channelIterator2;
                this.s = null;
                this.t = 3;
                if(producerScope2.send(object6, this) == object1) {
                    return object1;
                }
            }
            receiveChannel0 = receiveChannel1;
            function20 = function21;
            channelIterator1 = channelIterator4;
            producerScope1 = producerScope2;
            goto label_35;
        }
        catch(Throwable throwable0) {
        label_83:
            receiveChannel0 = receiveChannel1;
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            ChannelsKt.cancelConsumed(receiveChannel0, throwable0);
            throw throwable1;
        }
    label_88:
        ChannelsKt.cancelConsumed(receiveChannel0, null);
        return Unit.INSTANCE;
    }
}

