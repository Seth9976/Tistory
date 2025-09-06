package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/BoxChildDataElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/p;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class BoxChildDataElement extends ModifierNodeElement {
    public final Alignment b;
    public final boolean c;
    public final Function1 d;

    public BoxChildDataElement(Alignment alignment0, boolean z, Function1 function10) {
        this.b = alignment0;
        this.c = z;
        this.d = function10;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        Node modifier$Node0 = new p();  // 初始化器: Landroidx/compose/ui/Modifier$Node;-><init>()V
        modifier$Node0.n = this.b;
        modifier$Node0.o = this.c;
        return modifier$Node0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        BoxChildDataElement boxChildDataElement0 = object0 instanceof BoxChildDataElement ? ((BoxChildDataElement)object0) : null;
        return boxChildDataElement0 == null ? false : Intrinsics.areEqual(this.b, boxChildDataElement0.b) && this.c == boxChildDataElement0.c;
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
        ((p)modifier$Node0).n = this.b;
        ((p)modifier$Node0).o = this.c;
    }
}

