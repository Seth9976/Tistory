package androidx.compose.foundation.gestures;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;

public final class l extends Lambda implements Function0 {
    public final DragGestureNode w;

    public l(DragGestureNode dragGestureNode0) {
        this.w = dragGestureNode0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Channel channel0 = this.w.t;
        if(channel0 != null) {
            ChannelResult.box-impl(channel0.trySend-JP2dKIU(DragCancelled.INSTANCE));
        }
        return Unit.INSTANCE;
    }
}

