package o1;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;

public final class i extends Node implements FocusPropertiesModifierNode {
    public h n;

    @Override  // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public final void applyFocusProperties(FocusProperties focusProperties0) {
        this.n.apply(focusProperties0);
    }
}

