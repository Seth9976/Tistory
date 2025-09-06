package uf;

import java.util.Collection;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ReceiveChannel;

public final class d1 extends ContinuationImpl {
    public Collection o;
    public ReceiveChannel p;
    public ChannelIterator q;
    public Object r;
    public int s;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.s |= 0x80000000;
        return ChannelsKt.toCollection(null, null, this);
    }
}

