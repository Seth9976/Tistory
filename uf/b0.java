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

public final class b0 extends SuspendLambda implements Function2 {
    public ChannelIterator o;
    public int p;
    public int q;
    public Object r;
    public final int s;
    public final ReceiveChannel t;

    public b0(ReceiveChannel receiveChannel0, int v, Continuation continuation0) {
        this.s = v;
        this.t = receiveChannel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new b0(this.t, this.s, continuation0);
        continuation1.r = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((b0)this.create(((ProducerScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ProducerScope producerScope2;
        ChannelIterator channelIterator1;
        ProducerScope producerScope1;
        ChannelIterator channelIterator0;
        int v;
        ProducerScope producerScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        ReceiveChannel receiveChannel0 = this.t;
        switch(this.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                producerScope0 = (ProducerScope)this.r;
                v = this.s;
                if(v < 0) {
                    throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
                }
                if(v > 0) {
                    channelIterator0 = receiveChannel0.iterator();
                    producerScope1 = producerScope0;
                    goto label_21;
                }
                channelIterator1 = receiveChannel0.iterator();
                goto label_39;
            }
            case 1: {
                v = this.p;
                channelIterator0 = this.o;
                producerScope1 = (ProducerScope)this.r;
                ResultKt.throwOnFailure(object0);
                while(((Boolean)object0).booleanValue()) {
                    channelIterator0.next();
                    --v;
                    if(v == 0) {
                        break;
                    }
                label_21:
                    this.r = producerScope1;
                    this.o = channelIterator0;
                    this.p = v;
                    this.q = 1;
                    object0 = channelIterator0.hasNext(this);
                    if(object0 != object1) {
                        continue;
                    }
                    return object1;
                }
                producerScope0 = producerScope1;
                channelIterator1 = receiveChannel0.iterator();
                goto label_39;
            }
            case 2: {
                channelIterator1 = this.o;
                producerScope2 = (ProducerScope)this.r;
                ResultKt.throwOnFailure(object0);
                goto label_47;
            }
            case 3: {
                channelIterator1 = this.o;
                producerScope2 = (ProducerScope)this.r;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            producerScope0 = producerScope2;
        label_39:
            this.r = producerScope0;
            this.o = channelIterator1;
            this.q = 2;
            Object object2 = channelIterator1.hasNext(this);
            if(object2 == object1) {
                return object1;
            }
            producerScope2 = producerScope0;
            object0 = object2;
        label_47:
            if(!((Boolean)object0).booleanValue()) {
                break;
            }
            Object object3 = channelIterator1.next();
            this.r = producerScope2;
            this.o = channelIterator1;
            this.q = 3;
            if(producerScope2.send(object3, this) != object1) {
                continue;
            }
            return object1;
        }
        return Unit.INSTANCE;
    }
}

