package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;

public final class n extends Lambda implements Function2 {
    public final DragGestureNode w;

    public n(DragGestureNode dragGestureNode0) {
        this.w = dragGestureNode0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        long v = ((Offset)object1).unbox-impl();
        DragGestureNode dragGestureNode0 = this.w;
        if(((Boolean)dragGestureNode0.getCanDrag().invoke(((PointerInputChange)object0))).booleanValue()) {
            if(!dragGestureNode0.v) {
                if(dragGestureNode0.t == null) {
                    dragGestureNode0.t = ChannelKt.Channel$default(0x7FFFFFFF, null, null, 6, null);
                }
                DragGestureNode.access$startListeningForEvents(dragGestureNode0);
            }
            long v1 = Offset.minus-MK-Hz9U(((PointerInputChange)object0).getPosition-F1C5BW0(), OffsetKt.Offset(Offset.getX-impl(v) * Math.signum(Offset.getX-impl(((PointerInputChange)object0).getPosition-F1C5BW0())), Offset.getY-impl(v) * Math.signum(Offset.getY-impl(((PointerInputChange)object0).getPosition-F1C5BW0()))));
            Channel channel0 = dragGestureNode0.t;
            if(channel0 != null) {
                ChannelResult.box-impl(channel0.trySend-JP2dKIU(new DragStarted(v1, null)));
            }
        }
        return Unit.INSTANCE;
    }
}

