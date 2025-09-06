package u;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.PinnableContainer.PinnedHandle;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class v1 extends Node implements CompositionLocalConsumerModifierNode, ObserverModifierNode {
    public PinnedHandle n;
    public boolean o;

    @Override  // androidx.compose.ui.Modifier$Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override  // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        ObjectRef ref$ObjectRef0 = new ObjectRef();
        ObserverModifierNodeKt.observeReads(this, new u1(ref$ObjectRef0, this));
        PinnableContainer pinnableContainer0 = (PinnableContainer)ref$ObjectRef0.element;
        if(this.o) {
            PinnedHandle pinnableContainer$PinnedHandle0 = this.n;
            if(pinnableContainer$PinnedHandle0 != null) {
                pinnableContainer$PinnedHandle0.release();
            }
            this.n = pinnableContainer0 == null ? null : pinnableContainer0.pin();
        }
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public final void onReset() {
        PinnedHandle pinnableContainer$PinnedHandle0 = this.n;
        if(pinnableContainer$PinnedHandle0 != null) {
            pinnableContainer$PinnedHandle0.release();
        }
        this.n = null;
    }
}

