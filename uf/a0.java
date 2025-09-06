package uf;

import java.util.HashSet;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import qd.a;

public final class a0 extends SuspendLambda implements Function2 {
    public HashSet o;
    public ChannelIterator p;
    public Object q;
    public int r;
    public Object s;
    public final ReceiveChannel t;
    public final Function2 u;

    public a0(ReceiveChannel receiveChannel0, Function2 function20, Continuation continuation0) {
        this.t = receiveChannel0;
        this.u = function20;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new a0(this.t, this.u, continuation0);
        continuation1.s = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((a0)this.create(((ProducerScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ChannelIterator channelIterator2;
        Object object4;
        Object object3;
        ProducerScope producerScope1;
        HashSet hashSet1;
        ChannelIterator channelIterator0;
        HashSet hashSet0;
        ProducerScope producerScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                producerScope0 = (ProducerScope)this.s;
                hashSet0 = new HashSet();
                channelIterator0 = this.t.iterator();
                goto label_30;
            }
            case 1: {
                channelIterator0 = this.p;
                hashSet0 = this.o;
                producerScope0 = (ProducerScope)this.s;
                ResultKt.throwOnFailure(object0);
                goto label_38;
            }
            case 2: {
                Object object2 = this.q;
                ChannelIterator channelIterator1 = this.p;
                hashSet1 = this.o;
                producerScope1 = (ProducerScope)this.s;
                ResultKt.throwOnFailure(object0);
                object3 = object2;
                channelIterator0 = channelIterator1;
                goto label_52;
            }
            case 3: {
                object4 = this.q;
                channelIterator2 = this.p;
                hashSet1 = this.o;
                producerScope1 = (ProducerScope)this.s;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            hashSet1.add(object4);
            channelIterator0 = channelIterator2;
            while(true) {
                hashSet0 = hashSet1;
                producerScope0 = producerScope1;
            label_30:
                this.s = producerScope0;
                this.o = hashSet0;
                this.p = channelIterator0;
                this.q = null;
                this.r = 1;
                object0 = channelIterator0.hasNext(this);
                if(object0 == object1) {
                    return object1;
                }
            label_38:
                if(!((Boolean)object0).booleanValue()) {
                    break alab1;
                }
                Object object5 = channelIterator0.next();
                this.s = producerScope0;
                this.o = hashSet0;
                this.p = channelIterator0;
                this.q = object5;
                this.r = 2;
                Object object6 = this.u.invoke(object5, this);
                if(object6 == object1) {
                    return object1;
                }
                object3 = object5;
                object0 = object6;
                producerScope1 = producerScope0;
                hashSet1 = hashSet0;
            label_52:
                if(!hashSet1.contains(object0)) {
                    this.s = producerScope1;
                    this.o = hashSet1;
                    this.p = channelIterator0;
                    this.q = object0;
                    this.r = 3;
                    if(producerScope1.send(object3, this) == object1) {
                        return object1;
                    }
                    channelIterator2 = channelIterator0;
                    object4 = object0;
                    break;
                }
            }
        }
        return Unit.INSTANCE;
    }
}

