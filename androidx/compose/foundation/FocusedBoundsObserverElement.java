package androidx.compose.foundation;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/FocusedBoundsObserverElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/FocusedBoundsObserverNode;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class FocusedBoundsObserverElement extends ModifierNodeElement {
    public final Function1 b;

    public FocusedBoundsObserverElement(Function1 function10) {
        this.b = function10;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        return new FocusedBoundsObserverNode(this.b);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        FocusedBoundsObserverElement focusedBoundsObserverElement0 = object0 instanceof FocusedBoundsObserverElement ? ((FocusedBoundsObserverElement)object0) : null;
        return focusedBoundsObserverElement0 == null ? false : this.b == focusedBoundsObserverElement0.b;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("onFocusedBoundsChanged");
        inspectorInfo0.getProperties().set("onPositioned", this.b);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((FocusedBoundsObserverNode)modifier$Node0).setOnPositioned(this.b);
    }
}

