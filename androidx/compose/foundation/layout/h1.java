package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.ranges.c;

public final class h1 extends Node implements LayoutModifierNode {
    public Direction n;
    public float o;

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, Measurable measurable0, long v) {
        int v4;
        int v3;
        int v2;
        int v1;
        if(!Constraints.getHasBoundedWidth-impl(v) || this.n == Direction.Vertical) {
            v1 = Constraints.getMinWidth-impl(v);
            v2 = Constraints.getMaxWidth-impl(v);
        }
        else {
            v1 = c.coerceIn(Math.round(((float)Constraints.getMaxWidth-impl(v)) * this.o), Constraints.getMinWidth-impl(v), Constraints.getMaxWidth-impl(v));
            v2 = v1;
        }
        if(!Constraints.getHasBoundedHeight-impl(v) || this.n == Direction.Horizontal) {
            v4 = Constraints.getMaxHeight-impl(v);
            v3 = Constraints.getMinHeight-impl(v);
        }
        else {
            v3 = c.coerceIn(Math.round(((float)Constraints.getMaxHeight-impl(v)) * this.o), Constraints.getMinHeight-impl(v), Constraints.getMaxHeight-impl(v));
            v4 = v3;
        }
        Placeable placeable0 = measurable0.measure-BRTryo0(ConstraintsKt.Constraints(v1, v2, v3, v4));
        return MeasureScope.layout$default(measureScope0, placeable0.getWidth(), placeable0.getHeight(), null, new g1(placeable0), 4, null);
    }
}

