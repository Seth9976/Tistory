package androidx.compose.ui.input.rotary;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import y1.a;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/rotary/RotaryInputElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Ly1/a;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class RotaryInputElement extends ModifierNodeElement {
    public final Function1 b;
    public final Function1 c;

    public RotaryInputElement(Function1 function10, Function1 function11) {
        this.b = function10;
        this.c = function11;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        Node modifier$Node0 = new a();  // 初始化器: Landroidx/compose/ui/Modifier$Node;-><init>()V
        modifier$Node0.n = this.b;
        modifier$Node0.o = this.c;
        return modifier$Node0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof RotaryInputElement)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((RotaryInputElement)object0).b) ? Intrinsics.areEqual(this.c, ((RotaryInputElement)object0).c) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int v = 0;
        int v1 = this.b == null ? 0 : this.b.hashCode();
        Function1 function10 = this.c;
        if(function10 != null) {
            v = function10.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        Function1 function10 = this.b;
        if(function10 != null) {
            inspectorInfo0.setName("onRotaryScrollEvent");
            inspectorInfo0.getProperties().set("onRotaryScrollEvent", function10);
        }
        Function1 function11 = this.c;
        if(function11 != null) {
            inspectorInfo0.setName("onPreRotaryScrollEvent");
            inspectorInfo0.getProperties().set("onPreRotaryScrollEvent", function11);
        }
    }

    @Override
    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.b + ", onPreRotaryScrollEvent=" + this.c + ')';
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((a)modifier$Node0).n = this.b;
        ((a)modifier$Node0).o = this.c;
    }
}

