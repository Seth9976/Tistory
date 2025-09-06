package kotlinx.coroutines.flow;

import androidx.core.app.y;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.ranges.c;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow;

public abstract class b {
    public static final y a(Flow flow0, int v) {
        int v1 = c.coerceAtLeast(v, 0x40) - v;
        if(flow0 instanceof ChannelFlow) {
            Flow flow1 = ((ChannelFlow)flow0).dropChannelOperators();
            if(flow1 != null) {
                int v2 = ((ChannelFlow)flow0).capacity;
                if(v2 != -3 && (v2 != -2 && v2 != 0)) {
                    return new y(flow1, ((ChannelFlow)flow0).context, v2, ((ChannelFlow)flow0).onBufferOverflow);
                }
                if(((ChannelFlow)flow0).onBufferOverflow == BufferOverflow.SUSPEND) {
                    return v2 == 0 ? new y(flow1, ((ChannelFlow)flow0).context, 0, ((ChannelFlow)flow0).onBufferOverflow) : new y(flow1, ((ChannelFlow)flow0).context, v1, ((ChannelFlow)flow0).onBufferOverflow);
                }
                return v == 0 ? new y(flow1, ((ChannelFlow)flow0).context, 1, ((ChannelFlow)flow0).onBufferOverflow) : new y(flow1, ((ChannelFlow)flow0).context, 0, ((ChannelFlow)flow0).onBufferOverflow);
            }
        }
        return new y(flow0, EmptyCoroutineContext.INSTANCE, v1, BufferOverflow.SUSPEND);
    }
}

