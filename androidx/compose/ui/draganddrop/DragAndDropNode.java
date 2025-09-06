package androidx.compose.ui.draganddrop;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import m1.b;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u0000 ,2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001,B,\u0012#\u0010\n\u001A\u001F\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ;\u0010\u0019\u001A\u00020\r2\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u00122\u0017\u0010\u0016\u001A\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0002\b\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001C\u001A\u00020\u001B2\u0006\u0010\u001A\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\u001C\u0010\u001DJ\u0017\u0010\u001E\u001A\u00020\r2\u0006\u0010\b\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\u001E\u0010\u001FJ\u0017\u0010 \u001A\u00020\r2\u0006\u0010\b\u001A\u00020\u0005H\u0016¢\u0006\u0004\b \u0010\u001FJ\u0017\u0010!\u001A\u00020\r2\u0006\u0010\b\u001A\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\u001FJ\u0017\u0010\"\u001A\u00020\r2\u0006\u0010\b\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010\u001FJ\u0017\u0010#\u001A\u00020\r2\u0006\u0010\b\u001A\u00020\u0005H\u0016¢\u0006\u0004\b#\u0010\u001FJ\u0017\u0010$\u001A\u00020\u001B2\u0006\u0010\b\u001A\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010\u001DJ\u0017\u0010%\u001A\u00020\r2\u0006\u0010\b\u001A\u00020\u0005H\u0016¢\u0006\u0004\b%\u0010\u001FR\u001A\u0010+\u001A\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010*\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006-"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "Lkotlin/ParameterName;", "name", "event", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "onDragAndDropStart", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "onDetach", "()V", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "transferData", "Landroidx/compose/ui/geometry/Size;", "decorationSize", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "drawDragDecoration", "drag-12SF9DM", "(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)V", "drag", "startEvent", "", "acceptDragAndDropTransfer", "(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)Z", "onStarted", "(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)V", "onEntered", "onMoved", "onChanged", "onExited", "onDrop", "onEnded", "", "o", "Ljava/lang/Object;", "getTraverseKey", "()Ljava/lang/Object;", "traverseKey", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDragAndDropNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNode\n+ 2 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNodeKt\n*L\n1#1,317:1\n306#2,10:318\n*S KotlinDebug\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNode\n*L\n203#1:318,10\n*E\n"})
public final class DragAndDropNode extends Node implements DragAndDropModifierNode, TraversableNode {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropNode$Companion;", "", "androidx/compose/ui/draganddrop/a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final Function1 n;
    public final a o;
    public DragAndDropModifierNode p;
    public DragAndDropTarget q;

    static {
        DragAndDropNode.Companion = new Companion(null);
        DragAndDropNode.$stable = 8;
    }

    public DragAndDropNode(@NotNull Function1 function10) {
        this.n = function10;
        this.o = a.a;
    }

    @Override  // androidx.compose.ui.draganddrop.DragAndDropModifierNode
    public boolean acceptDragAndDropTransfer(@NotNull DragAndDropEvent dragAndDropEvent0) {
        BooleanRef ref$BooleanRef0 = new BooleanRef();
        DragAndDropNodeKt.access$traverseSelfAndDescendants(this, new m1.a(dragAndDropEvent0, this, ref$BooleanRef0));
        return ref$BooleanRef0.element;
    }

    @Override  // androidx.compose.ui.draganddrop.DragAndDropModifierNode
    public void drag-12SF9DM(@NotNull DragAndDropTransferData dragAndDropTransferData0, long v, @NotNull Function1 function10) {
        DelegatableNodeKt.requireOwner(this).getDragAndDropManager().drag-12SF9DM(dragAndDropTransferData0, v, function10);
    }

    @Override  // androidx.compose.ui.node.TraversableNode
    @NotNull
    public Object getTraverseKey() {
        return this.o;
    }

    @Override  // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onChanged(@NotNull DragAndDropEvent dragAndDropEvent0) {
        DragAndDropTarget dragAndDropTarget0 = this.q;
        if(dragAndDropTarget0 == null) {
            DragAndDropModifierNode dragAndDropModifierNode0 = this.p;
            if(dragAndDropModifierNode0 != null) {
                dragAndDropModifierNode0.onChanged(dragAndDropEvent0);
            }
        }
        else {
            dragAndDropTarget0.onChanged(dragAndDropEvent0);
        }
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onDetach() {
        this.q = null;
        this.p = null;
    }

    @Override  // androidx.compose.ui.draganddrop.DragAndDropTarget
    public boolean onDrop(@NotNull DragAndDropEvent dragAndDropEvent0) {
        DragAndDropModifierNode dragAndDropModifierNode0 = this.p;
        if(dragAndDropModifierNode0 == null) {
            return this.q == null ? false : this.q.onDrop(dragAndDropEvent0);
        }
        return dragAndDropModifierNode0.onDrop(dragAndDropEvent0);
    }

