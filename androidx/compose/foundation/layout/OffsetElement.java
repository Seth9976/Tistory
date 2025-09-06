package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import r0.a;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/OffsetElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/i3;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class OffsetElement extends ModifierNodeElement {
    public final float b;
    public final float c;
    public final boolean d;
    public final Lambda e;

    public OffsetElement(float f, float f1, boolean z, Function1 function10) {
        this.b = f;
        this.c = f1;
        this.d = z;
        this.e = (Lambda)function10;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        Node modifier$Node0 = new i3();  // 初始化器: Landroidx/compose/ui/Modifier$Node;-><init>()V
        modifier$Node0.n = this.b;
        modifier$Node0.o = this.c;
        modifier$Node0.p = this.d;
        return modifier$Node0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        OffsetElement offsetElement0 = object0 instanceof OffsetElement ? ((OffsetElement)object0) : null;
        return offsetElement0 == null ? false : Dp.equals-impl0(this.b, offsetElement0.b) && Dp.equals-impl0(this.c, offsetElement0.c) && this.d == offsetElement0.d;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return Boolean.hashCode(this.d) + a.C(this.c, Dp.hashCode-impl(this.b) * 0x1F, 0x1F);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        ((Function1)this.e).invoke(inspectorInfo0);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("OffsetModifierElement(x=");
        a.u(this.b, ", y=", stringBuilder0);
        a.u(this.c, ", rtlAware=", stringBuilder0);
        return a.p(stringBuilder0, this.d, ')');
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((i3)modifier$Node0).n = this.b;
        ((i3)modifier$Node0).o = this.c;
        ((i3)modifier$Node0).p = this.d;
    }
}

