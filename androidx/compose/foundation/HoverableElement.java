package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import u.b2;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/HoverableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lu/b2;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class HoverableElement extends ModifierNodeElement {
    public final MutableInteractionSource b;

    public HoverableElement(MutableInteractionSource mutableInteractionSource0) {
        this.b = mutableInteractionSource0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        Node modifier$Node0 = new b2();  // 初始化器: Landroidx/compose/ui/Modifier$Node;-><init>()V
        modifier$Node0.n = this.b;
        return modifier$Node0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof HoverableElement ? Intrinsics.areEqual(((HoverableElement)object0).b, this.b) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.b.hashCode() * 0x1F;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("hoverable");
        inspectorInfo0.getProperties().set("interactionSource", this.b);
        inspectorInfo0.getProperties().set("enabled", Boolean.TRUE);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        MutableInteractionSource mutableInteractionSource0 = this.b;
        if(!Intrinsics.areEqual(((b2)modifier$Node0).n, mutableInteractionSource0)) {
            ((b2)modifier$Node0).d();
            ((b2)modifier$Node0).n = mutableInteractionSource0;
        }
    }
}

