package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import k0.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/handwriting/HandwritingDetectorElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lk0/b;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class HandwritingDetectorElement extends ModifierNodeElement {
    public final Function0 b;

    public HandwritingDetectorElement(Function0 function00) {
        this.b = function00;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        return new b(this.b);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        return (this == object0 ? 1 : 0) | (!(object0 instanceof HandwritingDetectorElement) || this.b != ((HandwritingDetectorElement)object0).b ? 0 : 1);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.b.hashCode() * 0x1F;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("handwritingDetector");
        inspectorInfo0.getProperties().set("callback", this.b);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((b)modifier$Node0).p = this.b;
    }
}

