package xf;

import g.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.FlowCollector;

public final class m extends ContinuationImpl {
    public FlowCollector o;
    public ReceiveChannel p;
    public ChannelIterator q;
    public boolean r;
    public Object s;
    public int t;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.s = object0;
        this.t |= 0x80000000;
        return b.i(null, null, false, this);
    }
}

