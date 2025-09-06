package uf;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ReceiveChannel;

public final class f extends Lambda implements Function1 {
    public final int w;
    public final ReceiveChannel x;

    public f(ReceiveChannel receiveChannel0, int v) {
        this.w = v;
        this.x = receiveChannel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            ChannelsKt.cancelConsumed(this.x, ((Throwable)object0));
            return Unit.INSTANCE;
        }
        ChannelsKt.cancelConsumed(this.x, ((Throwable)object0));
        return Unit.INSTANCE;
    }
}

