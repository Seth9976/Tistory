package m1;

import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropNode;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public final DragAndDropEvent w;

    public b(DragAndDropEvent dragAndDropEvent0) {
        this.w = dragAndDropEvent0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(!((DragAndDropNode)object0).getNode().isAttached()) {
            return TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
        }
        DragAndDropTarget dragAndDropTarget0 = ((DragAndDropNode)object0).q;
        if(dragAndDropTarget0 != null) {
            dragAndDropTarget0.onEnded(this.w);
        }
        ((DragAndDropNode)object0).q = null;
        ((DragAndDropNode)object0).p = null;
        return TraverseDescendantsAction.ContinueTraversal;
    }
}

