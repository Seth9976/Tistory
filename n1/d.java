package n1;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DrawModifierNode;
import kotlin.jvm.functions.Function1;

public final class d extends Node implements DrawModifierNode {
    public Function1 n;

    @Override  // androidx.compose.ui.node.DrawModifierNode
    public final void draw(ContentDrawScope contentDrawScope0) {
        this.n.invoke(contentDrawScope0);
    }
}

