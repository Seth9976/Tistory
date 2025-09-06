package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u000B\u001A\u00020\b8F¢\u0006\u0006\u001A\u0004\b\t\u0010\nR\u0011\u0010\r\u001A\u00020\b8F¢\u0006\u0006\u001A\u0004\b\f\u0010\n¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsOwner;", "", "Landroidx/compose/ui/node/LayoutNode;", "rootNode", "Landroidx/compose/ui/semantics/EmptySemanticsModifier;", "outerSemanticsNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/semantics/EmptySemanticsModifier;)V", "Landroidx/compose/ui/semantics/SemanticsNode;", "getRootSemanticsNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "rootSemanticsNode", "getUnmergedRootSemanticsNode", "unmergedRootSemanticsNode", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SemanticsOwner {
    public static final int $stable = 8;
    public final LayoutNode a;
    public final EmptySemanticsModifier b;

    public SemanticsOwner(@NotNull LayoutNode layoutNode0, @NotNull EmptySemanticsModifier emptySemanticsModifier0) {
        this.a = layoutNode0;
        this.b = emptySemanticsModifier0;
    }

    @NotNull
    public final SemanticsNode getRootSemanticsNode() {
        return SemanticsNodeKt.SemanticsNode(this.a, true);
    }

    @NotNull
    public final SemanticsNode getUnmergedRootSemanticsNode() {
        SemanticsConfiguration semanticsConfiguration0 = new SemanticsConfiguration();
        return new SemanticsNode(this.b, false, this.a, semanticsConfiguration0);
    }
}

