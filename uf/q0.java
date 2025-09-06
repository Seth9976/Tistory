package uf;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.IntRef;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ReceiveChannel;

public final class q0 extends ContinuationImpl {
    public Object o;
    public IntRef p;
    public IntRef q;
    public ReceiveChannel r;
    public ChannelIterator s;
    public Object t;
    public int u;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.t = object0;
        this.u |= 0x80000000;
        return ChannelsKt.lastIndexOf(null, null, this);
    }
}

