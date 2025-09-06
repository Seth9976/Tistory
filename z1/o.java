package z1;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import kotlin.jvm.functions.Function1;

public final class o extends Node implements LayoutAwareModifierNode {
    public Function1 n;

    @Override  // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void onPlaced(LayoutCoordinates layoutCoordinates0) {
        this.n.invoke(layoutCoordinates0);
    }
}

