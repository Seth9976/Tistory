package androidx.compose.ui.node;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\f\u0010\b\u001A\u00020\t*\u00020\nH&R\u0014\u0010\u0002\u001A\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001A\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000BÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/DelegatableNode;", "shouldClearDescendantSemantics", "", "getShouldClearDescendantSemantics", "()Z", "shouldMergeDescendantSemantics", "getShouldMergeDescendantSemantics", "applySemantics", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface SemanticsModifierNode extends DelegatableNode {
    void applySemantics(@NotNull SemanticsPropertyReceiver arg1);

    default boolean getShouldClearDescendantSemantics() {
        return false;
    }

    default boolean getShouldMergeDescendantSemantics() {
        return false;
    }
}

