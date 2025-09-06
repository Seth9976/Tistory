package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;

public final class n1 extends Node implements SemanticsModifierNode {
    public String n;

    @Override  // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        SemanticsPropertiesKt.setTestTag(semanticsPropertyReceiver0, this.n);
    }
}

