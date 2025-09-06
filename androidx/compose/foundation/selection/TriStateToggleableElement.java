package androidx.compose.foundation.selection;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import h0.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r0.a;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/TriStateToggleableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lh0/g;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class TriStateToggleableElement extends ModifierNodeElement {
    public final ToggleableState b;
    public final MutableInteractionSource c;
    public final IndicationNodeFactory d;
    public final boolean e;
    public final Role f;
    public final Function0 g;

    public TriStateToggleableElement(ToggleableState toggleableState0, MutableInteractionSource mutableInteractionSource0, IndicationNodeFactory indicationNodeFactory0, boolean z, Role role0, Function0 function00) {
        this.b = toggleableState0;
        this.c = mutableInteractionSource0;
        this.d = indicationNodeFactory0;
        this.e = z;
        this.f = role0;
        this.g = function00;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        Node modifier$Node0 = new g(this.c, this.d, this.e, null, this.f, this.g, null);  // 初始化器: Landroidx/compose/foundation/ClickableNode;-><init>(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
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
        if(TriStateToggleableElement.class != class0) {
            return false;
        }
        if(this.b != ((TriStateToggleableElement)object0).b) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((TriStateToggleableElement)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((TriStateToggleableElement)object0).d)) {
            return false;
        }
        if(this.e != ((TriStateToggleableElement)object0).e) {
            return false;
        }
        return Intrinsics.areEqual(this.f, ((TriStateToggleableElement)object0).f) ? this.g == ((TriStateToggleableElement)object0).g : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int v = 0;
        int v1 = a.e(((this.b.hashCode() * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F + (this.d == null ? 0 : this.d.hashCode())) * 0x1F, 0x1F, this.e);
        Role role0 = this.f;
        if(role0 != null) {
            v = Role.hashCode-impl(role0.unbox-impl());
        }
        return this.g.hashCode() + (v1 + v) * 0x1F;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("triStateToggleable");
        inspectorInfo0.getProperties().set("state", this.b);
        inspectorInfo0.getProperties().set("interactionSource", this.c);
        inspectorInfo0.getProperties().set("indicationNodeFactory", this.d);
        a.k(this.e, inspectorInfo0.getProperties(), "enabled", inspectorInfo0).set("role", this.f);
        inspectorInfo0.getProperties().set("onClick", this.g);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ToggleableState toggleableState0 = this.b;
        if(((g)modifier$Node0).G != toggleableState0) {
            ((g)modifier$Node0).G = toggleableState0;
            SemanticsModifierNodeKt.invalidateSemantics(((g)modifier$Node0));
        }
        ((g)modifier$Node0).update-QzZPfjk(this.c, this.d, this.e, null, this.f, this.g);
    }
}

