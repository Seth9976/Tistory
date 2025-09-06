package u;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DrawModifierNode;
import kotlinx.coroutines.BuildersKt;

public final class k1 extends Node implements DrawModifierNode {
    public final InteractionSource n;
    public boolean o;
    public boolean p;
    public boolean q;

    public k1(InteractionSource interactionSource0) {
        this.n = interactionSource0;
    }

    @Override  // androidx.compose.ui.node.DrawModifierNode
    public final void draw(ContentDrawScope contentDrawScope0) {
        contentDrawScope0.drawContent();
        if(this.o) {
            DrawScope.drawRect-n-J9OG0$default(contentDrawScope0, Color.copy-wmQWz5c$default(0xFF00000000000000L, 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, contentDrawScope0.getSize-NH-jbRc(), 0.0f, null, null, 0, 0x7A, null);
            return;
        }
        if(this.p || this.q) {
            DrawScope.drawRect-n-J9OG0$default(contentDrawScope0, Color.copy-wmQWz5c$default(0xFF00000000000000L, 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, contentDrawScope0.getSize-NH-jbRc(), 0.0f, null, null, 0, 0x7A, null);
        }
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public final void onAttach() {
        BuildersKt.launch$default(this.getCoroutineScope(), null, null, new j1(this, null), 3, null);
    }
}

