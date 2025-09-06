package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;

public final class p extends Node implements ParentDataModifierNode {
    public Alignment n;
    public boolean o;

    @Override  // androidx.compose.ui.node.ParentDataModifierNode
    public final Object modifyParentData(Density density0, Object object0) {
        return this;
    }
}

