package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/handwriting/StylusHandwritingElementWithNegativePadding;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/handwriting/StylusHandwritingNodeWithNegativePadding;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class StylusHandwritingElementWithNegativePadding extends ModifierNodeElement {
    public final Function0 b;

    public StylusHandwritingElementWithNegativePadding(Function0 function00) {
        this.b = function00;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        return new StylusHandwritingNodeWithNegativePadding(this.b);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof StylusHandwritingElementWithNegativePadding ? Intrinsics.areEqual(this.b, ((StylusHandwritingElementWithNegativePadding)object0).b) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("stylusHandwriting");
        inspectorInfo0.getProperties().set("onHandwritingSlopExceeded", this.b);
    }

    @Override
    public final String toString() {
        return "StylusHandwritingElementWithNegativePadding(onHandwritingSlopExceeded=" + this.b + ')';
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((StylusHandwritingNodeWithNegativePadding)modifier$Node0).setOnHandwritingSlopExceeded(this.b);
    }
}

