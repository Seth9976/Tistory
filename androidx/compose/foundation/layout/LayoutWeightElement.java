package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u0013\u0010\u0010\u001A\u00020\f*\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001A\u0010\u0017\u001A\u00020\u00052\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 ¨\u0006!"}, d2 = {"Landroidx/compose/foundation/layout/LayoutWeightElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/LayoutWeightNode;", "", "weight", "", "fill", "<init>", "(FZ)V", "create", "()Landroidx/compose/foundation/layout/LayoutWeightNode;", "node", "", "update", "(Landroidx/compose/foundation/layout/LayoutWeightNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "F", "getWeight", "()F", "c", "Z", "getFill", "()Z", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LayoutWeightElement extends ModifierNodeElement {
    public static final int $stable;
    public final float b;
    public final boolean c;

    public LayoutWeightElement(float f, boolean z) {
        this.b = f;
        this.c = z;
    }

    @NotNull
    public LayoutWeightNode create() {
        return new LayoutWeightNode(this.b, this.c);
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
        LayoutWeightElement layoutWeightElement0 = object0 instanceof LayoutWeightElement ? ((LayoutWeightElement)object0) : null;
        return layoutWeightElement0 == null ? false : this.b == layoutWeightElement0.b && this.c == layoutWeightElement0.c;
    }

    public final boolean getFill() {
        return this.c;
    }

    public final float getWeight() {
        return this.b;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Boolean.hashCode(this.c) + Float.hashCode(this.b) * 0x1F;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("weight");
        inspectorInfo0.setValue(this.b);
        inspectorInfo0.getProperties().set("weight", this.b);
        inspectorInfo0.getProperties().set("fill", Boolean.valueOf(this.c));
    }

    public void update(@NotNull LayoutWeightNode layoutWeightNode0) {
        layoutWeightNode0.setWeight(this.b);
        layoutWeightNode0.setFill(this.c);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void update(Node modifier$Node0) {
        this.update(((LayoutWeightNode)modifier$Node0));
    }
}

