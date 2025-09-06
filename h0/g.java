package h0;

import androidx.compose.foundation.ClickableNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.state.ToggleableState;

public final class g extends ClickableNode {
    public ToggleableState G;

    @Override  // androidx.compose.foundation.AbstractClickableNode
    public final void applyAdditionalSemantics(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        SemanticsPropertiesKt.setToggleableState(semanticsPropertyReceiver0, this.G);
    }
}

