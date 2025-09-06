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

public final class g0 extends SuspendLambda implements Function2 {
    public ChannelIterator o;
    public Object p;
    public int q;
    public int r;
    public Object s;
    public final ReceiveChannel t;
    public final Function3 u;

    public g0(ReceiveChannel receiveChannel0, Function3 function30, Continuation continuation0) {
        this.t = receiveChannel0;
        this.u = function30;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new g0(this.t, this.u, continuation0);
        continuation1.s = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((g0)this.create(((ProducerScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object3;
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
                producerScope0 = (ProducerScope)this.s;
                ResultKt.throwOnFailure(object0);
                goto label_33;
            }
            case 2: {
                v = this.q;
                Object object2 = this.p;
                ChannelIterator channelIterator1 = this.o;
                producerScope1 = (ProducerScope)this.s;
                ResultKt.throwOnFailure(object0);
                object3 = object2;
                channelIterator0 = channelIterator1;
                goto label_47;
            }
            case 3: {
                v = this.q;
                channelIterator0 = this.o;
                producerScope0 = (ProducerScope)this.s;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            this.s = producerScope0;
            this.o = channelIterator0;
            this.p = null;
            this.q = v;
            this.r = 1;
            object0 = channelIterator0.hasNext(this);
            if(object0 == object1) {
                return object1;
            }
        label_33:
            if(!((Boolean)object0).booleanValue()) {
                break;
            }
            Object object4 = channelIterator0.next();
            this.s = producerScope0;
            this.o = channelIterator0;
            this.p = object4;
            this.q = v + 1;
            this.r = 2;
            Object object5 = this.u.invoke(Boxing.boxInt(v), object4, this);
            if(object5 == object1) {
                return object1;
            }
            object3 = object4;
            object0 = object5;
            ++v;
            producerScope1 = producerScope0;
        label_47:
            if(((Boolean)object0).booleanValue()) {
                this.s = producerScope1;
                this.o = channelIterator0;
                this.p = null;
                this.q = v;
                this.r = 3;
                if(producerScope1.send(object3, this) == object1) {
                    return object1;
                }
            }
            producerScope0 = producerScope1;
        }
        return Unit.INSTANCE;
    }
}

