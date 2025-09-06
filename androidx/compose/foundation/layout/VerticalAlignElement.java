package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\u0007\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u0013\u0010\u000E\u001A\u00020\n*\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B¨\u0006\u001C"}, d2 = {"Landroidx/compose/foundation/layout/VerticalAlignElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/VerticalAlignNode;", "Landroidx/compose/ui/Alignment$Vertical;", "alignment", "<init>", "(Landroidx/compose/ui/Alignment$Vertical;)V", "create", "()Landroidx/compose/foundation/layout/VerticalAlignNode;", "node", "", "update", "(Landroidx/compose/foundation/layout/VerticalAlignNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/ui/Alignment$Vertical;", "getAlignment", "()Landroidx/compose/ui/Alignment$Vertical;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class VerticalAlignElement extends ModifierNodeElement {
    public static final int $stable;
    public final Vertical b;

    public VerticalAlignElement(@NotNull Vertical alignment$Vertical0) {
        this.b = alignment$Vertical0;
    }

    @NotNull
    public VerticalAlignNode create() {
        return new VerticalAlignNode(this.b);
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
        VerticalAlignElement verticalAlignElement0 = object0 instanceof VerticalAlignElement ? ((VerticalAlignElement)object0) : null;
        return verticalAlignElement0 == null ? false : Intrinsics.areEqual(this.b, verticalAlignElement0.b);
    }

    @NotNull
    public final Vertical getAlignment() {
        return this.b;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("align");
        inspectorInfo0.setValue(this.b);
    }

    public void update(@NotNull VerticalAlignNode verticalAlignNode0) {
        verticalAlignNode0.setVertical(this.b);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void update(Node modifier$Node0) {
        this.update(((VerticalAlignNode)modifier$Node0));
    }
}

