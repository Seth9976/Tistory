package h0;

import androidx.compose.foundation.ClickableNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;

public final class c extends ClickableNode {
    public boolean G;

    @Override  // androidx.compose.foundation.AbstractClickableNode
    public final void applyAdditionalSemantics(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver0, this.G);
    }
}

