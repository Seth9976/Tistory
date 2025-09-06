package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;

public final class k extends Lambda implements Function2 {
    public final VelocityTracker w;
    public final DragGestureNode x;

    public k(VelocityTracker velocityTracker0, DragGestureNode dragGestureNode0) {
        this.w = velocityTracker0;
        this.x = dragGestureNode0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        long v = ((Offset)object1).unbox-impl();
        VelocityTrackerKt.addPointerInputChange(this.w, ((PointerInputChange)object0));
        Channel channel0 = this.x.t;
        if(channel0 != null) {
            ChannelResult.box-impl(channel0.trySend-JP2dKIU(new DragDelta(v, null)));
        }
        return Unit.INSTANCE;
    }
}

