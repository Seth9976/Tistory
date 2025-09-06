package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import y.b;

@ExperimentalFoundationApi
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BI\u0012\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012\'\u0010\f\u001A#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\b¢\u0006\u0002\b\u0006¢\u0006\u0004\b\r\u0010\u000EJ\u001A\u0010\u0013\u001A\u00020\u00052\u0006\u0010\u0010\u001A\u00020\u000FH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R3\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019RC\u0010\f\u001A#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\b¢\u0006\u0002\b\u00068\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001D\"\u0004\b\u001E\u0010\u001F\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "drawDragDecoration", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceScope;", "Lkotlin/coroutines/Continuation;", "", "dragAndDropSourceHandler", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/unit/IntSize;", "size", "onRemeasured-ozmzZPI", "(J)V", "onRemeasured", "p", "Lkotlin/jvm/functions/Function1;", "getDrawDragDecoration", "()Lkotlin/jvm/functions/Function1;", "setDrawDragDecoration", "(Lkotlin/jvm/functions/Function1;)V", "q", "Lkotlin/jvm/functions/Function2;", "getDragAndDropSourceHandler", "()Lkotlin/jvm/functions/Function2;", "setDragAndDropSourceHandler", "(Lkotlin/jvm/functions/Function2;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DragAndDropSourceNode extends DelegatingNode implements LayoutAwareModifierNode {
    public static final int $stable = 8;
    public Function1 p;
    public Function2 q;

    public DragAndDropSourceNode(@NotNull Function1 function10, @NotNull Function2 function20) {
        this.p = function10;
        this.q = function20;
        this.delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new b(this, ((DragAndDropModifierNode)this.delegate(DragAndDropNodeKt.DragAndDropModifierNode())), null)));
    }

    @NotNull
    public final Function2 getDragAndDropSourceHandler() {
        return this.q;
    }

    @NotNull
    public final Function1 getDrawDragDecoration() {
        return this.p;
    }

    @Override  // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onRemeasured-ozmzZPI(long v) {
    }

    public final void setDragAndDropSourceHandler(@NotNull Function2 function20) {
        this.q = function20;
    }

    public final void setDrawDragDecoration(@NotNull Function1 function10) {
        this.p = function10;
    }
}