    @Override  // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onEnded(@NotNull DragAndDropEvent dragAndDropEvent0) {
        DragAndDropNodeKt.access$traverseSelfAndDescendants(this, new b(dragAndDropEvent0));
    }

    @Override  // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onEntered(@NotNull DragAndDropEvent dragAndDropEvent0) {
        DragAndDropTarget dragAndDropTarget0 = this.q;
        if(dragAndDropTarget0 == null) {
            DragAndDropModifierNode dragAndDropModifierNode0 = this.p;
            if(dragAndDropModifierNode0 != null) {
                dragAndDropModifierNode0.onEntered(dragAndDropEvent0);
            }
        }
        else {
            dragAndDropTarget0.onEntered(dragAndDropEvent0);
        }
    }

    @Override  // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onExited(@NotNull DragAndDropEvent dragAndDropEvent0) {
        DragAndDropTarget dragAndDropTarget0 = this.q;
        if(dragAndDropTarget0 != null) {
            dragAndDropTarget0.onExited(dragAndDropEvent0);
        }
        DragAndDropModifierNode dragAndDropModifierNode0 = this.p;
        if(dragAndDropModifierNode0 != null) {
            dragAndDropModifierNode0.onExited(dragAndDropEvent0);
        }
        this.p = null;
    }

    @Override  // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onMoved(@NotNull DragAndDropEvent dragAndDropEvent0) {
        DragAndDropModifierNode dragAndDropModifierNode1;
        TraversableNode traversableNode0;
        DragAndDropModifierNode dragAndDropModifierNode0 = this.p;
        if(dragAndDropModifierNode0 == null || !DragAndDropNodeKt.access$contains-Uv8p0NA(dragAndDropModifierNode0, DragAndDrop_androidKt.getPositionInRoot(dragAndDropEvent0))) {
            if(this.getNode().isAttached()) {
                ObjectRef ref$ObjectRef0 = new ObjectRef();
                TraversableNodeKt.traverseDescendants(this, new Function1(this, dragAndDropEvent0) {
                    public final ObjectRef w;
                    public final DragAndDropNode x;
                    public final DragAndDropEvent y;

                    {
                        this.w = ref$ObjectRef0;
                        this.x = dragAndDropNode0;
                        this.y = dragAndDropEvent0;
                        super(1);
                    }

                    @NotNull
                    public final TraverseDescendantsAction invoke(@NotNull TraversableNode traversableNode0) {
                        if(DelegatableNodeKt.requireOwner(this.x).getDragAndDropManager().isInterestedNode(((DragAndDropNode)traversableNode0)) && DragAndDropNodeKt.access$contains-Uv8p0NA(((DragAndDropNode)traversableNode0), DragAndDrop_androidKt.getPositionInRoot(this.y))) {
                            this.w.element = traversableNode0;
                            return TraverseDescendantsAction.CancelTraversal;
                        }
                        return TraverseDescendantsAction.ContinueTraversal;
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.invoke(((TraversableNode)object0));
                    }
                });
                traversableNode0 = (TraversableNode)ref$ObjectRef0.element;
            }
            else {
                traversableNode0 = null;
            }
            dragAndDropModifierNode1 = (DragAndDropModifierNode)traversableNode0;
        }
        else {
            dragAndDropModifierNode1 = dragAndDropModifierNode0;
        }
        if(dragAndDropModifierNode1 != null && dragAndDropModifierNode0 == null) {
            DragAndDropNodeKt.access$dispatchEntered(dragAndDropModifierNode1, dragAndDropEvent0);
            DragAndDropTarget dragAndDropTarget0 = this.q;
            if(dragAndDropTarget0 != null) {
                dragAndDropTarget0.onExited(dragAndDropEvent0);
            }
        }
        else if(dragAndDropModifierNode1 == null && dragAndDropModifierNode0 != null) {
            DragAndDropTarget dragAndDropTarget1 = this.q;
            if(dragAndDropTarget1 != null) {
                DragAndDropNodeKt.access$dispatchEntered(dragAndDropTarget1, dragAndDropEvent0);
            }
            dragAndDropModifierNode0.onExited(dragAndDropEvent0);
        }
        else if(!Intrinsics.areEqual(dragAndDropModifierNode1, dragAndDropModifierNode0)) {
            if(dragAndDropModifierNode1 != null) {
                DragAndDropNodeKt.access$dispatchEntered(dragAndDropModifierNode1, dragAndDropEvent0);
            }
            if(dragAndDropModifierNode0 != null) {
                dragAndDropModifierNode0.onExited(dragAndDropEvent0);
            }
        }
        else if(dragAndDropModifierNode1 == null) {
            DragAndDropTarget dragAndDropTarget2 = this.q;
            if(dragAndDropTarget2 != null) {
                dragAndDropTarget2.onMoved(dragAndDropEvent0);
            }
        }
        else {
            dragAndDropModifierNode1.onMoved(dragAndDropEvent0);
        }
        this.p = dragAndDropModifierNode1;
    }

    @Override  // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onStarted(@NotNull DragAndDropEvent dragAndDropEvent0) {
        DragAndDropTarget dragAndDropTarget0 = this.q;
        if(dragAndDropTarget0 == null) {
            DragAndDropModifierNode dragAndDropModifierNode0 = this.p;
            if(dragAndDropModifierNode0 != null) {
                dragAndDropModifierNode0.onStarted(dragAndDropEvent0);
            }
        }
        else {
            dragAndDropTarget0.onStarted(dragAndDropEvent0);
        }
    }
}

