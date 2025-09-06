package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.TextUnitKt;

public final class d extends Node implements LayoutModifierNode {
    public AlignmentLine n;
    public long o;
    public long p;

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, Measurable measurable0, long v) {
        AlignmentLine alignmentLine0 = this.n;
        float f = TextUnitKt.isUnspecified--R2X_6o(this.o) ? NaNf : measureScope0.toDp-GaN1DYA(this.o);
        return TextUnitKt.isUnspecified--R2X_6o(this.p) ? AlignmentLineKt.access$alignmentLineOffsetMeasure-tjqqzMA(measureScope0, alignmentLine0, f, NaNf, measurable0, v) : AlignmentLineKt.access$alignmentLineOffsetMeasure-tjqqzMA(measureScope0, alignmentLine0, f, measureScope0.toDp-GaN1DYA(this.p), measurable0, v);
    }
}

