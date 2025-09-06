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

public final class f0 extends SuspendLambda implements Function2 {
    public ChannelIterator o;
    public Object p;
    public int q;
    public Object r;
    public final ReceiveChannel s;
    public final Function2 t;

    public f0(ReceiveChannel receiveChannel0, Function2 function20, Continuation continuation0) {
        this.s = receiveChannel0;
        this.t = function20;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new f0(this.s, this.t, continuation0);
        continuation1.r = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((f0)this.create(((ProducerScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object3;
        ProducerScope producerScope2;
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
                goto label_29;
            }
            case 2: {
                Object object2 = this.p;
                ChannelIterator channelIterator1 = this.o;
                producerScope2 = (ProducerScope)this.r;
                ResultKt.throwOnFailure(object0);
                object3 = object2;
                channelIterator0 = channelIterator1;
                goto label_41;
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
            this.p = null;
            this.q = 1;
            object0 = channelIterator0.hasNext(this);
            if(object0 == object1) {
                return object1;
            }
        label_29:
            if(!((Boolean)object0).booleanValue()) {
                break;
            }
            Object object4 = channelIterator0.next();
            this.r = producerScope1;
            this.o = channelIterator0;
            this.p = object4;
            this.q = 2;
            Object object5 = this.t.invoke(object4, this);
            if(object5 == object1) {
                return object1;
            }
            object3 = object4;
            object0 = object5;
            producerScope2 = producerScope1;
        label_41:
            if(((Boolean)object0).booleanValue()) {
                this.r = producerScope2;
                this.o = channelIterator0;
                this.p = null;
                this.q = 3;
                if(producerScope2.send(object3, this) == object1) {
                    return object1;
                }
            }
            producerScope1 = producerScope2;
        }
        return Unit.INSTANCE;
    }
}

