package androidx.compose.ui.node;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;

public final class k implements MeasureBlock {
    public final LayoutModifierNode a;

    public k(LayoutModifierNode layoutModifierNode0) {
        this.a = layoutModifierNode0;
    }

    @Override  // androidx.compose.ui.node.NodeMeasuringIntrinsics$MeasureBlock
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, Measurable measurable0, long v) {
        return this.a.measure-3p2s80s(measureScope0, measurable0, v);
    }
}

