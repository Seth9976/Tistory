package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;

public final class n3 extends Node implements LayoutModifierNode {
    public float n;
    public float o;
    public float p;
    public float q;
    public boolean r;

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, Measurable measurable0, long v) {
        int v1 = measureScope0.roundToPx-0680j_4(this.n);
        int v2 = measureScope0.roundToPx-0680j_4(this.p) + v1;
        int v3 = measureScope0.roundToPx-0680j_4(this.o);
        int v4 = measureScope0.roundToPx-0680j_4(this.q) + v3;
        Placeable placeable0 = measurable0.measure-BRTryo0(ConstraintsKt.offset-NN6Ew-U(v, -v2, -v4));
        return MeasureScope.layout$default(measureScope0, ConstraintsKt.constrainWidth-K40F9xA(v, placeable0.getWidth() + v2), ConstraintsKt.constrainHeight-K40F9xA(v, placeable0.getHeight() + v4), null, new m3(this, placeable0, measureScope0), 4, null);
    }
}

