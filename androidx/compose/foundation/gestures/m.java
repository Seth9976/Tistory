package androidx.compose.foundation.gestures;

import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;

public final class m extends Lambda implements Function1 {
    public final VelocityTracker w;
    public final DragGestureNode x;

    public m(VelocityTracker velocityTracker0, DragGestureNode dragGestureNode0) {
        this.w = velocityTracker0;
        this.x = dragGestureNode0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        VelocityTrackerKt.addPointerInputChange(this.w, ((PointerInputChange)object0));
        ProvidableCompositionLocal providableCompositionLocal0 = CompositionLocalsKt.getLocalViewConfiguration();
        float f = ((ViewConfiguration)CompositionLocalConsumerModifierNodeKt.currentValueOf(this.x, providableCompositionLocal0)).getMaximumFlingVelocity();
        long v = this.w.calculateVelocity-AH228Gc(VelocityKt.Velocity(f, f));
        this.w.resetTracking();
        Channel channel0 = this.x.t;
        if(channel0 != null) {
            ChannelResult.box-impl(channel0.trySend-JP2dKIU(new DragStopped(DraggableKt.access$toValidVelocity-TH1AsA0(v), null)));
        }
        return Unit.INSTANCE;
    }
}

