package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.internal.Intrinsics;

public final class i extends LookaheadDelegate {
    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final int calculateAlignmentLine(AlignmentLine alignmentLine0) {
        Integer integer0 = (Integer)this.getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine0);
        int v = integer0 == null ? 0x80000000 : ((int)integer0);
        this.getCachedAlignmentLinesMap().put(alignmentLine0, v);
        return v;
    }

    @Override  // androidx.compose.ui.node.LookaheadDelegate
    public final int maxIntrinsicHeight(int v) {
        return this.getLayoutNode().maxLookaheadIntrinsicHeight(v);
    }

    @Override  // androidx.compose.ui.node.LookaheadDelegate
    public final int maxIntrinsicWidth(int v) {
        return this.getLayoutNode().maxLookaheadIntrinsicWidth(v);
    }

    @Override  // androidx.compose.ui.layout.Measurable
    public final Placeable measure-BRTryo0(long v) {
        this.setMeasurementConstraints-BRTryo0(v);
        MutableVector mutableVector0 = this.getLayoutNode().get_children$ui_release();
        int v1 = mutableVector0.getSize();
        if(v1 > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v2 = 0;
            while(true) {
                LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = ((LayoutNode)arr_object[v2]).getLookaheadPassDelegate$ui_release();
                Intrinsics.checkNotNull(layoutNodeLayoutDelegate$LookaheadPassDelegate0);
                layoutNodeLayoutDelegate$LookaheadPassDelegate0.setMeasuredByParent$ui_release(UsageByParent.NotUsed);
                ++v2;
                if(v2 >= v1) {
                    break;
                }
            }
        }
        LookaheadDelegate.access$set_measureResult(this, this.getLayoutNode().getMeasurePolicy().measure-3p2s80s(this, this.getLayoutNode().getChildLookaheadMeasurables$ui_release(), v));
        return this;
    }

    @Override  // androidx.compose.ui.node.LookaheadDelegate
    public final int minIntrinsicHeight(int v) {
        return this.getLayoutNode().minLookaheadIntrinsicHeight(v);
    }

    @Override  // androidx.compose.ui.node.LookaheadDelegate
    public final int minIntrinsicWidth(int v) {
        return this.getLayoutNode().minLookaheadIntrinsicWidth(v);
    }

    @Override  // androidx.compose.ui.node.LookaheadDelegate
    public final void placeChildren() {
        LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = this.getLayoutNode().getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(layoutNodeLayoutDelegate$LookaheadPassDelegate0);
        layoutNodeLayoutDelegate$LookaheadPassDelegate0.onNodePlaced$ui_release();
    }
}

