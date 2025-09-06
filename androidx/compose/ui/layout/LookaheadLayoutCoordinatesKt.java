package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001A\u00020\u0001*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"rootLookaheadDelegate", "Landroidx/compose/ui/node/LookaheadDelegate;", "getRootLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)Landroidx/compose/ui/node/LookaheadDelegate;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class LookaheadLayoutCoordinatesKt {
    @NotNull
    public static final LookaheadDelegate getRootLookaheadDelegate(@NotNull LookaheadDelegate lookaheadDelegate0) {
        LayoutNode layoutNode0 = lookaheadDelegate0.getLayoutNode();
        while(true) {
            LayoutNode layoutNode1 = layoutNode0.getParent$ui_release();
            LayoutNode layoutNode2 = null;
            if((layoutNode1 == null ? null : layoutNode1.getLookaheadRoot$ui_release()) == null) {
                break;
            }
            LayoutNode layoutNode3 = layoutNode0.getParent$ui_release();
            if(layoutNode3 != null) {
                layoutNode2 = layoutNode3.getLookaheadRoot$ui_release();
            }
            Intrinsics.checkNotNull(layoutNode2);
            if(layoutNode2.isVirtualLookaheadRoot$ui_release()) {
                layoutNode0 = layoutNode0.getParent$ui_release();
            }
            else {
                LayoutNode layoutNode4 = layoutNode0.getParent$ui_release();
                Intrinsics.checkNotNull(layoutNode4);
                layoutNode0 = layoutNode4.getLookaheadRoot$ui_release();
            }
            Intrinsics.checkNotNull(layoutNode0);
        }
        LookaheadDelegate lookaheadDelegate1 = layoutNode0.getOuterCoordinator$ui_release().getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate1);
        return lookaheadDelegate1;
    }
}

