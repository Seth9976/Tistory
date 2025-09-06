package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s.h1;
import y.c;

@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/draganddrop/DropTargetElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Ly/c;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class DropTargetElement extends ModifierNodeElement {
    public final Function1 b;
    public final DragAndDropTarget c;

    public DropTargetElement(Function1 function10, DragAndDropTarget dragAndDropTarget0) {
        this.b = function10;
        this.c = dragAndDropTarget0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        Node modifier$Node0 = new c();  // 初始化器: Landroidx/compose/ui/node/DelegatingNode;-><init>()V
        modifier$Node0.p = this.b;
        modifier$Node0.q = this.c;
        return modifier$Node0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DropTargetElement)) {
            return false;
        }
        return Intrinsics.areEqual(this.c, ((DropTargetElement)object0).c) ? this.b == ((DropTargetElement)object0).b : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.b.hashCode() + this.c.hashCode() * 0x1F;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("dropTarget");
        inspectorInfo0.getProperties().set("target", this.c);
        inspectorInfo0.getProperties().set("shouldStartDragAndDrop", this.b);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((c)modifier$Node0).p = this.b;
        DragAndDropTarget dragAndDropTarget0 = this.c;
        if(!Intrinsics.areEqual(dragAndDropTarget0, ((c)modifier$Node0).q)) {
            DragAndDropModifierNode dragAndDropModifierNode0 = ((c)modifier$Node0).r;
            if(dragAndDropModifierNode0 != null) {
                ((c)modifier$Node0).undelegate(dragAndDropModifierNode0);
            }
            ((c)modifier$Node0).q = dragAndDropTarget0;
            ((c)modifier$Node0).r = (DragAndDropModifierNode)((c)modifier$Node0).delegate(DragAndDropNodeKt.DragAndDropModifierNode(new h1(((c)modifier$Node0), 22), ((c)modifier$Node0).q));
        }
    }
}

