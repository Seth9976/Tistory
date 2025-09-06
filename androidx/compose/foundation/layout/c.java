package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.LayoutModifierNode;

public final class c extends Node implements LayoutModifierNode {
    public AlignmentLine n;
    public float o;
    public float p;

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, Measurable measurable0, long v) {
        return AlignmentLineKt.access$alignmentLineOffsetMeasure-tjqqzMA(measureScope0, this.n, this.o, this.p, measurable0, v);
    }
}

