package androidx.compose.ui.node;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function0 {
    public final LayoutNodeLayoutDelegate w;
    public final Owner x;
    public final long y;

    public q(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0, Owner owner0, long v) {
        this.w = layoutNodeLayoutDelegate0;
        this.x = owner0;
        this.y = v;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = this.w;
        PlacementScope placeable$PlacementScope0 = null;
        if(LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNodeLayoutDelegate0.a)) {
            NodeCoordinator nodeCoordinator0 = layoutNodeLayoutDelegate0.getOuterCoordinator().getWrappedBy$ui_release();
            if(nodeCoordinator0 != null) {
                placeable$PlacementScope0 = nodeCoordinator0.getPlacementScope();
            }
        }
        else {
            NodeCoordinator nodeCoordinator1 = layoutNodeLayoutDelegate0.getOuterCoordinator().getWrappedBy$ui_release();
            if(nodeCoordinator1 != null) {
                LookaheadDelegate lookaheadDelegate0 = nodeCoordinator1.getLookaheadDelegate();
                if(lookaheadDelegate0 != null) {
                    placeable$PlacementScope0 = lookaheadDelegate0.getPlacementScope();
                }
            }
        }
        if(placeable$PlacementScope0 == null) {
            placeable$PlacementScope0 = this.x.getPlacementScope();
        }
        LookaheadDelegate lookaheadDelegate1 = layoutNodeLayoutDelegate0.getOuterCoordinator().getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate1);
        PlacementScope.place-70tqf50$default(placeable$PlacementScope0, lookaheadDelegate1, this.y, 0.0f, 2, null);
        return Unit.INSTANCE;
    }
}

