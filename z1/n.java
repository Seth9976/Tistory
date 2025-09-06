package z1;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import kotlin.jvm.functions.Function1;

public final class n extends Node implements GlobalPositionAwareModifierNode {
    public Function1 n;

    @Override  // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void onGloballyPositioned(LayoutCoordinates layoutCoordinates0) {
        this.n.invoke(layoutCoordinates0);
    }
}

