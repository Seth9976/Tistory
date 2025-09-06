package androidx.compose.ui.node;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001A\n\u0010\u0000\u001A\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"invalidateParentData", "", "Landroidx/compose/ui/node/ParentDataModifierNode;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ParentDataModifierNodeKt {
    public static final void invalidateParentData(@NotNull ParentDataModifierNode parentDataModifierNode0) {
        DelegatableNodeKt.requireLayoutNode(parentDataModifierNode0).invalidateParentData$ui_release();
    }
}

