package androidx.compose.foundation.selection;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import h0.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r0.a;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/SelectableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lh0/c;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class SelectableElement extends ModifierNodeElement {
    public final boolean b;
    public final MutableInteractionSource c;
    public final IndicationNodeFactory d;
    public final boolean e;
    public final Role f;
    public final Function0 g;

    public SelectableElement(boolean z, MutableInteractionSource mutableInteractionSource0, IndicationNodeFactory indicationNodeFactory0, boolean z1, Role role0, Function0 function00) {
        this.b = z;
        this.c = mutableInteractionSource0;
        this.d = indicationNodeFactory0;
        this.e = z1;
        this.f = role0;
        this.g = function00;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        Node modifier$Node0 = new c(this.c, this.d, this.e, null, this.f, this.g, null);  // 初始化器: Landroidx/compose/foundation/ClickableNode;-><init>(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        modifier$Node0.G = this.b;
        return modifier$Node0;
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
        if(SelectableElement.class != class0) {
            return false;
        }
        if(this.b != ((SelectableElement)object0).b) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((SelectableElement)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((SelectableElement)object0).d)) {
            return false;
        }
        if(this.e != ((SelectableElement)object0).e) {
            return false;
        }
        return Intrinsics.areEqual(this.f, ((SelectableElement)object0).f) ? this.g == ((SelectableElement)object0).g : false;
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
        inspectorInfo0.setName("selectable");
        a.k(this.b, inspectorInfo0.getProperties(), "selected", inspectorInfo0).set("interactionSource", this.c);
        inspectorInfo0.getProperties().set("indicationNodeFactory", this.d);
        a.k(this.e, inspectorInfo0.getProperties(), "enabled", inspectorInfo0).set("role", this.f);
        inspectorInfo0.getProperties().set("onClick", this.g);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        boolean z = this.b;
        if(((c)modifier$Node0).G != z) {
            ((c)modifier$Node0).G = z;
            SemanticsModifierNodeKt.invalidateSemantics(((c)modifier$Node0));
        }
        ((c)modifier$Node0).update-QzZPfjk(this.c, this.d, this.e, null, this.f, this.g);
    }
}

