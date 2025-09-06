package m1;

import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropNode;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.BooleanRef;

public final class a extends Lambda implements Function1 {
    public final DragAndDropEvent w;
    public final DragAndDropNode x;
    public final BooleanRef y;

    public a(DragAndDropEvent dragAndDropEvent0, DragAndDropNode dragAndDropNode0, BooleanRef ref$BooleanRef0) {
        this.w = dragAndDropEvent0;
        this.x = dragAndDropNode0;
        this.y = ref$BooleanRef0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(!((DragAndDropNode)object0).isAttached()) {
            return TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
        }
        if(((DragAndDropNode)object0).q != null) {
            InlineClassHelperKt.throwIllegalStateException("DragAndDropTarget self reference must be null at the start of a drag and drop session");
        }
        ((DragAndDropNode)object0).q = (DragAndDropTarget)((DragAndDropNode)object0).n.invoke(this.w);
        boolean z = false;
        boolean z1 = ((DragAndDropNode)object0).q != null;
        if(z1) {
            DelegatableNodeKt.requireOwner(this.x).getDragAndDropManager().registerNodeInterest(((DragAndDropNode)object0));
        }
        BooleanRef ref$BooleanRef0 = this.y;
        if(ref$BooleanRef0.element || z1) {
            z = true;
        }
        ref$BooleanRef0.element = z;
        return TraverseDescendantsAction.ContinueTraversal;
    }
}

