package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;

public final class r3 extends Node implements LayoutModifierNode {
    public PaddingValues n;

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, Measurable measurable0, long v) {
        if(Dp.compareTo-0680j_4(this.n.calculateLeftPadding-u2uoSUM(measureScope0.getLayoutDirection()), 0.0f) < 0 || Dp.compareTo-0680j_4(this.n.calculateTopPadding-D9Ej5fM(), 0.0f) < 0 || Dp.compareTo-0680j_4(this.n.calculateRightPadding-u2uoSUM(measureScope0.getLayoutDirection()), 0.0f) < 0 || Dp.compareTo-0680j_4(this.n.calculateBottomPadding-D9Ej5fM(), 0.0f) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
        int v1 = measureScope0.roundToPx-0680j_4(this.n.calculateLeftPadding-u2uoSUM(measureScope0.getLayoutDirection()));
        int v2 = measureScope0.roundToPx-0680j_4(this.n.calculateRightPadding-u2uoSUM(measureScope0.getLayoutDirection())) + v1;
        int v3 = measureScope0.roundToPx-0680j_4(this.n.calculateTopPadding-D9Ej5fM());
        int v4 = measureScope0.roundToPx-0680j_4(this.n.calculateBottomPadding-D9Ej5fM()) + v3;
        Placeable placeable0 = measurable0.measure-BRTryo0(ConstraintsKt.offset-NN6Ew-U(v, -v2, -v4));
        return MeasureScope.layout$default(measureScope0, ConstraintsKt.constrainWidth-K40F9xA(v, placeable0.getWidth() + v2), ConstraintsKt.constrainHeight-K40F9xA(v, placeable0.getHeight() + v4), null, new q3(placeable0, measureScope0, this), 4, null);
    }
}

