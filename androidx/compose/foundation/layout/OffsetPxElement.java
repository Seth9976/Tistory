package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import r0.a;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/OffsetPxElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/k3;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class OffsetPxElement extends ModifierNodeElement {
    public final Function1 b;
    public final boolean c;
    public final Lambda d;

    public OffsetPxElement(Function1 function10, Function1 function11, boolean z) {
        this.b = function10;
        this.c = z;
        this.d = (Lambda)function11;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        Node modifier$Node0 = new k3();  // 初始化器: Landroidx/compose/ui/Modifier$Node;-><init>()V
        modifier$Node0.n = this.b;
        modifier$Node0.o = this.c;
        return modifier$Node0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        OffsetPxElement offsetPxElement0 = object0 instanceof OffsetPxElement ? ((OffsetPxElement)object0) : null;
        return offsetPxElement0 == null ? false : this.b == offsetPxElement0.b && this.c == offsetPxElement0.c;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return Boolean.hashCode(this.c) + this.b.hashCode() * 0x1F;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        ((Function1)this.d).invoke(inspectorInfo0);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("OffsetPxModifier(offset=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", rtlAware=");
        return a.p(stringBuilder0, this.c, ')');
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((k3)modifier$Node0).n = this.b;
        ((k3)modifier$Node0).o = this.c;
    }
}

