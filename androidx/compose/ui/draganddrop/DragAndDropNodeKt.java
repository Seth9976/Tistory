package androidx.compose.ui.draganddrop;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.unit.IntSize;
import j0.b2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import m1.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\r\u0010\u0001\u001A\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001A8\u0010\u0001\u001A\u00020\u00002!\u0010\t\u001A\u001D\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\u0001\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "DragAndDropModifierNode", "()Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "Lkotlin/ParameterName;", "name", "event", "", "shouldStartDragAndDrop", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "target", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/draganddrop/DragAndDropTarget;)Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDragAndDropNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNodeKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n1#1,317:1\n56#2,4:318\n70#3,4:322\n*S KotlinDebug\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNodeKt\n*L\n286#1:318,4\n287#1:322,4\n*E\n"})
public final class DragAndDropNodeKt {
    @NotNull
    public static final DragAndDropModifierNode DragAndDropModifierNode() {
        return new DragAndDropNode(c.w);
    }

    @NotNull
    public static final DragAndDropModifierNode DragAndDropModifierNode(@NotNull Function1 function10, @NotNull DragAndDropTarget dragAndDropTarget0) {
        return new DragAndDropNode(new b2(4, function10, dragAndDropTarget0));
    }

    public static final boolean access$contains-Uv8p0NA(DragAndDropModifierNode dragAndDropModifierNode0, long v) {
        if(dragAndDropModifierNode0.getNode().isAttached()) {
            LayoutCoordinates layoutCoordinates0 = DelegatableNodeKt.requireLayoutNode(dragAndDropModifierNode0).getCoordinates();
            if(layoutCoordinates0.isAttached()) {
                long v1 = layoutCoordinates0.getSize-YbymL2g();
                long v2 = LayoutCoordinatesKt.positionInRoot(layoutCoordinates0);
                float f = Offset.getX-impl(v2);
                float f1 = Offset.getY-impl(v2);
                float f2 = ((float)IntSize.getHeight-impl(v1)) + f1;
                float f3 = Offset.getX-impl(v);
                if(f <= f3 && f3 <= ((float)IntSize.getWidth-impl(v1)) + f) {
                    float f4 = Offset.getY-impl(v);
                    return f1 <= f4 && f4 <= f2;
                }
            }
        }
        return false;
    }

    public static final void access$dispatchEntered(DragAndDropTarget dragAndDropTarget0, DragAndDropEvent dragAndDropEvent0) {
        dragAndDropTarget0.onEntered(dragAndDropEvent0);
        dragAndDropTarget0.onMoved(dragAndDropEvent0);
    }

    public static final void access$traverseSelfAndDescendants(TraversableNode traversableNode0, Function1 function10) {
        if(function10.invoke(traversableNode0) == TraverseDescendantsAction.ContinueTraversal) {
            TraversableNodeKt.traverseDescendants(traversableNode0, function10);
        }
    }
}

