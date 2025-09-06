package uf;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ReceiveChannel;

public final class z0 extends ContinuationImpl {
    public ReceiveChannel o;
    public Object p;
    public Object q;
    public int r;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.r |= 0x80000000;
        return ChannelsKt.singleOrNull(null, this);
    }
}

