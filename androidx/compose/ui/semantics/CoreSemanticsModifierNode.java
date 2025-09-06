package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.SemanticsModifierNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B0\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0017\u0010\n\u001A\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000B\u0010\fJ\u0013\u0010\r\u001A\u00020\b*\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000ER\"\u0010\u0004\u001A\u00020\u00038\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0005\u001A\u00020\u00038\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001A\u0004\b\u0005\u0010\u0012\"\u0004\b\u0016\u0010\u0014R3\u0010\n\u001A\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A\"\u0004\b\u001B\u0010\u001CR\u0014\u0010\u001E\u001A\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u0012R\u0014\u0010 \u001A\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001F\u0010\u0012¨\u0006!"}, d2 = {"Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "", "mergeDescendants", "isClearingSemantics", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "Lkotlin/ExtensionFunctionType;", "properties", "<init>", "(ZZLkotlin/jvm/functions/Function1;)V", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "n", "Z", "getMergeDescendants", "()Z", "setMergeDescendants", "(Z)V", "o", "setClearingSemantics", "p", "Lkotlin/jvm/functions/Function1;", "getProperties", "()Lkotlin/jvm/functions/Function1;", "setProperties", "(Lkotlin/jvm/functions/Function1;)V", "getShouldClearDescendantSemantics", "shouldClearDescendantSemantics", "getShouldMergeDescendantSemantics", "shouldMergeDescendantSemantics", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CoreSemanticsModifierNode extends Node implements SemanticsModifierNode {
    public static final int $stable = 8;
    public boolean n;
    public boolean o;
    public Function1 p;

    public CoreSemanticsModifierNode(boolean z, boolean z1, @NotNull Function1 function10) {
        this.n = z;
        this.o = z1;
        this.p = function10;
    }

    @Override  // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        this.p.invoke(semanticsPropertyReceiver0);
    }

    public final boolean getMergeDescendants() {
        return this.n;
    }

    @NotNull
    public final Function1 getProperties() {
        return this.p;
    }

    @Override  // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldClearDescendantSemantics() {
        return this.o;
    }

    @Override  // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return this.n;
    }

    public final boolean isClearingSemantics() {
        return this.o;
    }

    public final void setClearingSemantics(boolean z) {
        this.o = z;
    }

    public final void setMergeDescendants(boolean z) {
        this.n = z;
    }

    public final void setProperties(@NotNull Function1 function10) {
        this.p = function10;
    }
}

