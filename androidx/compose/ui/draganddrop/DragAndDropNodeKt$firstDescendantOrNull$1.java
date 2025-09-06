package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction;
import androidx.compose.ui.node.TraversableNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001A\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001A\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "T", "Landroidx/compose/ui/node/TraversableNode;", "child", "invoke", "(Landroidx/compose/ui/node/TraversableNode;)Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDragAndDropNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNodeKt$firstDescendantOrNull$1\n*L\n1#1,317:1\n*E\n"})
public final class DragAndDropNodeKt.firstDescendantOrNull.1 extends Lambda implements Function1 {
    public final Function1 w;
    public final ObjectRef x;

    public DragAndDropNodeKt.firstDescendantOrNull.1(Function1 function10, ObjectRef ref$ObjectRef0) {
        this.w = function10;
        this.x = ref$ObjectRef0;
        super(1);
    }

    @NotNull
    public final TraverseDescendantsAction invoke(@NotNull TraversableNode traversableNode0) {
        if(((Boolean)this.w.invoke(traversableNode0)).booleanValue()) {
            this.x.element = traversableNode0;
            return TraverseDescendantsAction.CancelTraversal;
        }
        return TraverseDescendantsAction.ContinueTraversal;
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.invoke(((TraversableNode)object0));
    }
}

