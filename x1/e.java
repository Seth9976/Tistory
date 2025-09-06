package x1;

import androidx.compose.ui.input.pointer.PointerHoverIconModifierNode;
import androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class e extends Lambda implements Function1 {
    public final ObjectRef w;

    public e(ObjectRef ref$ObjectRef0) {
        this.w = ref$ObjectRef0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction0 = TraverseDescendantsAction.ContinueTraversal;
        if(((PointerHoverIconModifierNode)object0).q) {
            this.w.element = (PointerHoverIconModifierNode)object0;
            return ((PointerHoverIconModifierNode)object0).getOverrideDescendants() ? TraverseDescendantsAction.SkipSubtreeAndContinueTraversal : traversableNode$Companion$TraverseDescendantsAction0;
        }
        return traversableNode$Companion$TraverseDescendantsAction0;
    }
}

