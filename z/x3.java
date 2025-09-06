package z;

import androidx.compose.foundation.gestures.TransformableState;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import y0.y0;

public final class x3 extends DelegatingNode {
    public TransformableState p;
    public Function1 q;
    public boolean r;
    public boolean s;
    public final y0 t;
    public final Channel u;
    public final SuspendingPointerInputModifierNode v;

    public x3(TransformableState transformableState0, Function1 function10, boolean z, boolean z1) {
        this.p = transformableState0;
        this.q = function10;
        this.r = z;
        this.s = z1;
        this.t = new y0(this, 5);
        this.u = ChannelKt.Channel$default(0x7FFFFFFF, null, null, 6, null);
        this.v = (SuspendingPointerInputModifierNode)this.delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new w3(this, null)));
    }
}

