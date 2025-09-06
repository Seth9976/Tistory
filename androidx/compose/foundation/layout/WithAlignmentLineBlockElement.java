package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001B\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u001A\u0010\u0012\u001A\u00020\u00112\b\u0010\u0010\u001A\u0004\u0018\u00010\u000FH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0014\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001A\u00020\f*\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001C¨\u0006\u001D"}, d2 = {"Landroidx/compose/foundation/layout/WithAlignmentLineBlockElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/SiblingsAlignedNode$WithAlignmentLineBlockNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "", "block", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "create", "()Landroidx/compose/foundation/layout/SiblingsAlignedNode$WithAlignmentLineBlockNode;", "node", "", "update", "(Landroidx/compose/foundation/layout/SiblingsAlignedNode$WithAlignmentLineBlockNode;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "b", "Lkotlin/jvm/functions/Function1;", "getBlock", "()Lkotlin/jvm/functions/Function1;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class WithAlignmentLineBlockElement extends ModifierNodeElement {
    public static final int $stable;
    public final Function1 b;

    public WithAlignmentLineBlockElement(@NotNull Function1 function10) {
        this.b = function10;
    }

    @NotNull
    public WithAlignmentLineBlockNode create() {
        return new WithAlignmentLineBlockNode(this.b);
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
        WithAlignmentLineBlockElement withAlignmentLineBlockElement0 = object0 instanceof WithAlignmentLineBlockElement ? ((WithAlignmentLineBlockElement)object0) : null;
        return withAlignmentLineBlockElement0 == null ? false : this.b == withAlignmentLineBlockElement0.b;
    }

    @NotNull
    public final Function1 getBlock() {
        return this.b;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("alignBy");
        inspectorInfo0.setValue(this.b);
    }

    public void update(@NotNull WithAlignmentLineBlockNode siblingsAlignedNode$WithAlignmentLineBlockNode0) {
        siblingsAlignedNode$WithAlignmentLineBlockNode0.setBlock(this.b);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void update(Node modifier$Node0) {
        this.update(((WithAlignmentLineBlockNode)modifier$Node0));
    }
}

