package x1;

import androidx.compose.ui.input.pointer.PointerHoverIconModifierNode;
import androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.BooleanRef;

public final class d extends Lambda implements Function1 {
    public final BooleanRef w;

    public d(BooleanRef ref$BooleanRef0) {
        this.w = ref$BooleanRef0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(((PointerHoverIconModifierNode)object0).q) {
            this.w.element = false;
            return TraverseDescendantsAction.CancelTraversal;
        }
        return TraverseDescendantsAction.ContinueTraversal;
    }
}

