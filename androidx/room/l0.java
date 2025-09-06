package androidx.room;

import java.util.concurrent.Callable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import qd.a;

public final class l0 extends SuspendLambda implements Function2 {
    public ChannelIterator o;
    public int p;
    public final RoomDatabase q;
    public final CoroutinesRoom.Companion.createFlow.1.1.observer.1 r;
    public final Channel s;
    public final Callable t;
    public final Channel u;

    public l0(RoomDatabase roomDatabase0, CoroutinesRoom.Companion.createFlow.1.1.observer.1 coroutinesRoom$Companion$createFlow$1$1$observer$10, Channel channel0, Callable callable0, Channel channel1, Continuation continuation0) {
        this.q = roomDatabase0;
        this.r = coroutinesRoom$Companion$createFlow$1$1$observer$10;
        this.s = channel0;
        this.t = callable0;
        this.u = channel1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new l0(this.q, this.r, this.s, this.t, this.u, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((l0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        RoomDatabase roomDatabase0;
        CoroutinesRoom.Companion.createFlow.1.1.observer.1 coroutinesRoom$Companion$createFlow$1$1$observer$10;
        Object object1;
        try {
            object1 = a.getCOROUTINE_SUSPENDED();
            coroutinesRoom$Companion$createFlow$1$1$observer$10 = this.r;
            roomDatabase0 = this.q;
            switch(this.p) {
                case 0: {
                    goto label_5;
                }
                case 1: {
                    goto label_9;
                }
                case 2: {
                    goto label_12;
                }
            }
        }
        catch(Throwable throwable0) {
            roomDatabase0.getInvalidationTracker().removeObserver(coroutinesRoom$Companion$createFlow$1$1$observer$10);
            throw throwable0;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_5:
        ResultKt.throwOnFailure(object0);
        roomDatabase0.getInvalidationTracker().addObserver(coroutinesRoom$Companion$createFlow$1$1$observer$10);
        try {
            ChannelIterator channelIterator0 = this.s.iterator();
            goto label_15;
        label_9:
            ChannelIterator channelIterator1 = this.o;
            ResultKt.throwOnFailure(object0);
            goto label_22;
        label_12:
            channelIterator1 = this.o;
            ResultKt.throwOnFailure(object0);
            while(true) {
                channelIterator0 = channelIterator1;
            label_15:
                this.o = channelIterator0;
                this.p = 1;
                Object object2 = channelIterator0.hasNext(this);
                if(object2 == object1) {
                    return object1;
                }
                channelIterator1 = channelIterator0;
                object0 = object2;
            label_22:
                if(!((Boolean)object0).booleanValue()) {
                    goto label_33;
                }
                channelIterator1.next();
                Object object3 = this.t.call();
                this.o = channelIterator1;
                this.p = 2;
                if(this.u.send(object3, this) == object1) {
                    break;
                }
            }
            return object1;
        }
        catch(Throwable throwable0) {
            roomDatabase0.getInvalidationTracker().removeObserver(coroutinesRoom$Companion$createFlow$1$1$observer$10);
            throw throwable0;
        }
    label_33:
        roomDatabase0.getInvalidationTracker().removeObserver(coroutinesRoom$Companion$createFlow$1$1$observer$10);
        return Unit.INSTANCE;
    }
}

