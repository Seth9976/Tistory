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

public final class a1 extends SuspendLambda implements Function2 {
    public ChannelIterator o;
    public int p;
    public int q;
    public Object r;
    public final int s;
    public final ReceiveChannel t;

    public a1(ReceiveChannel receiveChannel0, int v, Continuation continuation0) {
        this.s = v;
        this.t = receiveChannel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new a1(this.t, this.s, continuation0);
        continuation1.r = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((a1)this.create(((ProducerScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ProducerScope producerScope1;
        ChannelIterator channelIterator0;
        int v;
        ProducerScope producerScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                producerScope0 = (ProducerScope)this.r;
                v = this.s;
                if(v == 0) {
                    return Unit.INSTANCE;
                }
                if(v < 0) {
                    throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
                }
                channelIterator0 = this.t.iterator();
                goto label_25;
            }
            case 1: {
                v = this.p;
                channelIterator0 = this.o;
                producerScope1 = (ProducerScope)this.r;
                ResultKt.throwOnFailure(object0);
                goto label_34;
            }
            case 2: {
                v = this.p;
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
            producerScope0 = producerScope1;
            --v;
            if(v == 0) {
                return Unit.INSTANCE;
            }
        label_25:
            this.r = producerScope0;
            this.o = channelIterator0;
            this.p = v;
            this.q = 1;
            Object object2 = channelIterator0.hasNext(this);
            if(object2 == object1) {
                return object1;
            }
            producerScope1 = producerScope0;
            object0 = object2;
        label_34:
            if(!((Boolean)object0).booleanValue()) {
                break;
            }
            Object object3 = channelIterator0.next();
            this.r = producerScope1;
            this.o = channelIterator0;
            this.p = v;
            this.q = 2;
            if(producerScope1.send(object3, this) != object1) {
                continue;
            }
            return object1;
        }
        return Unit.INSTANCE;
    }
}

