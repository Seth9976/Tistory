package uf;

import kotlinx.coroutines.channels.BroadcastChannelImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ConflatedBufferedChannel;

public final class c extends ConflatedBufferedChannel {
    public final BroadcastChannelImpl m;

    public c(BroadcastChannelImpl broadcastChannelImpl0) {
        this.m = broadcastChannelImpl0;
        super(1, BufferOverflow.DROP_OLDEST, null, 4, null);
    }

    @Override  // kotlinx.coroutines.channels.BufferedChannel
    public final boolean cancelImpl$kotlinx_coroutines_core(Throwable throwable0) {
        BroadcastChannelImpl.access$removeSubscriber(this.m, this);
        return super.cancelImpl$kotlinx_coroutines_core(throwable0);
    }
}

