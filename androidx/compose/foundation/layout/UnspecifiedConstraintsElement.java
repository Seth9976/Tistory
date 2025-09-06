package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import r0.a;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/a4;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class UnspecifiedConstraintsElement extends ModifierNodeElement {
    public final float b;
    public final float c;

    public UnspecifiedConstraintsElement(float f, float f1) {
        this.b = f;
        this.c = f1;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        Node modifier$Node0 = new a4();  // 初始化器: Landroidx/compose/ui/Modifier$Node;-><init>()V
        modifier$Node0.n = this.b;
        modifier$Node0.o = this.c;
        return modifier$Node0;
    }

    // 去混淆评级： 低(30)
    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        return object0 instanceof UnspecifiedConstraintsElement ? Dp.equals-impl0(this.b, ((UnspecifiedConstraintsElement)object0).b) && Dp.equals-impl0(this.c, ((UnspecifiedConstraintsElement)object0).c) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return Dp.hashCode-impl(this.c) + Dp.hashCode-impl(this.b) * 0x1F;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("defaultMinSize");
        a.j(this.b, inspectorInfo0.getProperties(), "minWidth", inspectorInfo0).set("minHeight", Dp.box-impl(this.c));
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((a4)modifier$Node0).n = this.b;
        ((a4)modifier$Node0).o = this.c;
    }
}

