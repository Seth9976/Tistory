package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.c;

public final class x4 extends Node implements LayoutModifierNode {
    public Direction n;
    public boolean o;
    public Lambda p;

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, Measurable measurable0, long v) {
        Direction direction0 = Direction.Vertical;
        int v1 = 0;
        int v2 = this.n == direction0 ? Constraints.getMinWidth-impl(v) : 0;
        Direction direction1 = Direction.Horizontal;
        if(this.n == direction1) {
            v1 = Constraints.getMinHeight-impl(v);
        }
        int v3 = 0x7FFFFFFF;
        int v4 = this.n == direction0 || !this.o ? Constraints.getMaxWidth-impl(v) : 0x7FFFFFFF;
        if(this.n == direction1 || !this.o) {
            v3 = Constraints.getMaxHeight-impl(v);
        }
        Placeable placeable0 = measurable0.measure-BRTryo0(ConstraintsKt.Constraints(v2, v4, v1, v3));
        int v5 = c.coerceIn(placeable0.getWidth(), Constraints.getMinWidth-impl(v), Constraints.getMaxWidth-impl(v));
        int v6 = c.coerceIn(placeable0.getHeight(), Constraints.getMinHeight-impl(v), Constraints.getMaxHeight-impl(v));
        return MeasureScope.layout$default(measureScope0, v5, v6, null, new w4(this, v5, placeable0, v6, measureScope0), 4, null);
    }
}

