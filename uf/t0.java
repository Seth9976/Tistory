package uf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import qd.a;

public final class t0 extends SuspendLambda implements Function2 {
    public ChannelIterator o;
    public ProducerScope p;
    public int q;
    public int r;
    public Object s;
    public final ReceiveChannel t;
    public final Function3 u;

    public t0(ReceiveChannel receiveChannel0, Function3 function30, Continuation continuation0) {
        this.t = receiveChannel0;
        this.u = function30;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new t0(this.t, this.u, continuation0);
        continuation1.s = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((t0)this.create(((ProducerScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ProducerScope producerScope3;
        ChannelIterator channelIterator1;
        ProducerScope producerScope2;
        ProducerScope producerScope1;
        int v;
        ChannelIterator channelIterator0;
        ProducerScope producerScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                producerScope0 = (ProducerScope)this.s;
                channelIterator0 = this.t.iterator();
                v = 0;
                break;
            }
            case 1: {
                v = this.q;
                channelIterator0 = this.o;
                producerScope1 = (ProducerScope)this.s;
                ResultKt.throwOnFailure(object0);
                goto label_33;
            }
            case 2: {
                v = this.q;
                producerScope2 = this.p;
                channelIterator1 = this.o;
                producerScope3 = (ProducerScope)this.s;
                ResultKt.throwOnFailure(object0);
                goto label_47;
            }
            case 3: {
                v = this.q;
                channelIterator0 = this.o;
                ProducerScope producerScope4 = (ProducerScope)this.s;
                ResultKt.throwOnFailure(object0);
                producerScope0 = producerScope4;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            this.s = producerScope0;
            this.o = channelIterator0;
            this.q = v;
            this.r = 1;
            Object object2 = channelIterator0.hasNext(this);
            if(object2 == object1) {
                return object1;
            }
            producerScope1 = producerScope0;
            object0 = object2;
        label_33:
            if(!((Boolean)object0).booleanValue()) {
                break;
            }
            Object object3 = channelIterator0.next();
            this.s = producerScope1;
            this.o = channelIterator0;
            this.p = producerScope1;
            this.q = v + 1;
            this.r = 2;
            object0 = this.u.invoke(Boxing.boxInt(v), object3, this);
            if(object0 == object1) {
                return object1;
            }
            ++v;
            producerScope3 = producerScope1;
            channelIterator1 = channelIterator0;
            producerScope2 = producerScope3;
        label_47:
            this.s = producerScope3;
            this.o = channelIterator1;
            this.p = null;
            this.q = v;
            this.r = 3;
            if(producerScope2.send(object0, this) == object1) {
                return object1;
            }
            channelIterator0 = channelIterator1;
            producerScope0 = producerScope3;
        }
        return Unit.INSTANCE;
    }
}

