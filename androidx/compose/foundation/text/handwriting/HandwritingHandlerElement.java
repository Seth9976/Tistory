package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import k0.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/handwriting/HandwritingHandlerElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lk0/d;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class HandwritingHandlerElement extends ModifierNodeElement {
    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        return new d();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        return object0 instanceof HandwritingHandlerElement;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return 0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("handwritingHandler");
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        d d0 = (d)modifier$Node0;
    }
}

