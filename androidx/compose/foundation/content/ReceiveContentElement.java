package androidx.compose.foundation.content;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\u0007\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u0013\u0010\u000E\u001A\u00020\n*\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0012\u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001A\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001A\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001A\u0010\u001D\u001A\u00020\u001C2\b\u0010\u001B\u001A\u0004\u0018\u00010\u001AHÖ\u0003¢\u0006\u0004\b\u001D\u0010\u001ER\u0017\u0010\u0004\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\u0011¨\u0006\""}, d2 = {"Landroidx/compose/foundation/content/ReceiveContentElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/content/ReceiveContentNode;", "Landroidx/compose/foundation/content/ReceiveContentListener;", "receiveContentListener", "<init>", "(Landroidx/compose/foundation/content/ReceiveContentListener;)V", "create", "()Landroidx/compose/foundation/content/ReceiveContentNode;", "node", "", "update", "(Landroidx/compose/foundation/content/ReceiveContentNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1", "()Landroidx/compose/foundation/content/ReceiveContentListener;", "copy", "(Landroidx/compose/foundation/content/ReceiveContentListener;)Landroidx/compose/foundation/content/ReceiveContentElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/foundation/content/ReceiveContentListener;", "getReceiveContentListener", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ReceiveContentElement extends ModifierNodeElement {
    public static final int $stable;
    public final ReceiveContentListener b;

    public ReceiveContentElement(@NotNull ReceiveContentListener receiveContentListener0) {
        this.b = receiveContentListener0;
    }

    @NotNull
    public final ReceiveContentListener component1() {
        return this.b;
    }

    @NotNull
    public final ReceiveContentElement copy(@NotNull ReceiveContentListener receiveContentListener0) {
        return new ReceiveContentElement(receiveContentListener0);
    }

    public static ReceiveContentElement copy$default(ReceiveContentElement receiveContentElement0, ReceiveContentListener receiveContentListener0, int v, Object object0) {
        if((v & 1) != 0) {
            receiveContentListener0 = receiveContentElement0.b;
        }
        return receiveContentElement0.copy(receiveContentListener0);
    }

    @NotNull
    public ReceiveContentNode create() {
        return new ReceiveContentNode(this.b);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node create() {
        return this.create();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof ReceiveContentElement ? Intrinsics.areEqual(this.b, ((ReceiveContentElement)object0).b) : false;
    }

    @NotNull
    public final ReceiveContentListener getReceiveContentListener() {
        return this.b;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("receiveContent");
    }

    @Override
    @NotNull
    public String toString() {
        return "ReceiveContentElement(receiveContentListener=" + this.b + ')';
    }

    public void update(@NotNull ReceiveContentNode receiveContentNode0) {
        receiveContentNode0.updateNode(this.b);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void update(Node modifier$Node0) {
        this.update(((ReceiveContentNode)modifier$Node0));
    }
}

