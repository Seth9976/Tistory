package androidx.compose.foundation.content;

import androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.content.internal.ReceiveContentDragAndDropNode_androidKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import org.jetbrains.annotations.NotNull;
import s.h1;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000F\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007R\"\u0010\u0005\u001A\u00020\u00048\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u0007R\u001A\u0010\u0014\u001A\u00020\u000F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/content/ReceiveContentNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/foundation/content/ReceiveContentListener;", "receiveContentListener", "<init>", "(Landroidx/compose/foundation/content/ReceiveContentListener;)V", "", "updateNode", "p", "Landroidx/compose/foundation/content/ReceiveContentListener;", "getReceiveContentListener", "()Landroidx/compose/foundation/content/ReceiveContentListener;", "setReceiveContentListener", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "q", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "providedValues", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ReceiveContentNode extends DelegatingNode implements ModifierLocalModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    public ReceiveContentListener p;
    public final ModifierLocalMap q;

    public ReceiveContentNode(@NotNull ReceiveContentListener receiveContentListener0) {
        this.p = receiveContentListener0;
        DynamicReceiveContentConfiguration dynamicReceiveContentConfiguration0 = new DynamicReceiveContentConfiguration(this);
        this.q = ModifierLocalModifierNodeKt.modifierLocalMapOf(TuplesKt.to(ReceiveContentConfigurationKt.getModifierLocalReceiveContent(), dynamicReceiveContentConfiguration0));
        this.delegate(ReceiveContentDragAndDropNode_androidKt.ReceiveContentDragAndDropNode(dynamicReceiveContentConfiguration0, new h1(this, 16)));
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalModifierNode
    @NotNull
    public ModifierLocalMap getProvidedValues() {
        return this.q;
    }

    @NotNull
    public final ReceiveContentListener getReceiveContentListener() {
        return this.p;
    }

    public final void setReceiveContentListener(@NotNull ReceiveContentListener receiveContentListener0) {
        this.p = receiveContentListener0;
    }

    public final void updateNode(@NotNull ReceiveContentListener receiveContentListener0) {
        this.p = receiveContentListener0;
    }
}

