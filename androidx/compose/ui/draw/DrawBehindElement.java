package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawBehindElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/draw/DrawBackgroundModifier;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class DrawBehindElement extends ModifierNodeElement {
    public final Function1 b;

    public DrawBehindElement(Function1 function10) {
        this.b = function10;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        return new DrawBackgroundModifier(this.b);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof DrawBehindElement ? Intrinsics.areEqual(this.b, ((DrawBehindElement)object0).b) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("drawBehind");
        inspectorInfo0.getProperties().set("onDraw", this.b);
    }

    @Override
    public final String toString() {
        return "DrawBehindElement(onDraw=" + this.b + ')';
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((DrawBackgroundModifier)modifier$Node0).setOnDraw(this.b);
    }
}

