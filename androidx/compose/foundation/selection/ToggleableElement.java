package androidx.compose.foundation.selection;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import h0.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r0.a;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/ToggleableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lh0/f;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class ToggleableElement extends ModifierNodeElement {
    public final boolean b;
    public final MutableInteractionSource c;
    public final IndicationNodeFactory d;
    public final boolean e;
    public final Role f;
    public final Function1 g;

    public ToggleableElement(boolean z, MutableInteractionSource mutableInteractionSource0, IndicationNodeFactory indicationNodeFactory0, boolean z1, Role role0, Function1 function10) {
        this.b = z;
        this.c = mutableInteractionSource0;
        this.d = indicationNodeFactory0;
        this.e = z1;
        this.f = role0;
        this.g = function10;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        return new f(this.b, this.c, this.d, this.e, this.f, this.g);
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
        if(ToggleableElement.class != class0) {
            return false;
        }
        if(this.b != ((ToggleableElement)object0).b) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((ToggleableElement)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((ToggleableElement)object0).d)) {
            return false;
        }
        if(this.e != ((ToggleableElement)object0).e) {
            return false;
        }
        return Intrinsics.areEqual(this.f, ((ToggleableElement)object0).f) ? this.g == ((ToggleableElement)object0).g : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int v = 0;
        int v1 = a.e(((Boolean.hashCode(this.b) * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F + (this.d == null ? 0 : this.d.hashCode())) * 0x1F, 0x1F, this.e);
        Role role0 = this.f;
        if(role0 != null) {
            v = Role.hashCode-impl(role0.unbox-impl());
        }
        return this.g.hashCode() + (v1 + v) * 0x1F;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("toggleable");
        inspectorInfo0.getProperties().set("value", inspectorInfo0.getValue());
        inspectorInfo0.getProperties().set("interactionSource", this.c);
        inspectorInfo0.getProperties().set("indicationNodeFactory", this.d);
        a.k(this.e, inspectorInfo0.getProperties(), "enabled", inspectorInfo0).set("role", this.f);
        inspectorInfo0.getProperties().set("onValueChange", this.g);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        boolean z = this.b;
        if(((f)modifier$Node0).G != z) {
            ((f)modifier$Node0).G = z;
            SemanticsModifierNodeKt.invalidateSemantics(((f)modifier$Node0));
        }
        ((f)modifier$Node0).H = this.g;
        ((f)modifier$Node0).update-QzZPfjk(this.c, this.d, this.e, null, this.f, ((f)modifier$Node0).I);
    }
}

