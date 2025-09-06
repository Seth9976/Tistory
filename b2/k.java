package b2;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNodeCoordinator;
import androidx.compose.ui.node.LayoutModifierNodeCoordinatorKt;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.internal.Intrinsics;

public final class k extends LookaheadDelegate {
    public final LayoutModifierNodeCoordinator t;

    public k(LayoutModifierNodeCoordinator layoutModifierNodeCoordinator0) {
        this.t = layoutModifierNodeCoordinator0;
        super(layoutModifierNodeCoordinator0);
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final int calculateAlignmentLine(AlignmentLine alignmentLine0) {
        int v = LayoutModifierNodeCoordinatorKt.access$calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine0);
        this.getCachedAlignmentLinesMap().put(alignmentLine0, v);
        return v;
    }

    @Override  // androidx.compose.ui.node.LookaheadDelegate
    public final int maxIntrinsicHeight(int v) {
        LookaheadDelegate lookaheadDelegate0 = this.t.getWrappedNonNull().getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate0);
        return this.t.getLayoutModifierNode().maxIntrinsicHeight(this, lookaheadDelegate0, v);
    }

    @Override  // androidx.compose.ui.node.LookaheadDelegate
    public final int maxIntrinsicWidth(int v) {
        LookaheadDelegate lookaheadDelegate0 = this.t.getWrappedNonNull().getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate0);
        return this.t.getLayoutModifierNode().maxIntrinsicWidth(this, lookaheadDelegate0, v);
    }

    @Override  // androidx.compose.ui.layout.Measurable
    public final Placeable measure-BRTryo0(long v) {
        this.setMeasurementConstraints-BRTryo0(v);
        Constraints constraints0 = Constraints.box-impl(v);
        this.t.setLookaheadConstraints-_Sx5XlM$ui_release(constraints0);
        LookaheadDelegate lookaheadDelegate0 = this.t.getWrappedNonNull().getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate0);
        LookaheadDelegate.access$set_measureResult(this, this.t.getLayoutModifierNode().measure-3p2s80s(this, lookaheadDelegate0, v));
        return this;
    }

    @Override  // androidx.compose.ui.node.LookaheadDelegate
    public final int minIntrinsicHeight(int v) {
        LookaheadDelegate lookaheadDelegate0 = this.t.getWrappedNonNull().getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate0);
        return this.t.getLayoutModifierNode().minIntrinsicHeight(this, lookaheadDelegate0, v);
    }

    @Override  // androidx.compose.ui.node.LookaheadDelegate
    public final int minIntrinsicWidth(int v) {
        LookaheadDelegate lookaheadDelegate0 = this.t.getWrappedNonNull().getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate0);
        return this.t.getLayoutModifierNode().minIntrinsicWidth(this, lookaheadDelegate0, v);
    }
}

