package androidx.compose.foundation;

import androidx.annotation.RequiresApi;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import u.v2;

@RequiresApi(33)
@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/PreferKeepClearElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lu/v2;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class PreferKeepClearElement extends ModifierNodeElement {
    public final Function1 b;

    public PreferKeepClearElement(Function1 function10) {
        this.b = function10;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        return new v2(this.b);  // 初始化器: Landroidx/compose/foundation/RectListNode;-><init>(Lkotlin/jvm/functions/Function1;)V
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(!(object0 instanceof v2)) {
            return false;
        }
        Function1 function10 = ((v2)object0).getRect();
        return this.b == function10;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.b == null ? 0 : this.b.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("preferKeepClearBounds");
        Function1 function10 = this.b;
        if(function10 != null) {
            inspectorInfo0.getProperties().set("clearRect", function10);
        }
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((v2)modifier$Node0).setRect(this.b);
    }
}

