package u;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class f1 extends Node implements SemanticsModifierNode {
    public boolean n;
    public String o;
    public Role p;
    public Function0 q;
    public String r;
    public Function0 s;

    @Override  // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        Role role0 = this.p;
        if(role0 != null) {
            Intrinsics.checkNotNull(role0);
            SemanticsPropertiesKt.setRole-kuIjeqM(semanticsPropertyReceiver0, role0.unbox-impl());
        }
        SemanticsPropertiesKt.onClick(semanticsPropertyReceiver0, this.o, new e1(this, 0));
        if(this.s != null) {
            SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver0, this.r, new e1(this, 1));
        }
        if(!this.n) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver0);
        }
    }

    @Override  // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean getShouldMergeDescendantSemantics() {
        return true;
    }
}

