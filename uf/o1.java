package uf;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.channels.TickerChannelsKt;

public final class o1 extends ContinuationImpl {
    public long o;
    public SendChannel p;
    public Object q;
    public int r;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.r |= 0x80000000;
        return TickerChannelsKt.access$fixedDelayTicker(0L, 0L, null, this);
    }
}

