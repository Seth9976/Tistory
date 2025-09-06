package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicWidthElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/d3;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class IntrinsicWidthElement extends ModifierNodeElement {
    public final IntrinsicSize b;
    public final boolean c;
    public final Function1 d;

    public IntrinsicWidthElement(IntrinsicSize intrinsicSize0, boolean z, Function1 function10) {
        this.b = intrinsicSize0;
        this.c = z;
        this.d = function10;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        Node modifier$Node0 = new d3();  // 初始化器: Landroidx/compose/ui/Modifier$Node;-><init>()V
        modifier$Node0.n = this.b;
        modifier$Node0.o = this.c;
        return modifier$Node0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        IntrinsicWidthElement intrinsicWidthElement0 = object0 instanceof IntrinsicWidthElement ? ((IntrinsicWidthElement)object0) : null;
        return intrinsicWidthElement0 == null ? false : this.b == intrinsicWidthElement0.b && this.c == intrinsicWidthElement0.c;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return Boolean.hashCode(this.c) + this.b.hashCode() * 0x1F;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        this.d.invoke(inspectorInfo0);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((d3)modifier$Node0).n = this.b;
        ((d3)modifier$Node0).o = this.c;
    }
}

