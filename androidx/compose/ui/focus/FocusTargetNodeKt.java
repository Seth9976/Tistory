package androidx.compose.ui.focus;

import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A\u0013\u0010\u0002\u001A\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001A\u0013\u0010\u0005\u001A\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusTransactionManager;", "requireTransactionManager", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTransactionManager;", "", "invalidateFocusTarget", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class FocusTargetNodeKt {
    public static final FocusTransactionManager access$getFocusTransactionManager(FocusTargetNode focusTargetNode0) {
        NodeCoordinator nodeCoordinator0 = focusTargetNode0.getNode().getCoordinator$ui_release();
        if(nodeCoordinator0 != null) {
            LayoutNode layoutNode0 = nodeCoordinator0.getLayoutNode();
            if(layoutNode0 != null) {
                Owner owner0 = layoutNode0.getOwner$ui_release();
                if(owner0 != null) {
                    FocusOwner focusOwner0 = owner0.getFocusOwner();
                    return focusOwner0 == null ? null : focusOwner0.getFocusTransactionManager();
                }
            }
        }
        return null;
    }

    public static final void invalidateFocusTarget(@NotNull FocusTargetNode focusTargetNode0) {
        DelegatableNodeKt.requireOwner(focusTargetNode0).getFocusOwner().scheduleInvalidation(focusTargetNode0);
    }

    @NotNull
    public static final FocusTransactionManager requireTransactionManager(@NotNull FocusTargetNode focusTargetNode0) {
        return DelegatableNodeKt.requireOwner(focusTargetNode0).getFocusOwner().getFocusTransactionManager();
    }
}

