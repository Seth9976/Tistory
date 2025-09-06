package uf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.channels.TickerChannelsKt.ticker.3.WhenMappings;
import kotlinx.coroutines.channels.TickerChannelsKt;
import kotlinx.coroutines.channels.TickerMode;
import qd.a;

public final class q1 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final TickerMode q;
    public final long r;
    public final long s;

    public q1(TickerMode tickerMode0, long v, long v1, Continuation continuation0) {
        this.q = tickerMode0;
        this.r = v;
        this.s = v1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new q1(this.q, this.r, this.s, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((q1)this.create(((ProducerScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ProducerScope producerScope0 = (ProducerScope)this.p;
                switch(TickerChannelsKt.ticker.3.WhenMappings.$EnumSwitchMapping$0[this.q.ordinal()]) {
                    case 1: {
                        SendChannel sendChannel0 = producerScope0.getChannel();
                        this.o = 1;
                        if(TickerChannelsKt.access$fixedPeriodTicker(this.r, this.s, sendChannel0, this) == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 2: {
                        SendChannel sendChannel1 = producerScope0.getChannel();
                        this.o = 2;
                        if(TickerChannelsKt.access$fixedDelayTicker(this.r, this.s, sendChannel1, this) == object1) {
                            return object1;
                        }
                        break;
                    }
                    default: {
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
            case 1: 
            case 2: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

