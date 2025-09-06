package uf;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.channels.TickerChannelsKt;

public final class p1 extends ContinuationImpl {
    public long o;
    public long p;
    public SendChannel q;
    public Object r;
    public int s;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.s |= 0x80000000;
        return TickerChannelsKt.access$fixedPeriodTicker(0L, 0L, null, this);
    }
}

