package uf;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BroadcastChannelImpl;

public final class e extends ContinuationImpl {
    public BroadcastChannelImpl o;
    public Object p;
    public Iterator q;
    public Object r;
    public final BroadcastChannelImpl s;
    public int t;

    public e(BroadcastChannelImpl broadcastChannelImpl0, Continuation continuation0) {
        this.s = broadcastChannelImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.t |= 0x80000000;
        return this.s.send(null, this);
    }
}

