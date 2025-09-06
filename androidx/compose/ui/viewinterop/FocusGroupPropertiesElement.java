package androidx.compose.ui.viewinterop;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import u2.l;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/viewinterop/FocusGroupPropertiesElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lu2/l;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class FocusGroupPropertiesElement extends ModifierNodeElement {
    public static final FocusGroupPropertiesElement b;

    static {
        FocusGroupPropertiesElement.b = new FocusGroupPropertiesElement();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        return new l();  // 初始化器: Landroidx/compose/ui/Modifier$Node;-><init>()V
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        return object0 == this;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return 0x8D00D93A;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("FocusGroupProperties");
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        l l0 = (l)modifier$Node0;
    }
}

