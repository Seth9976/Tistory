package uf;

import java.util.Comparator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ReceiveChannel;

public final class v0 extends ContinuationImpl {
    public Comparator o;
    public ReceiveChannel p;
    public ChannelIterator q;
    public Object r;
    public Object s;
    public int t;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.s = object0;
        this.t |= 0x80000000;
        return ChannelsKt.minWith(null, null, this);
    }
}

