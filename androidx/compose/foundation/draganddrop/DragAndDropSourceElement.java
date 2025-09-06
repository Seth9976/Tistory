package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class DragAndDropSourceElement extends ModifierNodeElement {
    public final Function1 b;
    public final Function2 c;

    public DragAndDropSourceElement(Function1 function10, Function2 function20) {
        this.b = function10;
        this.c = function20;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        return new DragAndDropSourceNode(this.b, this.c);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DragAndDropSourceElement)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((DragAndDropSourceElement)object0).b) ? Intrinsics.areEqual(this.c, ((DragAndDropSourceElement)object0).c) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.c.hashCode() + this.b.hashCode() * 0x1F;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("dragSource");
        inspectorInfo0.getProperties().set("drawDragDecoration", this.b);
        inspectorInfo0.getProperties().set("dragAndDropSourceHandler", this.c);
    }

    @Override
    public final String toString() {
        return "DragAndDropSourceElement(drawDragDecoration=" + this.b + ", dragAndDropSourceHandler=" + this.c + ')';
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((DragAndDropSourceNode)modifier$Node0).setDrawDragDecoration(this.b);
        ((DragAndDropSourceNode)modifier$Node0).setDragAndDropSourceHandler(this.c);
    }
}

