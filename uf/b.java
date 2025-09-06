package uf;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.channels.BroadcastChannelImpl;
import kotlinx.coroutines.channels.BufferedChannel;

public final class b extends BufferedChannel {
    public final BroadcastChannelImpl l;

    public b(BroadcastChannelImpl broadcastChannelImpl0) {
        this.l = broadcastChannelImpl0;
        super(broadcastChannelImpl0.getCapacity(), null, 2, null);
    }

    @Override  // kotlinx.coroutines.channels.BufferedChannel
    public final boolean cancelImpl$kotlinx_coroutines_core(Throwable throwable0) {
        ReentrantLock reentrantLock0 = this.l.m;
        reentrantLock0.lock();
        try {
            BroadcastChannelImpl.access$removeSubscriber(this.l, this);
            return super.cancelImpl$kotlinx_coroutines_core(throwable0);
        }
        finally {
            reentrantLock0.unlock();
        }
    }
}

