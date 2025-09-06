package uf;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.IntRef;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ReceiveChannel;

public final class o0 extends ContinuationImpl {
    public Object o;
    public IntRef p;
    public ReceiveChannel q;
    public ChannelIterator r;
    public Object s;
    public int t;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.s = object0;
        this.t |= 0x80000000;
        return ChannelsKt.indexOf(null, null, this);
    }
}

