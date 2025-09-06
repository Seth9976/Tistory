package u2;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.viewinterop.FocusGroupNode_androidKt;

public final class m extends Node implements FocusPropertiesModifierNode {
    @Override  // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public final void applyFocusProperties(FocusProperties focusProperties0) {
        focusProperties0.setCanFocus(this.getNode().isAttached() && FocusGroupNode_androidKt.access$getView(this).hasFocusable());
    }
}

