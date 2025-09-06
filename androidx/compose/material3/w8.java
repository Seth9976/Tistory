package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;

public final class w8 extends DelegatingNode implements CompositionLocalConsumerModifierNode, ObserverModifierNode {
    public final InteractionSource p;
    public final boolean q;
    public final float r;
    public final ColorProducer s;
    public DelegatableNode t;

    public w8(InteractionSource interactionSource0, boolean z, float f, ColorProducer colorProducer0) {
        this.p = interactionSource0;
        this.q = z;
        this.r = f;
        this.s = colorProducer0;
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public final void onAttach() {
        ObserverModifierNodeKt.observeReads(this, new v8(this, 1));
    }

    @Override  // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        ObserverModifierNodeKt.observeReads(this, new v8(this, 1));
    }
}

