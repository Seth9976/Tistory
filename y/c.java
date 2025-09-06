package y;

import androidx.compose.ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s.h1;

public final class c extends DelegatingNode {
    public Function1 p;
    public DragAndDropTarget q;
    public DragAndDropModifierNode r;

    @Override  // androidx.compose.ui.Modifier$Node
    public final void onAttach() {
        this.r = (DragAndDropModifierNode)this.delegate(DragAndDropNodeKt.DragAndDropModifierNode(new h1(this, 22), this.q));
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public final void onDetach() {
        DragAndDropModifierNode dragAndDropModifierNode0 = this.r;
        Intrinsics.checkNotNull(dragAndDropModifierNode0);
        this.undelegate(dragAndDropModifierNode0);
    }
}

