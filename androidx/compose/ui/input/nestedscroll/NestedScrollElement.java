package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class NestedScrollElement extends ModifierNodeElement {
    public final NestedScrollConnection b;
    public final NestedScrollDispatcher c;

    public NestedScrollElement(NestedScrollConnection nestedScrollConnection0, NestedScrollDispatcher nestedScrollDispatcher0) {
        this.b = nestedScrollConnection0;
        this.c = nestedScrollDispatcher0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        return new NestedScrollNode(this.b, this.c);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(!(object0 instanceof NestedScrollElement)) {
            return false;
        }
        return Intrinsics.areEqual(((NestedScrollElement)object0).b, this.b) ? Intrinsics.areEqual(((NestedScrollElement)object0).c, this.c) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int v = this.b.hashCode();
        return this.c == null ? v * 0x1F : v * 0x1F + this.c.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("nestedScroll");
        inspectorInfo0.getProperties().set("connection", this.b);
        inspectorInfo0.getProperties().set("dispatcher", this.c);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((NestedScrollNode)modifier$Node0).updateNode$ui_release(this.b, this.c);
    }
}

