package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import v1.b;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/key/KeyInputElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lv1/b;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class KeyInputElement extends ModifierNodeElement {
    public final Function1 b;
    public final Function1 c;

    public KeyInputElement(Function1 function10, Function1 function11) {
        this.b = function10;
        this.c = function11;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        Node modifier$Node0 = new b();  // 初始化器: Landroidx/compose/ui/Modifier$Node;-><init>()V
        modifier$Node0.n = this.b;
        modifier$Node0.o = this.c;
        return modifier$Node0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof KeyInputElement)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((KeyInputElement)object0).b) ? Intrinsics.areEqual(this.c, ((KeyInputElement)object0).c) : false;
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
            inspectorInfo0.setName("onKeyEvent");
            inspectorInfo0.getProperties().set("onKeyEvent", function10);
        }
        Function1 function11 = this.c;
        if(function11 != null) {
            inspectorInfo0.setName("onPreviewKeyEvent");
            inspectorInfo0.getProperties().set("onPreviewKeyEvent", function11);
        }
    }

    @Override
    public final String toString() {
        return "KeyInputElement(onKeyEvent=" + this.b + ", onPreKeyEvent=" + this.c + ')';
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((b)modifier$Node0).n = this.b;
        ((b)modifier$Node0).o = this.c;
    }
}

