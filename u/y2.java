package u;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;

public final class y2 extends Node implements SemanticsModifierNode {
    public ScrollState n;
    public boolean o;
    public FlingBehavior p;
    public boolean q;

    @Override  // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver0, true);
        ScrollAxisRange scrollAxisRange0 = new ScrollAxisRange(new x2(this, 0), new x2(this, 1), this.o);
        if(this.q) {
            SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver0, scrollAxisRange0);
            return;
        }
        SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver0, scrollAxisRange0);
    }
}

