package z1;

import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.ApproachMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock;

public final class c implements ApproachMeasureBlock {
    public final ApproachLayoutModifierNode a;

    public c(ApproachLayoutModifierNode approachLayoutModifierNode0) {
        this.a = approachLayoutModifierNode0;
    }

    @Override  // androidx.compose.ui.node.NodeMeasuringIntrinsics$ApproachMeasureBlock
    public final MeasureResult measure-3p2s80s(ApproachMeasureScope approachMeasureScope0, Measurable measurable0, long v) {
        return this.a.approachMeasure-3p2s80s(approachMeasureScope0, measurable0, v);
    }
}

