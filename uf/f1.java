package uf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import qd.a;

public final class f1 extends SuspendLambda implements Function2 {
    public ChannelIterator o;
    public int p;
    public int q;
    public Object r;
    public final ReceiveChannel s;

    public f1(ReceiveChannel receiveChannel0, Continuation continuation0) {
        this.s = receiveChannel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new f1(this.s, continuation0);
        continuation1.r = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((f1)this.create(((ProducerScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ProducerScope producerScope1;
        ChannelIterator channelIterator1;
        int v1;
        int v;
        ChannelIterator channelIterator0;
        ProducerScope producerScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                producerScope0 = (ProducerScope)this.r;
                channelIterator0 = this.s.iterator();
                v = 0;
                break;
            }
            case 1: {
                v1 = this.p;
                channelIterator1 = this.o;
                producerScope1 = (ProducerScope)this.r;
                ResultKt.throwOnFailure(object0);
                goto label_31;
            }
            case 2: {
                int v2 = this.p;
                ChannelIterator channelIterator2 = this.o;
                ProducerScope producerScope2 = (ProducerScope)this.r;
                ResultKt.throwOnFailure(object0);
                producerScope0 = producerScope2;
                v = v2;
                channelIterator0 = channelIterator2;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
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
            channelIterator1 = channelIterator0;
            v1 = v;
        label_31:
            if(!((Boolean)object0).booleanValue()) {
                break;
            }
            IndexedValue indexedValue0 = new IndexedValue(v1, channelIterator1.next());
            this.r = producerScope1;
            this.o = channelIterator1;
            this.p = v1 + 1;
            this.q = 2;
            if(producerScope1.send(indexedValue0, this) == object1) {
                return object1;
            }
            channelIterator0 = channelIterator1;
            producerScope0 = producerScope1;
            v = v1 + 1;
        }
        return Unit.INSTANCE;
    }
}

