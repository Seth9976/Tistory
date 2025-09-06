package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import u.i2;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/IndicationModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lu/i2;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class IndicationModifierElement extends ModifierNodeElement {
    public final InteractionSource b;
    public final IndicationNodeFactory c;

    public IndicationModifierElement(InteractionSource interactionSource0, IndicationNodeFactory indicationNodeFactory0) {
        this.b = interactionSource0;
        this.c = indicationNodeFactory0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        DelegatableNode delegatableNode0 = this.c.create(this.b);
        Node modifier$Node0 = new i2();  // 初始化器: Landroidx/compose/ui/node/DelegatingNode;-><init>()V
        modifier$Node0.p = delegatableNode0;
        ((DelegatingNode)modifier$Node0).delegate(delegatableNode0);
        return modifier$Node0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof IndicationModifierElement)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((IndicationModifierElement)object0).b) ? Intrinsics.areEqual(this.c, ((IndicationModifierElement)object0).c) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.c.hashCode() + this.b.hashCode() * 0x1F;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("indication");
        inspectorInfo0.getProperties().set("interactionSource", this.b);
        inspectorInfo0.getProperties().set("indication", this.c);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        DelegatableNode delegatableNode0 = this.c.create(this.b);
        ((i2)modifier$Node0).undelegate(((i2)modifier$Node0).p);
        ((i2)modifier$Node0).p = delegatableNode0;
        ((i2)modifier$Node0).delegate(delegatableNode0);
    }
}

