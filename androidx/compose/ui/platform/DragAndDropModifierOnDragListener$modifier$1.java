package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.draganddrop.DragAndDropNode;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001A\u00020\u0006*\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u001A\u0010\u0012\u001A\u00020\u00112\b\u0010\u0010\u001A\u0004\u0018\u00010\u000FH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"androidx/compose/ui/platform/DragAndDropModifierOnDragListener$modifier$1", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/draganddrop/DragAndDropNode;", "create", "()Landroidx/compose/ui/draganddrop/DragAndDropNode;", "node", "", "update", "(Landroidx/compose/ui/draganddrop/DragAndDropNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DragAndDropModifierOnDragListener.modifier.1 extends ModifierNodeElement {
    public final z0 b;

    public DragAndDropModifierOnDragListener.modifier.1(z0 z00) {
        this.b = z00;
        super();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node create() {
        return this.create();
    }

    @NotNull
    public DragAndDropNode create() {
        return this.b.b;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object object0) {
        return object0 == this;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.b.b.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("RootDragAndDropNode");
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void update(Node modifier$Node0) {
    }

    public void update(@NotNull DragAndDropNode dragAndDropNode0) {
    }
}

