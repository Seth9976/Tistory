package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r0.a;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/ClickableNode;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class ClickableElement extends ModifierNodeElement {
    public final MutableInteractionSource b;
    public final IndicationNodeFactory c;
    public final boolean d;
    public final String e;
    public final Role f;
    public final Function0 g;

    public ClickableElement(MutableInteractionSource mutableInteractionSource0, IndicationNodeFactory indicationNodeFactory0, boolean z, String s, Role role0, Function0 function00) {
        this.b = mutableInteractionSource0;
        this.c = indicationNodeFactory0;
        this.d = z;
        this.e = s;
        this.f = role0;
        this.g = function00;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        return new ClickableNode(this.b, this.c, this.d, this.e, this.f, this.g, null);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        Class class0 = object0.getClass();
        if(ClickableElement.class != class0) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((ClickableElement)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((ClickableElement)object0).c)) {
            return false;
        }
        if(this.d != ((ClickableElement)object0).d) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((ClickableElement)object0).e)) {
            return false;
        }
        return Intrinsics.areEqual(this.f, ((ClickableElement)object0).f) ? this.g == ((ClickableElement)object0).g : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int v = 0;
        int v1 = a.e(((this.b == null ? 0 : this.b.hashCode()) * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F, 0x1F, this.d);
        int v2 = this.e == null ? 0 : this.e.hashCode();
        Role role0 = this.f;
        if(role0 != null) {
            v = Role.hashCode-impl(role0.unbox-impl());
        }
        return this.g.hashCode() + ((v1 + v2) * 0x1F + v) * 0x1F;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("clickable");
        a.k(this.d, inspectorInfo0.getProperties(), "enabled", inspectorInfo0).set("onClick", this.g);
        inspectorInfo0.getProperties().set("onClickLabel", this.e);
        inspectorInfo0.getProperties().set("role", this.f);
        inspectorInfo0.getProperties().set("interactionSource", this.b);
        inspectorInfo0.getProperties().set("indicationNodeFactory", this.c);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((ClickableNode)modifier$Node0).update-QzZPfjk(this.b, this.c, this.d, this.e, this.f, this.g);
    }
}

